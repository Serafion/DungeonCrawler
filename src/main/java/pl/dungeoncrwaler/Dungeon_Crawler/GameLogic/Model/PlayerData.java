package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PlayerData {
    private Long id;
    private String nameOfCharacter;
    private Integer currentHealth;
    private Integer maxHealth;
    private Integer attackPower;
    private Integer defence;
    private Integer runPossibility;
}
