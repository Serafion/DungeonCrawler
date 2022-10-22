package pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.DragonFactory;

import pl.dungeoncrwaler.Dungeon_Crawler.MonsterCreator.Attack;

class DragonAttackGenerator {
    public Attack basicAttack(){
        return new Attack("Attacks with claws",10);
    }
    public Attack mediumAttack(){
        return new Attack("Attacks with wing swing!",25);

    }
    public Attack strongAttack(DragonType dragonType){
        return switch (dragonType){
            case Red -> new Attack("Dragon stomps on you!",5*dragonType.getModifier());
            case Green -> new Attack("Dragon bites!",7*dragonType.getModifier());
            case Gold -> new Attack("Dragon breath!",10*dragonType.getModifier());
            case Diamond -> new Attack("Enourmous dragon breath!",15* dragonType.getModifier());
        };
    }
}
