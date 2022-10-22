package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator;

import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterDto.MonsterDto;

public class MonsterMapper {

    public MonsterDto toDto(Monster monster){
        return new MonsterDto(monster.getName(), monster.getHealth(), monster.getPower(), monster.getDefence(), monster.getAttacks());
    }
}
