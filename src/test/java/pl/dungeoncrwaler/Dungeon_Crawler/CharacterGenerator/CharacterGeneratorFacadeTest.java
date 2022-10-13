package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class CharacterGeneratorFacadeTest {



    @Test
    @DisplayName("Should generate random player with random positive stats")
    void should_generate_a_character(){
    //Given
    CharacterGeneratorTestRepository repository = new CharacterGeneratorTestRepository();
    NameGenerator nameGenerator = new NameGeneratorTest();
    CharacterGeneratorFacade characterGeneratorFacade = new CharacterGeneratorConfiguration().characterGeneratorFacadeForTest(repository,nameGenerator);

    //When
    Character character = characterGeneratorFacade.generateRandomPlayer();

    //Then
    assertThat(character.getMaxHealth()).isPositive();
    assertThat(character.getName()).isGreaterThan("");
    assertThat(character.getId()).isGreaterThan(-1L);
    assertThat(character.getRunPossibility()).isPositive();
    assertThat(character.getDefence()).isPositive();
    assertThat(character.getAttackPower()).isPositive();
    assertThat(character.getNickName()).isNotNull();
    }

    @Test
    @DisplayName("Should send a character")
    void should_send_back_a_character(){
        //Given
        CharacterGeneratorTestRepository repository = new CharacterGeneratorTestRepository();
        NameGenerator nameGenerator = new NameGeneratorTest();
        CharacterGeneratorFacade characterGeneratorFacade = new CharacterGeneratorConfiguration().characterGeneratorFacadeForTest(repository,nameGenerator);
        Character character = characterGeneratorFacade.generateRandomPlayer();

        //When
        Optional<Character> playerOptional = characterGeneratorFacade.getPlayer(character.getId());

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
        Character character = characterGeneratorFacade.generateRandomPlayer();

        //When
        Optional<Character> playerOptional = characterGeneratorFacade.getPlayer(character.getId()-1);

        //Then
        assertThat(playerOptional).isEmpty();
    }

}