package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.PlayerCharacter;


@Repository
public interface PlayerRepository extends CrudRepository<PlayerCharacter,Long> {
}
