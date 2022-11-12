package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.GoblinFactory;

import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Attack;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Monster;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterFactory;

import java.util.ArrayList;
import java.util.List;

public class GoblinFactory extends MonsterFactory {

    public static final String GOBLIN = " goblin";
    private final GoblinAttackGenerator goblinAttackGenerator;

    public GoblinFactory() {
        this.goblinAttackGenerator = GoblinAttackGenerator.getInstance();
    }

    @Override
    public Monster generateSpecificMonster(String type) {
        GoblinType goblinType = GoblinType.valueOf(type);
        return getGoblin(goblinType);
    }

    @Override
    public Monster generateRandomMonster() {
        GoblinType goblinType = GoblinType.getRandom();
        return getGoblin(goblinType);
    }

    private Goblin getGoblin(GoblinType goblinType){
        String name = chooseName(goblinType);
        List<Attack> attacks = chooseAttacks(goblinType);
        Integer health = calculateHealth(goblinType);
        Integer power = calculatePower(goblinType);
        Integer defence = calculateDefence(goblinType);
        return new Goblin(name, attacks, health, power, defence);
    }

    private String chooseName(GoblinType goblinType) {
        return goblinType.name()+ GOBLIN;
    }

    private List<Attack> chooseAttacks(GoblinType goblinType) {
        List<Attack>attacks=new ArrayList<>();
        attacks.add(goblinAttackGenerator.basicAttack());
        attacks.add(goblinAttackGenerator.mediumAttack());
        attacks.add(goblinAttackGenerator.strongAttack(goblinType));
        return attacks;
    }

    private Integer calculateHealth(GoblinType goblinType) {
        return 15* goblinType.getModifier()*random.nextInt(1,3);
    }

    private Integer calculatePower(GoblinType goblinType) {
        return 10* goblinType.getModifier()* random.nextInt(2,5);
    }

    private Integer calculateDefence(GoblinType goblinType) {
        return 12* goblinType.getModifier()* random.nextInt(1,4);
    }
}
