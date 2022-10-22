package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator;

import java.util.List;

public abstract class Monster {

    String name;
    List<Attack> attacks;
    Integer health;
    Integer power;
    Integer defence;

    public abstract String getName();
    public abstract List<Attack> getAttacks();
    public abstract Integer getHealth();
    public abstract Integer getPower();
    public abstract Integer getDefence();

}
