package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Player {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String  name;
    private NickName nickName;
    private Integer maxHealth;
    private Integer attackPower;
    private Integer defence;
    private Integer runPossibility;

    public Player(String name, NickName nickName, Integer maxHealth, Integer attackPower, Integer defence, Integer runPossibility) {
        this.name = name;
        this.nickName = nickName;
        this.maxHealth = maxHealth;
        this.attackPower = attackPower;
        this.defence = defence;
        this.runPossibility = runPossibility;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getName() {
        return name;
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
}
