package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MonsterData {
    private String monsterName;
    private Integer currentHealth;
    private Integer MaxHealth;
    private Integer Attack;
    private Integer Defence;
    private List<pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Attack> attacks;
}
