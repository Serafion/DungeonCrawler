package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerCharacterGeneratorFacadeTest {



    @Test
    @DisplayName("Should generate random player with random positive stats")
    void should_generate_a_character(){
    //Given
    CharacterGeneratorTestRepository repository = new CharacterGeneratorTestRepository();
    NameGenerator nameGenerator = new NameGeneratorTest();
    CharacterGeneratorFacade characterGeneratorFacade = new CharacterGeneratorConfiguration().characterGeneratorFacadeForTest(repository,nameGenerator);

    //When
    PlayerCharacter playerCharacter = characterGeneratorFacade.generateRandomPlayer();

    //Then
    assertThat(playerCharacter.getMaxHealth()).isPositive();
    assertThat(playerCharacter.getName()).isGreaterThan("");
    assertThat(playerCharacter.getId()).isGreaterThan(-1L);
    assertThat(playerCharacter.getRunPossibility()).isPositive();
    assertThat(playerCharacter.getDefence()).isPositive();
    assertThat(playerCharacter.getAttackPower()).isPositive();
    assertThat(playerCharacter.getNickName()).isNotNull();
    }

    @Test
    @DisplayName("Should send a character")
    void should_send_back_a_character(){
        //Given
        CharacterGeneratorTestRepository repository = new CharacterGeneratorTestRepository();
        NameGenerator nameGenerator = new NameGeneratorTest();
        CharacterGeneratorFacade characterGeneratorFacade = new CharacterGeneratorConfiguration().characterGeneratorFacadeForTest(repository,nameGenerator);
        PlayerCharacter playerCharacter = characterGeneratorFacade.generateRandomPlayer();

        //When
        Optional<PlayerCharacter> playerOptional = characterGeneratorFacade.getPlayer(playerCharacter.getId());

        //Then
        assertThat(playerOptional).isPresent();
    }
    @Test
    @DisplayName("Should not send a character")
    void should_not_send_back_a_character(){
        //Given
        CharacterGeneratorTestRepository repository = new CharacterGeneratorTestRepository();
        NameGenerator nameGenerator = new NameGeneratorTest();
        CharacterGeneratorFacade characterGeneratorFacade = new CharacterGeneratorConfiguration().characterGeneratorFacadeForTest(repository,nameGenerator);
        PlayerCharacter playerCharacter = characterGeneratorFacade.generateRandomPlayer();

        //When
        Optional<PlayerCharacter> playerOptional = characterGeneratorFacade.getPlayer(playerCharacter.getId()-1);

        //Then
        assertThat(playerOptional).isEmpty();
    }

}