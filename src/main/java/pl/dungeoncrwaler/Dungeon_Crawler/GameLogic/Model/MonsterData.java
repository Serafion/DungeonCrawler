package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class MonsterData {
    @Column(name="monster_name", columnDefinition="VARCHAR(255)")
    private String monsterName;
    @Column(name = "current_monster_health", columnDefinition = "BIGINT")
    private Integer currentMonsterHealth;
    @Column(name = "max_monster_health", columnDefinition = "BIGINT")
    private Integer maxMonsterHealth;
    @Column(name = "attack_monster_value", columnDefinition = "BIGINT")
    private Integer attackMonsterValue;
    @Column(name = "defence_monster_value", columnDefinition = "BIGINT")
    private Integer defenceMonsterValue;

    @ElementCollection
    private List<pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Attack> attacks;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MonsterData that = (MonsterData) o;

        if (monsterName != null ? !monsterName.equals(that.monsterName) : that.monsterName != null) return false;
        if (currentMonsterHealth != null ? !currentMonsterHealth.equals(that.currentMonsterHealth) : that.currentMonsterHealth != null)
            return false;
        if (maxMonsterHealth != null ? !maxMonsterHealth.equals(that.maxMonsterHealth) : that.maxMonsterHealth != null) return false;
        if (attackMonsterValue != null ? !attackMonsterValue.equals(that.attackMonsterValue) : that.attackMonsterValue != null) return false;
        if (defenceMonsterValue != null ? !defenceMonsterValue.equals(that.defenceMonsterValue) : that.defenceMonsterValue != null) return false;
        return attacks != null ? attacks.equals(that.attacks) : that.attacks == null;
    }

    @Override
    public int hashCode() {
        int result = monsterName != null ? monsterName.hashCode() : 0;
        result = 31 * result + (currentMonsterHealth != null ? currentMonsterHealth.hashCode() : 0);
        result = 31 * result + (maxMonsterHealth != null ? maxMonsterHealth.hashCode() : 0);
        result = 31 * result + (attackMonsterValue != null ? attackMonsterValue.hashCode() : 0);
        result = 31 * result + (defenceMonsterValue != null ? defenceMonsterValue.hashCode() : 0);
        result = 31 * result + (attacks != null ? attacks.hashCode() : 0);
        return result;
    }
}
