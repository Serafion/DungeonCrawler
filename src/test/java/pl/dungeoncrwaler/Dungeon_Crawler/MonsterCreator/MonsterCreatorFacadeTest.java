package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterDto.MonsterDto;

import static org.assertj.core.api.Assertions.assertThat;



public class MonsterCreatorFacadeTest {


    @Test
    @DisplayName("Should generate a random monster")
    void should_generate_a_new_monster(){
        //Given
        MonsterCreatorFacade monsterCreatorFacade = new MonsterCreatorConfiguration().monsterCreatorFacadeTest();

        //When
        MonsterDto monster = monsterCreatorFacade.generateRandomMonster();

        //Then
        assertThat(monster.MaxHealth()).isPositive();
        assertThat(monster.name()).isGreaterThan("");
        assertThat(monster.attacks().size()).isPositive();
        assertThat(monster.Attack()).isPositive();
        assertThat(monster.Defence()).isPositive();
    }
    @Test
    @DisplayName("Should generate a Red Dragon")
    void should_generate_a_red_dragon(){
        //Given
        MonsterCreatorFacade monsterCreatorFacade = new MonsterCreatorConfiguration().monsterCreatorFacadeTest();

        //When
        MonsterDto monster = monsterCreatorFacade.generateConcreteMonster("Dragon","Red");

        //Then
        assertThat(monster.MaxHealth()).isPositive();
        assertThat(monster.name()).isEqualTo("Red dragon");
        assertThat(monster.attacks().size()).isPositive();
        assertThat(monster.Attack()).isPositive();
        assertThat(monster.Defence()).isPositive();
    }
    @Test
    @DisplayName("Should generate a Green Dragon")
    void should_generate_a_green_dragon(){
        //Given
        MonsterCreatorFacade monsterCreatorFacade = new MonsterCreatorConfiguration().monsterCreatorFacadeTest();

        //When
        MonsterDto monster = monsterCreatorFacade.generateConcreteMonster("Dragon","Green");

        //Then
        assertThat(monster.MaxHealth()).isPositive();
        assertThat(monster.name()).isEqualTo("Green dragon");
        assertThat(monster.attacks().size()).isPositive();
        assertThat(monster.Attack()).isPositive();
        assertThat(monster.Defence()).isPositive();
    }
    @Test
    @DisplayName("Should generate a Gold Dragon")
    void should_generate_a_gold_dragon(){
        //Given
        MonsterCreatorFacade monsterCreatorFacade = new MonsterCreatorConfiguration().monsterCreatorFacadeTest();

        //When
        MonsterDto monster = monsterCreatorFacade.generateConcreteMonster("Dragon","Gold");

        //Then
        assertThat(monster.MaxHealth()).isPositive();
        assertThat(monster.name()).isEqualTo("Gold dragon");
        assertThat(monster.attacks().size()).isPositive();
        assertThat(monster.Attack()).isPositive();
        assertThat(monster.Defence()).isPositive();
    }
    @Test
    @DisplayName("Should generate a Diamond Dragon")
    void should_generate_a_diamond_dragon(){
        //Given
        MonsterCreatorFacade monsterCreatorFacade = new MonsterCreatorConfiguration().monsterCreatorFacadeTest();

        //When
        MonsterDto monster = monsterCreatorFacade.generateConcreteMonster("Dragon","Diamond");

        //Then
        assertThat(monster.MaxHealth()).isPositive();
        assertThat(monster.name()).isEqualTo("Diamond dragon");
        assertThat(monster.attacks().size()).isPositive();
        assertThat(monster.Attack()).isPositive();
        assertThat(monster.Defence()).isPositive();
    }
}
