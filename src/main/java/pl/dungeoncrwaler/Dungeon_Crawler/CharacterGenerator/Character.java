package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Created_Players_Basic_Data")
@NoArgsConstructor
public class Character {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "[id]", nullable = false)
    private Long id;

    private String  nameOfCharacter;

    private NickName nickName;
    private Integer maxHealth;
    private Integer attackPower;
    private Integer defence;
    private Integer runPossibility;

    public Character(String name,NickName nickName, Integer maxHealth, Integer attackPower, Integer defence, Integer runPossibility) {
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

        Character character = (Character) o;

        if (id != null ? !id.equals(character.id) : character.id != null) return false;
        if (nameOfCharacter != null ? !nameOfCharacter.equals(character.nameOfCharacter) : character.nameOfCharacter != null) return false;
//        if (nickName != character.nickName) return false;
        if (maxHealth != null ? !maxHealth.equals(character.maxHealth) : character.maxHealth != null) return false;
        if (attackPower != null ? !attackPower.equals(character.attackPower) : character.attackPower != null)
            return false;
        if (defence != null ? !defence.equals(character.defence) : character.defence != null) return false;
        return runPossibility != null ? runPossibility.equals(character.runPossibility) : character.runPossibility == null;
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
        this.id=id;
    }

    public String getName() {
        return nameOfCharacter;
    }


    public NickName getNickName() {
        return nickName;
    }

    public Integer getMaxHealth() {
        return maxHealth;
    }

    public Integer getAttackPower() {
        return attackPower;
    }


    public Integer getDefence() {
        return defence;
    }

    public Integer getRunPossibility() {
        return runPossibility;
    }

    public void setName(String name) {
        this.nameOfCharacter = name;
    }

    public void setNickName(NickName nickName) {
        this.nickName = nickName;
    }

    public void setMaxHealth(Integer maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setAttackPower(Integer attackPower) {
        this.attackPower = attackPower;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public void setRunPossibility(Integer runPossibility) {
        this.runPossibility = runPossibility;
    }
}
