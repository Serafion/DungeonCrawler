package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import lombok.NoArgsConstructor;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Dto.GameLogicDto;


class OpenDoorProjectProcessor extends LogicProcessor {

    LogicProcessor logicProcessor;




    @Override
    public void setNextProcessor(LogicProcessor logicProcessor) {
        this.logicProcessor = logicProcessor;
    }

    @Override
    public GameLogicDto processRequest(String request) {
        return null;
    }
}
