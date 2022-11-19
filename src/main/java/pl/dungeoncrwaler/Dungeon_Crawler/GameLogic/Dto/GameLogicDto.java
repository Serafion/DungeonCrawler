package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GameLogicDto {
    UUID uuid;
    String  monsterName;
    Integer monsterCurrentHealth;
    Integer monsterMaxHealth;
    Integer playerCurrentHealth;
    Integer playerMaxHealth;
    String message;

    public void setMessage(String message) {
        this.message = message;
    }
}
