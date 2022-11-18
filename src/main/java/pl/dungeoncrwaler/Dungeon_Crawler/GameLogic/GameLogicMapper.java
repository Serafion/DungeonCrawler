package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.PlayerCharacter;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Dto.GameLogicDto;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.PlayerData;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.SingleGame;

public class GameLogicMapper {

    public static PlayerData newPlayerFromPlayerCharacter(PlayerCharacter playerCharacter){
        return new PlayerData(playerCharacter.getId(), playerCharacter.getName(), playerCharacter.getMaxHealth(), playerCharacter.getMaxHealth(), playerCharacter.getAttackPower(), playerCharacter.getDefence(), playerCharacter.getRunPossibility());
    }

    public static GameLogicDto fromSingleGame(SingleGame singleGame){
        return new GameLogicDto(singleGame.getId(),singleGame.getMonsterData().getMonsterName(),singleGame.getMonsterData().getCurrentHealth(),singleGame.getMonsterData().getMaxHealth(),singleGame.getPlayerData().getCurrentHealth(),singleGame.getPlayerData().getMaxHealth(),"");
    }
}
