package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.GoblinFactory;

import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Attack;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Monster;

import java.util.List;

class Goblin extends Monster {

    public Goblin(String name, List<Attack> attacks, Integer health, Integer power, Integer defence) {
        super(name, attacks, health, power, defence);
    }

}
