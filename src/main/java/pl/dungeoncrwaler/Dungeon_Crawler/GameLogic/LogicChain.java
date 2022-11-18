package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Dto.GameLogicDto;

public class LogicChain {

    StartGameLogicProcessor startGameLogicProcessor;
    OpenDoorProjectProcessor openDoorProjectProcessor;

    public LogicChain(StartGameLogicProcessor startGameLogicProcessor, OpenDoorProjectProcessor openDoorProjectProcessor) {
        this.startGameLogicProcessor = startGameLogicProcessor;
        this.openDoorProjectProcessor = openDoorProjectProcessor;
    }

    LogicProcessor getChain(){
        startGameLogicProcessor.setNextProcessor(openDoorProjectProcessor);
        return startGameLogicProcessor;
    }

    GameLogicDto process(String request){
        return startGameLogicProcessor.processRequest(request);
    }


}
