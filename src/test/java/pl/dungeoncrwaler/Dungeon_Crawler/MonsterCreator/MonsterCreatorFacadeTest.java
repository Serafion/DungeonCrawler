package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.DragonFactory.DragonFactory;
import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.GoblinFactory.GoblinFactory;
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
    @DisplayName("Should generate a random Dragon")
    void should_generate_a_red_dragon(){
        //Given
        DragonFactory dragonFactory = new DragonFactory();

        //When
        Monster monster = dragonFactory.generateRandomMonster();

        //Then
        assertThat(monster.getHealth()).isPositive();
        assertThat(monster.getName()).isGreaterThan("");
        assertThat(monster.getAttacks().size()).isEqualTo(3);
        assertThat(monster.getPower()).isPositive();
        assertThat(monster.getDefence()).isPositive();
    }
    @Test
    @DisplayName("Should generate a random goblin")
    void should_generate_a_random_goblin(){
        //Given
        GoblinFactory goblinFactory = new GoblinFactory();

        //When
        Monster monster = goblinFactory.generateRandomMonster();

        //Then
        assertThat(monster.getHealth()).isPositive();
        assertThat(monster.getName()).isGreaterThan("");
        assertThat(monster.getAttacks().size()).isEqualTo(3);
        assertThat(monster.getPower()).isPositive();
        assertThat(monster.getDefence()).isPositive();
    }
    @ParameterizedTest
    @EnumSource(DragonType.class)
    @DisplayName("Should generate each dragon type")
    void should_generate_a_diamond_dragon(DragonType type){
        //Given
        MonsterCreatorFacade monsterCreatorFacade = new MonsterCreatorConfiguration().monsterCreatorFacadeTest();

        //When
        MonsterDto monster = monsterCreatorFacade.generateConcreteMonster("Dragon",type.name());

        //Then
        assertThat(monster.MaxHealth()).isPositive();
        assertThat(monster.name()).isEqualTo(type.name()+" dragon");
        assertThat(monster.attacks().size()).isPositive();
        assertThat(monster.Attack()).isPositive();
        assertThat(monster.Defence()).isPositive();
    }

    @ParameterizedTest
    @EnumSource(GoblinType.class)
    @DisplayName("Should generate each goblin type")
    void should_generate_a_small_goblin(GoblinType type){
        //Given
        MonsterCreatorFacade monsterCreatorFacade = new MonsterCreatorConfiguration().monsterCreatorFacadeTest();

        //When
        MonsterDto monster = monsterCreatorFacade.generateConcreteMonster("Goblin",type.name());

        //Then
        assertThat(monster.MaxHealth()).isPositive();
        assertThat(monster.name()).isEqualTo(type.name()+" goblin");
        assertThat(monster.attacks().size()).isPositive();
        assertThat(monster.Attack()).isPositive();
        assertThat(monster.Defence()).isPositive();
    }

}
