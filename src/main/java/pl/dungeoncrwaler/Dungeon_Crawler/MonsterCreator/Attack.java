package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Embeddable
public class Attack {
    String attackName;
    Integer attackPower;



}
