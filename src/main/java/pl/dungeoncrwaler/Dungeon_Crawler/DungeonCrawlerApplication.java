package pl.dungeoncrwaler.Dungeon_Crawler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaAuditing
@EnableTransactionManagement
@EnableJpaRepositories
public class DungeonCrawlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DungeonCrawlerApplication.class, args);
	}



}
