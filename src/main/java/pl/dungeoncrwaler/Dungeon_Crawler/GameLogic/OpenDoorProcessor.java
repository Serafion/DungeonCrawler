package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.Nullable;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Dto.GameLogicDto;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.MonsterData;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.SingleGame;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Repository.GameLogicRepository;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterCreatorFacade;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterDto.MonsterDto;

import java.util.UUID;


@Slf4j
class OpenDoorProcessor extends LogicProcessor {

    LogicProcessor logicProcessor;
    GameEventCreator gameEventCreator;

    MonsterCreatorFacade monsterCreatorFacade;

    public OpenDoorProcessor(GameLogicRepository gameLogicRepository, GameEventCreator gameEventCreator, MonsterCreatorFacade monsterCreatorFacade) {
        super(gameLogicRepository);
        this.gameEventCreator = gameEventCreator;
        this.monsterCreatorFacade = monsterCreatorFacade;
    }

//    public OpenDoorProjectProcessor(GameLogicRepository gameLogicRepository) {
//        super(gameLogicRepository);
//    }


    @Override
    public void setNextProcessor(LogicProcessor logicProcessor) {
        this.logicProcessor = logicProcessor;
    }

    @Override
    public GameLogicDto processRequest(String request) {
        String[] parsed = request.split(",");
        try {
            if (parsed[1].equals("openDoor")) {
                UUID uuid = UUID.fromString(parsed[0]);
                SingleGame game = gameLogicRepository.findById(uuid).orElseThrow(GameNotFoundException::new);
                GameOptions options = gameEventCreator.randomGameOption();
                GameLogicDto dto = processGameOption(game, options);
                if (dto != null) return dto;
            }
        } catch (IllegalArgumentException ex) {
            return getErrorGameLogicDto(ex, "Wrong game reference provided");
        } catch (GameNotFoundException ex) {
            return getErrorGameLogicDto(ex, "Wrong game reference provided - game does not exist");
        }
        return logicProcessor.processRequest(request);
    }

    @Nullable
    private GameLogicDto processGameOption(SingleGame game, GameOptions options) {
        switch (options) {
            case FOUND_NEW_MONSTER -> {
                MonsterData monsterData;
                MonsterDto monsterDto = monsterCreatorFacade.generateRandomMonster();
                monsterData = GameLogicMapper.fromMonsterDto(monsterDto);
                game.setMonsterData(monsterData);
                gameLogicRepository.save(game);
                GameLogicDto dto = GameLogicMapper.fromSingleGame(game);
                dto.setMessage(monsterData.getMonsterName() + " appeared!!!");
                return dto;

            }
        }
        return null;
    }


}
