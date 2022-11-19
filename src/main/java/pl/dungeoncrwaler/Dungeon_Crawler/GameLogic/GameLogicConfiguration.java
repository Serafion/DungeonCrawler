package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.CharacterGeneratorFacade;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Repository.GameLogicRepository;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterCreatorFacade;

public class GameLogicConfiguration {


    public GameLogicFacade gameLogicForTests (MonsterCreatorFacade monsterCreatorFacade, CharacterGeneratorFacade characterGeneratorFacade, GameLogicRepository gameLogicRepository, GameEventCreator gameEventCreator) {
            LogicChain logicChain = new LogicChain(monsterCreatorFacade,characterGeneratorFacade,
                                    new StartGameLogicProcessor(gameLogicRepository,characterGeneratorFacade),
                                    new OpenDoorProcessor(gameLogicRepository,gameEventCreator,monsterCreatorFacade));
            return new GameLogicFacade(monsterCreatorFacade,characterGeneratorFacade, logicChain);

    }
}
