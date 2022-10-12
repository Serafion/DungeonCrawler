package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import org.springframework.stereotype.Component;

@Component
class DefenceGenerator extends Generable{

    public static final int BASE_DEFENCE_RATE = 50;

    public DefenceGenerator() {
        System.out.println("defence gen created");
    }

    @Override
    public Integer generate(NickName nickName) {
        return BASE_DEFENCE_RATE * nickName.getValue() * random.nextInt(1,10);
    }
}
