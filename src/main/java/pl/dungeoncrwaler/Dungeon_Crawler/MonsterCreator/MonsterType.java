package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator;

import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.DragonFactory.DragonFactory;

//enum extendable to new monster types
public enum MonsterType {
    Dragon(new DragonFactory());

    private final MonsterFactory monsterFactory;

    MonsterType(DragonFactory i) {
        this.monsterFactory = i;
    }

    public static MonsterType getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }

    public MonsterFactory getMonsterFactory() {
        return monsterFactory;
    }
}
