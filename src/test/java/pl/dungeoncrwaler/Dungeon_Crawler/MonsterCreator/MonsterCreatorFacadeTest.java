package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MonsterCreatorFacadeTest {


    @Test
    @DisplayName("Should generate a random monster")
    void should_generate_a_new_monster(){
        //Given
        MonsterCreatorFacade monsterCreatorFacade = new MonsterCreatorConfiguration().monsterCreatorFacadeTest();

        //When
        Monster monster = monsterCreatorFacade.generateMonster();

        //Then
        assertThat(monster.getHealth()).isPositive();
        assertThat(monster.getName()).isGreaterThan("");
    }
}
