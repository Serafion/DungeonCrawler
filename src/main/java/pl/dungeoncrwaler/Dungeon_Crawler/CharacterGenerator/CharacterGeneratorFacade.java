package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.repository.PlayerRepository;

import java.util.Optional;

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

    public Character generateRandomPlayer(){
        NickName nick = nickNameGenerator.generateNickName();
        Character generatedCharacter = new Character(nameGenerator.generateName(),
                          nick,
                          statGenerator.generateStat("health",nick),
                          statGenerator.generateStat("attack",nick),
                          statGenerator.generateStat("defence",nick),
                          statGenerator.generateStat("runPossibility",nick));
        playerRepository.save(generatedCharacter);
        return playerRepository.findById(generatedCharacter.getId()).isPresent() ? playerRepository.findById(generatedCharacter.getId()).get() : null;
    }

    public Optional<Character> getPlayer(Long id){
        return playerRepository.findById(id);
    }
}
