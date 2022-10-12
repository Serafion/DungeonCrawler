package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.repository.PlayerRepository;

@Configuration
public class CharacterGeneratorConfiguration {




    @Bean
    public CharacterGeneratorFacade characterGeneratorFacade(PlayerRepository playerRepository, StatGenerator statGenerator,NickNameGenerator nickNameGenerator, NameGenerator nameGenerator){
       return new CharacterGeneratorFacade(playerRepository,statGenerator,nickNameGenerator,nameGenerator);
    }

    public CharacterGeneratorFacade characterGeneratorFacadeForTest(PlayerRepository playerRepository){
        Generable atk = new AttackPowerGenerator();
        Generable def = new DefenceGenerator();
        Generable maxHealth = new MaxHealthGenerator();
        Generable runPos = new RunPossibilityGenerator();
        StatGenerator statGenerator = new StatGenerator(atk,def,runPos,maxHealth);
        NickNameGenerator nickNameGenerator = new NickNameGenerator();
        NameGenerator nameGenerator= new NameGenerator();
        return characterGeneratorFacade(playerRepository,statGenerator,nickNameGenerator,nameGenerator);
    }



}
