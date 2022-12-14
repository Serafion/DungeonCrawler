package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.DragonFactory;

import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Attack;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Monster;

import java.util.List;

class Dragon extends Monster {
    public Dragon(String name, List<Attack> attacks, Integer health, Integer power, Integer defence) {
        super(name, attacks, health, power, defence);
    }
}
