package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator;

import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.DragonFactory.DragonFactory;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.GoblinFactory.GoblinFactory;

//enum extendable to new monster types
public enum MonsterType {
    Dragon(new DragonFactory()),
    Goblin(new GoblinFactory());

    private final MonsterFactory monsterFactory;

    MonsterType(MonsterFactory i) {
        this.monsterFactory = i;
    }

    public static MonsterType getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }

    public MonsterFactory getMonsterFactory() {
        return monsterFactory;
    }
}
