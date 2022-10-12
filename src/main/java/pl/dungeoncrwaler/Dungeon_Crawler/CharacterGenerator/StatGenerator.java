package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import org.springframework.stereotype.Component;

@Component
class StatGenerator {

    private final Generable attackPowerGenerator;
    private final Generable defenceGenerator;
    private final Generable runPossibilityGenerator;
    private final Generable maxHealthGenerator;


    public StatGenerator(Generable attackPowerGenerator, Generable defenceGenerator, Generable runPossibilityGenerator, Generable maxHealthGenerator) {
        this.attackPowerGenerator = attackPowerGenerator;
        this.defenceGenerator = defenceGenerator;
        this.runPossibilityGenerator = runPossibilityGenerator;
        this.maxHealthGenerator = maxHealthGenerator;
    }

    public Integer generateStat(String stat, NickName nickName){
        return switch (stat) {
            case "attack" -> attackPowerGenerator.generate(nickName);
            case "defence" -> defenceGenerator.generate(nickName);
            case "health" -> maxHealthGenerator.generate(nickName);
            case "runPossibility" -> runPossibilityGenerator.generate(nickName);
            default -> -1;
        };
     }
}
