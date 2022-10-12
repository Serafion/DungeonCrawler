package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import org.springframework.stereotype.Component;

@Component
class AttackPowerGenerator extends Generable{

    public static final int BASE_ATTACK_RATE = 10;

    public AttackPowerGenerator() {
        System.out.println("attackPower gen created");
    }

    @Override
    public Integer generate(NickName nickName) {
        return BASE_ATTACK_RATE * nickName.getValue()+random.nextInt(1,5);
    }
}
