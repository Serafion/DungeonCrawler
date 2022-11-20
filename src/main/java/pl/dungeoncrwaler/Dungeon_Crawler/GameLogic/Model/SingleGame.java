package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AttributeOverrides({
        @AttributeOverride(
                name = "MonsterData.monsterName",
                column = @Column(name = "monsterName", columnDefinition = "VARCHAR(255)")

        ),
        @AttributeOverride(
                name = "MonsterData.currentHealth",
                column = @Column(name = "monsterCurrentHealth", columnDefinition = "BIGINT")
        ),
        @AttributeOverride(
                name = "MonsterData.maxHealth",
                column = @Column(name = "monsterMaxHealth", columnDefinition = "BIGINT")
        ),
        @AttributeOverride(
                name = "MonsterData.attack",
                column = @Column(name = "monsterAttack", columnDefinition = "BIGINT")
        ),
        @AttributeOverride(
                name = "MonsterData.defence",
                column = @Column(name = "monsterDefence", columnDefinition = "BIGINT")
        ),
        @AttributeOverride(
                name = "MonsterData.attacks",
                column = @Column(name = "monsterAttacks")
        ),
        @AttributeOverride(
                name = "PlayerData.id",
                column = @Column(name = "playerId", columnDefinition = "BIGINT")
        ),
        @AttributeOverride(
                name = "PlayerData.nameOfCharacter",
                column = @Column(name = "playerName", columnDefinition = "VARCHAR(255)")),
        @AttributeOverride(
                name = "PlayerData.currentHealth",
                column = @Column(name = "playerCurrentHealth", columnDefinition = "BIGINT")
        ),
        @AttributeOverride(
                name = "PlayerData.maxHealth",
                column = @Column(name = "playerMaxHealth", columnDefinition = "BIGINT")),
        @AttributeOverride(
                name = "PlayerData.attackPower",
                column = @Column(name = "playerAttack", columnDefinition = "BIGINT")
        ),
        @AttributeOverride(
                name = "PlayerData.defence",
                column = @Column(name = "playerDefence", columnDefinition = "BIGINT")),
        @AttributeOverride(
                name = "PlayerData.runPossibility",
                column = @Column(name = "playerRunPossibility", columnDefinition = "BIGINT")

)})

public class SingleGame {
    @Id
    @Column(name = "id", nullable = false, columnDefinition = "VARCHAR(36)")
    private UUID id;
    @Embedded
    private MonsterData monsterData;
    @Embedded
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

    public void setMonsterData(MonsterData monsterData) {
        this.monsterData = monsterData;
    }

    public PlayerData getPlayerData() {
        return playerData;
    }

    public void setPlayerData(PlayerData playerData) {
        this.playerData = playerData;
    }
}
