package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.repository.PlayerRepository;

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

    public Player generateRandomPlayer(){
        NickName nick = nickNameGenerator.generateNickName();
        Player generatedPlayer = new Player(nameGenerator.generateName(),
                          nick,
                          statGenerator.generateStat("health",nick),
                          statGenerator.generateStat("attack",nick),
                          statGenerator.generateStat("defence",nick),
                          statGenerator.generateStat("runPossibility",nick));
        System.out.println("player generated");
        return playerRepository.findById(generatedPlayer.getId()).isPresent() ? playerRepository.findById(generatedPlayer.getId()).get() : null;
    }
}
