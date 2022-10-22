package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.MonsterDto;

import java.util.List;

public record MonsterDto(String name, Integer MaxHealth, Integer Attack, Integer Defence, List<pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Attack> attacks) {
}
