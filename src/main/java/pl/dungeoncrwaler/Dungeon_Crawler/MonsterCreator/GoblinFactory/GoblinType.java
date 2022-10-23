package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.GoblinFactory;

enum GoblinType {
    Small(1),
    Medium(10),
    Large(15);
    private final Integer modifier;

    GoblinType(Integer i) {
        this.modifier = i;
    }
    public Integer getModifier() {
        return modifier;
    }

    public static GoblinType getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
