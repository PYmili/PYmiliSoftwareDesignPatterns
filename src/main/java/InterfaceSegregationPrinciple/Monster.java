package InterfaceSegregationPrinciple;

/**
 * <h1>普通怪物</h1>
 * <h5>实现接口：{@link BasicBadCharacterSkill}</h5>
 * @author PYmili
 */
public class Monster implements BasicBadCharacterSkill {
    public String name;

    public Monster(String name) {
        this.name = name;
    }

    @Override
    public void basicAttack() {
        System.out.println(this.name + "发动" + "基础攻击");
    }
}
