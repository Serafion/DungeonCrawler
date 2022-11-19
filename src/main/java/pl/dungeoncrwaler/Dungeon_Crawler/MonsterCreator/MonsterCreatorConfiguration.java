package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator;

import org.springframework.context.annotation.Bean;

public class MonsterCreatorConfiguration {
    @Bean
    public MonsterCreatorFacade monsterCreatorFacade(){
        return new MonsterCreatorFacade(new MonsterMapper());
    }

    //Test configuration
    public MonsterCreatorFacade monsterCreatorFacadeTest() {
        MonsterMapper monsterMapper = new MonsterMapper();
        return new MonsterCreatorFacade(monsterMapper);
    }
}
