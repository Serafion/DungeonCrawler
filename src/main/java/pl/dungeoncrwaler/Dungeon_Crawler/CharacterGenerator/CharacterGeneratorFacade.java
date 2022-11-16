package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import lombok.extern.slf4j.Slf4j;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.repository.PlayerRepository;

import java.util.Optional;

@Slf4j
public class CharacterGeneratorFacade {

    private final PlayerRepository playerRepository;
    private final StatGenerator statGenerator;
    private final NickNameGenerator nickNameGenerator;
    private final NameGenerator nameGenerator;

    public CharacterGeneratorFacade(PlayerRepository playerRepository, StatGenerator statGenerator, NickNameGenerator nickNameGenerator, NameGenerator nameGenerator) {
        this.playerRepository = playerRepository;
        this.statGenerator = statGenerator;
        this.nickNameGenerator = nickNameGenerator;
        this.nameGenerator = nameGenerator;
    }

    public PlayerCharacter generateRandomPlayer(){
        NickName nick = nickNameGenerator.generateNickName();

        PlayerCharacter generatedPlayerCharacter = new PlayerCharacter(nameGenerator.generateName(),
                          nick,
                          statGenerator.generateStat("health",nick),
                          statGenerator.generateStat("attack",nick),
                          statGenerator.generateStat("defence",nick),
                          statGenerator.generateStat("runPossibility",nick));
        log.info("Generated character: "+ generatedPlayerCharacter.getName()+" "+ generatedPlayerCharacter.getId()+" "+ generatedPlayerCharacter.getDefence());
        playerRepository.save(generatedPlayerCharacter);
        return playerRepository.findById(generatedPlayerCharacter.getId()).isPresent() ? playerRepository.findById(generatedPlayerCharacter.getId()).get() : null;
    }

    public Optional<PlayerCharacter> getPlayer(Long id){
        return playerRepository.findById(id);
    }
}
