package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class PlayerCharacter {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameOfCharacter;

    @Column(columnDefinition = "BIGINT")
    private NickName nickName;
    @Column(columnDefinition = "BIGINT")
    private Integer maxHealth;
    @Column(columnDefinition = "BIGINT")
    private Integer attackPower;
    @Column(columnDefinition = "BIGINT")
    private Integer defence;
    @Column(columnDefinition = "BIGINT")
    private Integer runPossibility;

    public PlayerCharacter(String name, NickName nickName, Integer maxHealth, Integer attackPower, Integer defence, Integer runPossibility) {
        this.nameOfCharacter = name;
        this.nickName = nickName;
        this.maxHealth = maxHealth;
        this.attackPower = attackPower;
        this.defence = defence;
        this.runPossibility = runPossibility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerCharacter playerCharacter = (PlayerCharacter) o;

        if (id != null ? !id.equals(playerCharacter.id) : playerCharacter.id != null) return false;
        if (nameOfCharacter != null ? !nameOfCharacter.equals(playerCharacter.nameOfCharacter) : playerCharacter.nameOfCharacter != null)
            return false;
        if (nickName != playerCharacter.nickName) return false;
        if (maxHealth != null ? !maxHealth.equals(playerCharacter.maxHealth) : playerCharacter.maxHealth != null)
            return false;
        if (attackPower != null ? !attackPower.equals(playerCharacter.attackPower) : playerCharacter.attackPower != null)
            return false;
        if (defence != null ? !defence.equals(playerCharacter.defence) : playerCharacter.defence != null) return false;
        return runPossibility != null ? runPossibility.equals(playerCharacter.runPossibility) : playerCharacter.runPossibility == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nameOfCharacter != null ? nameOfCharacter.hashCode() : 0);
//        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (maxHealth != null ? maxHealth.hashCode() : 0);
        result = 31 * result + (attackPower != null ? attackPower.hashCode() : 0);
        result = 31 * result + (defence != null ? defence.hashCode() : 0);
        result = 31 * result + (runPossibility != null ? runPossibility.hashCode() : 0);
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return nameOfCharacter;
    }

    public void setName(String name) {
        this.nameOfCharacter = name;
    }

    public NickName getNickName() {
        return nickName;
    }

    public void setNickName(NickName nickName) {
        this.nickName = nickName;
    }

    public Integer getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(Integer maxHealth) {
        this.maxHealth = maxHealth;
    }

    public Integer getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(Integer attackPower) {
        this.attackPower = attackPower;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Integer getRunPossibility() {
        return runPossibility;
    }

    public void setRunPossibility(Integer runPossibility) {
        this.runPossibility = runPossibility;
    }
}
