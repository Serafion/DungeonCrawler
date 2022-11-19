package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.PlayerCharacter;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Dto.GameLogicDto;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.MonsterData;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.PlayerData;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.SingleGame;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterDto.MonsterDto;

class GameLogicMapper {

    public static PlayerData newPlayerFromPlayerCharacter(PlayerCharacter playerCharacter){
        return new PlayerData(playerCharacter.getId(), playerCharacter.getName(), playerCharacter.getMaxHealth(), playerCharacter.getMaxHealth(), playerCharacter.getAttackPower(), playerCharacter.getDefence(), playerCharacter.getRunPossibility());
    }

    public static GameLogicDto fromSingleGame(SingleGame singleGame){
        return new GameLogicDto(singleGame.getId(),singleGame.getMonsterData().getMonsterName(),singleGame.getMonsterData().getCurrentHealth(),singleGame.getMonsterData().getMaxHealth(),singleGame.getPlayerData().getCurrentHealth(),singleGame.getPlayerData().getMaxHealth(),"");
    }

    public static MonsterData fromMonsterDto(MonsterDto monsterDto){
        return new MonsterData(monsterDto.name(), monsterDto.MaxHealth(), monsterDto.MaxHealth(), monsterDto.Attack(), monsterDto.Defence(), monsterDto.attacks());
    }
}
