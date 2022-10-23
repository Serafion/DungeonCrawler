package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator;

import java.util.List;

public abstract class Monster {

    protected String name;
    protected List<Attack> attacks;
    protected Integer health;
    protected Integer power;
    protected Integer defence;

    public Monster(String name, List<Attack> attacks, Integer health, Integer power, Integer defence) {
        this.name = name;
        this.attacks = attacks;
        this.health = health;
        this.power = power;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getDefence() {
        return defence;
    }

}
