package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator;

import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterDto.MonsterDto;

public class MonsterCreatorFacade {


    private final MonsterMapper monsterMapper;

    public MonsterCreatorFacade(MonsterMapper monsterMapper) {
        this.monsterMapper = monsterMapper;
    }

    public MonsterDto generateRandomMonster() {
        MonsterType monsterType = MonsterType.getRandom();
        MonsterFactory factory = monsterType.getMonsterFactory();
        return monsterMapper.toDto(factory.generateRandomMonster());
    }
    public MonsterDto generateConcreteMonster(String monsterType, String monsterName){
        MonsterType type = MonsterType.valueOf(monsterType);
        MonsterFactory factory = type.getMonsterFactory();
        return monsterMapper.toDto(factory.generateSpecificMonster(monsterName));
    }
}
