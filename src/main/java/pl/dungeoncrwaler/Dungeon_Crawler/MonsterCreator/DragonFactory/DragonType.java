package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.DragonFactory;

enum DragonType {
    Green(10),
    Red(25),
    Gold(50),
    Diamond(100);

    private final Integer modifier;

    DragonType(Integer i) {
        this.modifier = i;
    }

    public Integer getModifier() {
        return modifier;
    }

    public static DragonType getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
