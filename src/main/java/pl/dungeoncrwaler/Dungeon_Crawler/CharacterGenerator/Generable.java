package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import java.util.Random;

abstract class Generable {

    Random random = new Random();
    abstract Integer generate(NickName nickName);
}
