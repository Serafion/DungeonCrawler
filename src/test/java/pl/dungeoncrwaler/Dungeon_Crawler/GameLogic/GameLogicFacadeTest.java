package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.CharacterGeneratorFacade;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.NickName;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.PlayerCharacter;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Dto.GameLogicDto;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterCreatorFacade;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterDto.MonsterDto;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThatObject;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class GameLogicFacadeTest {

    @InjectMocks
    MonsterCreatorFacade monsterCreatorFacade = mock(MonsterCreatorFacade.class);
    CharacterGeneratorFacade characterGeneratorFacade = mock(CharacterGeneratorFacade.class);

    GameEventCreator gameEventCreator = mock(GameEventCreator.class);


    @Test
    @DisplayName("Should return a message to choose fight option after engaging new fight")
    void should_return_options_message(){
    //Given
    GameLogicFacade gameLogicFacade = new GameLogicConfiguration().gameLogicForTests(monsterCreatorFacade,characterGeneratorFacade);
    given(characterGeneratorFacade.getPlayer(1L)).willReturn(Optional.of(new PlayerCharacter("Some Name", NickName.tiny,1,1,1,1)));
    given(monsterCreatorFacade.generateRandomMonster()).willReturn(new MonsterDto("some monster",1,1,1, List.of()));
    given(gameEventCreator.randomGameOption()).willReturn(GameOptions.FOUND_NEW_MONSTER);
    String request = "13e43f6d-d372-4e8e-86b4-4ff6bfe130f6,OPEN_DOOR";

    //When
    GameLogicDto gameLogicDTO = gameLogicFacade.processRequest(request);

    //Then
    assertThatObject(gameLogicDTO).isNotNull();
    }

    @Test
    @DisplayName("Should return information that player was killed by the monster and added to leaderboard")
    void player_death_message_test(){

    }

    @Test
    @DisplayName("Should return information about damage made to monster and damage suffered")
    void single_attack_turn_test(){

    }

    @Test
    @DisplayName("Should return information that a monster was killed")
    void monster_death_message_test(){

    }

    @Test
    @DisplayName("Should return information that player has hid and regained health")
    void hide_action_test(){

    }

    @Test
    @DisplayName("Should return a message that player tried to hide but instead was hit")
    void failure_of_hide_option_test(){

    }


}
