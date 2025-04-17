package InterfaceSegregationPrinciple;

public class Client {
    public static void main(String[] args) {
        Monster monster = new Monster("僵尸");
        MagicMonster magicMonster = new MagicMonster("女巫");
        monster.basicAttack();
        magicMonster.basicAttack();
        magicMonster.magicAttack();
    }
}
