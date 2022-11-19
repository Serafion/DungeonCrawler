package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.CharacterGeneratorFacade;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterCreatorFacade;

class LogicChain {

    private final MonsterCreatorFacade monsterCreatorFacade;
    private final CharacterGeneratorFacade characterGeneratorFacade;

    private final StartGameLogicProcessor startGameLogicProcessor;
    private final OpenDoorProcessor openDoorProjectProcessor;

    public LogicChain(MonsterCreatorFacade monsterCreatorFacade, CharacterGeneratorFacade characterGeneratorFacade, StartGameLogicProcessor startGameLogicProcessor, OpenDoorProcessor openDoorProjectProcessor) {
        this.monsterCreatorFacade = monsterCreatorFacade;
        this.characterGeneratorFacade = characterGeneratorFacade;
        this.startGameLogicProcessor = startGameLogicProcessor;
        this.openDoorProjectProcessor = openDoorProjectProcessor;
    }


    //Chain setup - add new Processors in chain setup
    LogicProcessor getChain(){
        startGameLogicProcessor.setNextProcessor(openDoorProjectProcessor);
        return startGameLogicProcessor;
    }

//    GameLogicDto process(String request){
//        return startGameLogicProcessor.processRequest(request);
//    }


}
