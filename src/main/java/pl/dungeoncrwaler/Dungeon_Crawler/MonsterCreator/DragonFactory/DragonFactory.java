package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.DragonFactory;

import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Attack;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Monster;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterFactory;

import java.util.ArrayList;
import java.util.List;

public class DragonFactory extends MonsterFactory {


    public static final String DRAGON = " dragon";
    private final DragonAttackGenerator dragonAttackGenerator;

    public DragonFactory() {
        this.dragonAttackGenerator = DragonAttackGenerator.getInstance();
    }


    @Override
    public Monster generateSpecificMonster(String type) {
        DragonType dragonType = DragonType.valueOf(type);
        return getDragon(dragonType);
    }

    @Override
    public Monster generateRandomMonster() {
        DragonType dragonType = DragonType.getRandom();
        return getDragon(dragonType);
    }

    private Dragon getDragon(DragonType dragonType) {
        String name = chooseName(dragonType);
        List<Attack> attacks = chooseAttacks(dragonType);
        Integer health = calculateHealth(dragonType);
        Integer power = calculatePower(dragonType);
        Integer defence = calculateDefence(dragonType);
        return new Dragon(name, attacks, health, power, defence);
    }

    private String chooseName(DragonType dragonType) {
        return dragonType.name() + DRAGON;
    }

    private List<Attack> chooseAttacks(DragonType dragonType) {
        List<Attack> attacks = new ArrayList<>();
        attacks.add(dragonAttackGenerator.basicAttack());
        attacks.add(dragonAttackGenerator.mediumAttack());
        attacks.add(dragonAttackGenerator.strongAttack(dragonType));
        return attacks;
    }

    private Integer calculateHealth(DragonType dragonType) {
        return 100 * dragonType.getModifier() * random.nextInt(1, 3);
    }

    private Integer calculatePower(DragonType dragonType) {
        return 50 * dragonType.getModifier() * random.nextInt(1, 5);
    }


    private Integer calculateDefence(DragonType dragonType) {
        return 25 * dragonType.getModifier() * random.nextInt(1, 2);
    }
}
