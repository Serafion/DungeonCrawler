package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import org.springframework.stereotype.Component;

@Component
class MaxHealthGenerator extends Generable{

    public static final int BASE_HEALTH_RATE = 100;

    @Override
    public Integer generate(NickName nickName) {
        return BASE_HEALTH_RATE * nickName.getValue()* random.nextInt(1,3);
    }
}
