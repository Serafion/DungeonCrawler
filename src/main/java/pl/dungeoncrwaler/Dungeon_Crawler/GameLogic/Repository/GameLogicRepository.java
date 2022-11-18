package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.SingleGame;

import java.util.UUID;

public interface GameLogicRepository extends CrudRepository<SingleGame, UUID> {
}
