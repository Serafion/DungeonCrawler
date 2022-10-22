package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator;

import java.util.Random;

public abstract class MonsterFactory {

    public Random random = new Random();
    public abstract Monster generateSpecificMonster(String type);
    public abstract Monster generateRandomMonster();
}
