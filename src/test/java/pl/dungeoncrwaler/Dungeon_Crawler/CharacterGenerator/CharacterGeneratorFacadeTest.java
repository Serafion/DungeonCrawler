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
    Player player = characterGeneratorFacade.generateRandomPlayer();

    //Then
    assertThat(player.getMaxHealth()).isPositive();
    assertThat(player.getName()).isGreaterThan("");
    assertThat(player.getId()).isGreaterThan(-1L);
    assertThat(player.getRunPossibility()).isPositive();
    assertThat(player.getDefence()).isPositive();
    assertThat(player.getAttackPower()).isPositive();
    assertThat(player.getNickName()).isNotNull();
    }

    @Test
    @DisplayName("Should send a character")
    void should_send_back_a_character(){
        //Given
        CharacterGeneratorTestRepository repository = new CharacterGeneratorTestRepository();
        NameGenerator nameGenerator = new NameGeneratorTest();
        CharacterGeneratorFacade characterGeneratorFacade = new CharacterGeneratorConfiguration().characterGeneratorFacadeForTest(repository,nameGenerator);
        Player player = characterGeneratorFacade.generateRandomPlayer();

        //When
        Optional<Player> playerOptional = characterGeneratorFacade.getPlayer(player.getId());

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
        Player player = characterGeneratorFacade.generateRandomPlayer();

        //When
        Optional<Player> playerOptional = characterGeneratorFacade.getPlayer(player.getId()-1);

        //Then
        assertThat(playerOptional).isEmpty();
    }

}