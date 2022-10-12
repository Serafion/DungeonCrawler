package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.repository.PlayerRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CharacterGeneratorTestRepository implements PlayerRepository {

    Map<Long,Player> map = new HashMap<>();
    Long ids = 0L;

    @Override
    public <S extends Player> S save(S entity) {
        entity.setId(ids);
        map.put(ids,entity);
        ids++;
        return (S) map.get(ids-1);
    }

    @Override
    public <S extends Player> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Player> findById(Long aLong) {
        return Optional.of(map.get(aLong));
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Player> findAll() {
        return null;
    }

    @Override
    public Iterable<Player> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Player entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Player> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
