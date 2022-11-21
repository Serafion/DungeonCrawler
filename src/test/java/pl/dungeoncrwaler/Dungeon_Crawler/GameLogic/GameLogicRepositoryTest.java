package pl.dungeoncrwaler.Dungeon_Crawler.GameLogic;

import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Model.SingleGame;
import pl.dungeoncrwaler.Dungeon_Crawler.GameLogic.Repository.GameLogicRepository;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

public class GameLogicRepositoryTest implements GameLogicRepository {

    HashMap<UUID,SingleGame> map = new HashMap<>();




    @Override
    public <S extends SingleGame> S save(S entity) {
        UUID uuid = entity.getId();
        map.put(uuid,entity);
        return (S) map.get(uuid);
    }

    @Override
    public <S extends SingleGame> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<SingleGame> findById(UUID uuid) {
        return map.containsKey(uuid) ? Optional.of(map.get(uuid)) : Optional.empty();
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public Iterable<SingleGame> findAll() {
        return null;
    }

    @Override
    public Iterable<SingleGame> findAllById(Iterable<UUID> uuids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void delete(SingleGame entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends UUID> uuids) {

    }

    @Override
    public void deleteAll(Iterable<? extends SingleGame> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
