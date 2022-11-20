package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model;

import javax.persistence.Embeddable;
import java.util.UUID;

@Embeddable
public class MonsterAttack {

    UUID gameId;
    String monsterAttack;
    Integer attackPower;

}
