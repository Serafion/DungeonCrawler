package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import java.util.Random;

class GameEventCreator {

   public GameOptions randomGameOption(){
       Random random = new Random();
       return GameOptions.values()[random.nextInt(0,GameOptions.values().length-1)];
   }
}
