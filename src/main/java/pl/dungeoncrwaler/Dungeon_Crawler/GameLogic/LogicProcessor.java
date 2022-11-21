package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Dto.GameLogicDto;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Repository.GameLogicRepository;

@Slf4j
abstract class LogicProcessor {

    protected GameLogicRepository gameLogicRepository;

    protected LogicProcessor(GameLogicRepository gameLogicRepository) {
        this.gameLogicRepository = gameLogicRepository;
    }

    abstract void setNextProcessor(LogicProcessor logicProcessor);

    abstract GameLogicDto processRequest(String request);

    @NotNull
    protected GameLogicDto getErrorGameLogicDto(Exception ex, String message) {
        log.info(ex.getClass() + " " + ex.getMessage());
        GameLogicDto dto = new GameLogicDto();
        dto.setMessage(message);
        return dto;
    }

}
