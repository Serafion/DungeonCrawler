package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import lombok.extern.slf4j.Slf4j;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.CharacterGeneratorFacade;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.PlayerCharacter;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Dto.GameLogicDto;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.MonsterData;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.PlayerData;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.SingleGame;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Repository.GameLogicRepository;

import java.util.UUID;

@Slf4j
class StartGameLogicProcessor extends LogicProcessor{

    private LogicProcessor logicProcessor;

    private final CharacterGeneratorFacade characterGeneratorFacade;

    public StartGameLogicProcessor(GameLogicRepository gameLogicRepository, CharacterGeneratorFacade characterGeneratorFacade) {
        super(gameLogicRepository);
        this.characterGeneratorFacade = characterGeneratorFacade;
    }


    @Override
    public void setNextProcessor(LogicProcessor logicProcessor) {
        this.logicProcessor=logicProcessor;
    }

    @Override
    public GameLogicDto processRequest(String request) {
        String[] parsed = request.split(",");
        try {
            if(parsed[1].equals("startNewGame")){
            Long playerId = Long.valueOf(parsed[0]);
            PlayerCharacter playerCharacter = characterGeneratorFacade.getPlayer(playerId).orElseThrow(PlayerNotFoundException::new);
            UUID uuid = UUID.randomUUID();
            PlayerData playerData = GameLogicMapper.newPlayerFromPlayerCharacter(playerCharacter);
            MonsterData monsterData = new MonsterData();
            SingleGame singleGame = new SingleGame(uuid,monsterData,playerData);
            gameLogicRepository.save(singleGame);
            GameLogicDto dto = GameLogicMapper.fromSingleGame(singleGame);
            dto.setMessage("Created new game, you're ready to enter the dungeon!");
            return dto;}
        } catch (NumberFormatException ex){
            return getErrorGameLogicDto(ex,"Exception while character number into new game!!!!");
        } catch (PlayerNotFoundException ex){
            return getErrorGameLogicDto(ex,"Player not in found in DB");
        }
        return logicProcessor.processRequest(request);
    }
}
