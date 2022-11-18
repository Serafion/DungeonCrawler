package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class SingleGame {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;
    private MonsterData monsterData;
    private PlayerData playerData;

    public SingleGame(UUID id, MonsterData monsterData, PlayerData playerData) {
        this.id = id;
        this.monsterData = monsterData;
        this.playerData = playerData;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public MonsterData getMonsterData() {
        return monsterData;
    }

    public PlayerData getPlayerData() {
        return playerData;
    }

    public void setMonsterData(MonsterData monsterData) {
        this.monsterData = monsterData;
    }

    public void setPlayerData(PlayerData playerData) {
        this.playerData = playerData;
    }
}
