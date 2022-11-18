package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Dto.GameLogicDto;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Repository.GameLogicRepository;

class StartGameLogicProcessor extends LogicProcessor{

    LogicProcessor logicProcessor;

    public StartGameLogicProcessor(LogicProcessor logicProcessor, GameLogicRepository gameLogicRepository) {
        super(gameLogicRepository);
        this.logicProcessor = logicProcessor;
    }


    @Override
    public void setNextProcessor(LogicProcessor logicProcessor) {
        this.logicProcessor=logicProcessor;
    }

    @Override
    public GameLogicDto processRequest(String request) {

        return null;
    }
}
