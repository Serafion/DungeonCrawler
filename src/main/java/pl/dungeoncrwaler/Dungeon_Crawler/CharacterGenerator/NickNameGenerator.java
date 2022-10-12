package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
class NickNameGenerator {
    Random random = new Random();

    public NickName generateNickName(){
    int nickNameTypes = NickName.values().length;
    NickName[] nickNames = NickName.values();
    return nickNames[random.nextInt(0,nickNameTypes)];

    }


}
