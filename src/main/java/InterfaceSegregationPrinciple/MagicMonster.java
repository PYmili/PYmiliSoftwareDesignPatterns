package InterfaceSegregationPrinciple;

/**
 * <h1>魔法怪物</h1>
 * <h5>实现接口: {@link BasicBadCharacterSkill}、{@link AdvancedBadCharacterSkill}</h5>
 * @author PYmili
 */
public class MagicMonster implements BasicBadCharacterSkill, AdvancedBadCharacterSkill {
    public String name;

    public MagicMonster(String name) {
        this.name = name;
    }

    @Override
    public void magicAttack() {
        System.out.println(this.name + "发动魔法攻击");
    }

    @Override
    public void basicAttack() {
        System.out.println(this.name + "发动基础攻击");
    }
}
