package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import org.springframework.stereotype.Component;

@Component
class RunPossibilityGenerator extends Generable{

    public static final int BASE_RUN_POS_RATE = 1000;

    @Override
    public Integer generate(NickName nickName) {
        return BASE_RUN_POS_RATE/(nickName.getValue()*random.nextInt(1,5)) ;
    }
}
