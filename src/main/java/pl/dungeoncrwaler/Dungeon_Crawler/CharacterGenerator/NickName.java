package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

public enum NickName {
    tiny(1),
    small(3),
    medium(5),
    large(7),
    huge(10),
    enormous(20);

    private final Integer value;

    NickName(Integer value) {
        this.value=value;
    }

    public Integer getValue() {
        return value;
    }
}
