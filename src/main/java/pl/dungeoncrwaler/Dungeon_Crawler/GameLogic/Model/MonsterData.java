package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class MonsterData {
    private String monsterName;
    private Integer currentHealth;
    private Integer maxHealth;
    private Integer attack;
    private Integer defence;

    private List<pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Attack> attacks;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MonsterData that = (MonsterData) o;

        if (monsterName != null ? !monsterName.equals(that.monsterName) : that.monsterName != null) return false;
        if (currentHealth != null ? !currentHealth.equals(that.currentHealth) : that.currentHealth != null)
            return false;
        if (maxHealth != null ? !maxHealth.equals(that.maxHealth) : that.maxHealth != null) return false;
        if (attack != null ? !attack.equals(that.attack) : that.attack != null) return false;
        if (defence != null ? !defence.equals(that.defence) : that.defence != null) return false;
        return attacks != null ? attacks.equals(that.attacks) : that.attacks == null;
    }

    @Override
    public int hashCode() {
        int result = monsterName != null ? monsterName.hashCode() : 0;
        result = 31 * result + (currentHealth != null ? currentHealth.hashCode() : 0);
        result = 31 * result + (maxHealth != null ? maxHealth.hashCode() : 0);
        result = 31 * result + (attack != null ? attack.hashCode() : 0);
        result = 31 * result + (defence != null ? defence.hashCode() : 0);
        result = 31 * result + (attacks != null ? attacks.hashCode() : 0);
        return result;
    }
}
