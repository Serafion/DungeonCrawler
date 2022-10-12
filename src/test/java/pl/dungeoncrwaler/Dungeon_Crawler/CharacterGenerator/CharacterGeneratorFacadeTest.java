package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CharacterGeneratorFacadeTest {



    @Test
    @DisplayName("Should generate random player with random positive stats")
    void should_generate_a_character(){
    //Given
    CharacterGeneratorTestRepository repository = new CharacterGeneratorTestRepository();
    CharacterGeneratorFacade characterGeneratorFacade = new CharacterGeneratorConfiguration().characterGeneratorFacadeForTest(repository);

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

}