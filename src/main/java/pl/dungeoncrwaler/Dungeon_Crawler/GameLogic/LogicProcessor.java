package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Dto.GameLogicDto;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Repository.GameLogicRepository;

abstract class LogicProcessor {

    private GameLogicRepository gameLogicRepository;

    protected LogicProcessor(GameLogicRepository gameLogicRepository) {
        this.gameLogicRepository = gameLogicRepository;
    }

    abstract void setNextProcessor(LogicProcessor logicProcessor);

    abstract GameLogicDto processRequest(String request);

}
