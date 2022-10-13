package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

import pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator.repository.PlayerRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CharacterGeneratorTestRepository implements PlayerRepository {

    Map<Long, Character> map = new HashMap<>();
    Long ids = 1L;

    @Override
    public <S extends Character> S save(S entity) {
        entity.setId(ids);
        map.put(ids,entity);
        ids++;
        return (S) map.get(ids-1);
    }

    @Override
    public <S extends Character> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Character> findById(Long aLong) {
        return map.containsKey(aLong) ? Optional.of(map.get(aLong)): Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Character> findAll() {
        return null;
    }

    @Override
    public Iterable<Character> findAllById(Iterable<Long> longs) {
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
    public void delete(Character entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Character> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
