package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.DragonFactory;

import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Attack;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Monster;

import java.util.List;

class Dragon extends Monster {

    private final String name;
    private final List<Attack> attacks;
    private final Integer health;
    private final Integer power;
    private final Integer defence;

    public Dragon(String name, List<Attack> attacks, Integer health, Integer power, Integer defence) {
        this.name = name;
        this.attacks = attacks;
        this.health = health;
        this.power = power;
        this.defence = defence;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Attack> getAttacks() {
        return attacks;
    }

    @Override
    public Integer getHealth() {
        return health;
    }

    @Override
    public Integer getPower() {
        return power;
    }

    @Override
    public Integer getDefence() {
        return defence;
    }
}
