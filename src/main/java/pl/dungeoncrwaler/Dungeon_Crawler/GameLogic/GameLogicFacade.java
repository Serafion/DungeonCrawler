package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import lombok.extern.slf4j.Slf4j;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.CharacterGeneratorFacade;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Dto.GameLogicDto;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterCreatorFacade;

@Slf4j
public class GameLogicFacade {

    private final MonsterCreatorFacade monsterCreatorFacade;
    private final CharacterGeneratorFacade characterGeneratorFacade;
    private LogicChain logicChain;



    public GameLogicFacade(MonsterCreatorFacade monsterCreatorFacade, CharacterGeneratorFacade characterGeneratorFacade, LogicChain logicChain) {
       this.monsterCreatorFacade=monsterCreatorFacade;
       this.characterGeneratorFacade=characterGeneratorFacade;
       this.logicChain = logicChain;
    }

    public GameLogicDto processRequest(String request) {
        return logicChain.getChain().processRequest(request);
    }
}
