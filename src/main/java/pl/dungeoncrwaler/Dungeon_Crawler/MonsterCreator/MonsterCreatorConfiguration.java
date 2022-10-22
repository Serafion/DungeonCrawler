package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator;

public class MonsterCreatorConfiguration {
    public MonsterCreatorFacade monsterCreatorFacadeTest() {
        MonsterMapper monsterMapper = new MonsterMapper();
        return new MonsterCreatorFacade(monsterMapper);
    }
}
