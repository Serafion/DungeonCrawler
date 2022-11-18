package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import lombok.extern.slf4j.Slf4j;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.CharacterGeneratorFacade;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.PlayerCharacter;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Dto.GameLogicDto;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.MonsterData;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.PlayerData;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.SingleGame;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Repository.GameLogicRepository;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterCreatorFacade;

import java.util.UUID;

@Slf4j
public class GameLogicFacade {

    private final MonsterCreatorFacade monsterCreatorFacade;
    private final CharacterGeneratorFacade characterGeneratorFacade;

    public GameLogicFacade(MonsterCreatorFacade monsterCreatorFacade, CharacterGeneratorFacade characterGeneratorFacade) {
       this.monsterCreatorFacade=monsterCreatorFacade;
       this.characterGeneratorFacade=characterGeneratorFacade;
    }

    public GameLogicDto processRequest(String request) {
        String[] parsed = request.split(",");
        try {
            Long playerId = Long.valueOf(parsed[0]);
            PlayerCharacter playerCharacter = characterGeneratorFacade.getPlayer(playerId).orElseThrow(PlayerNotFoundException::new);
            UUID uuid = UUID.randomUUID();
            PlayerData playerData = GameLogicMapper.newPlayerFromPlayerCharacter(playerCharacter);
            MonsterData monsterData = new MonsterData();
            SingleGame singleGame = new SingleGame(uuid,monsterData,playerData);
            gameLogicRepository.save(singleGame);
            GameLogicDto dto = GameLogicMapper.fromSingleGame(singleGame);
            dto.setMessage("Created new game, you're ready to enter the dungeon!");
            return dto;

        } catch (NumberFormatException ex){
            log.info("Exception while parsing long into new game "+ ex.getClass() + " " + ex.getMessage());
        } catch (PlayerNotFoundException ex){
            log.info("Player not in db exception occured while creating new game");
        }

    }
}
