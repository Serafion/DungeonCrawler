package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.GoblinFactory;

import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Attack;

class GoblinAttackGenerator {

    private static final GoblinAttackGenerator generator = new GoblinAttackGenerator();
    public static GoblinAttackGenerator getInstance(){
        return generator;
    }

    private GoblinAttackGenerator() {
    }

    public Attack basicAttack() {
        return new Attack("Goblin kick!", 4);
    }

    public Attack mediumAttack() {
        return new Attack("Goblin punch!", 6);
    }
    public Attack strongAttack(GoblinType goblinType){
        return switch (goblinType){
            case Small -> new Attack("Attacks with club with fire in its eyes",2*goblinType.getModifier());
            case Medium -> new Attack("Attacks with club with fire in its eyes",3*goblinType.getModifier());
            case Large -> new Attack("Attacks with club with fire in its eyes",7*goblinType.getModifier());
        };
    }
}
