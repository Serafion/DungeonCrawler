package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.CharacterGeneratorFacade;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterCreatorFacade;

public class GameLogicConfiguration {


    public GameLogicFacade gameLogicForTests (MonsterCreatorFacade monsterCreatorFacade, CharacterGeneratorFacade characterGeneratorFacade) {

            return new GameLogicFacade(monsterCreatorFacade,characterGeneratorFacade);

    }
}
