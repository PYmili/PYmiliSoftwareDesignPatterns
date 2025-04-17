package LiskovSubstitutionPrinciple.RequirementOne;

/**
 * <h1>继承计算器类 - 错误方式</h1>
 * @author PYmili
 */
public class SuperCalculator extends Calculator {
    /**
     * 错误的重载父类Calculator，不能重载子类原有的非抽象方法
     * @param x {@code int}
     * @param y {@code int}
     * @return {@return int}
     */
    public int calculator(int x, int y) {
        return x - y;
    }

    /**
     * 子类可以扩展父类功能，但不能改变父类原有的功能
     * @param x {@code int}
     * @param y {@code int}
     * @return {@return int}
     */
    public int add(int x, int y) {
        // 假设要求是 x和y > 0
        if (x < 0 || y < 0) {
            return 0;
        }
        return super.calculator(x, y);
    }

    /**
     * 子类可以扩展自己的方法。
     * @param x {@code int}
     * @param y {@code int}
     * @return {@return int}
     */
    public int subtract(int x, int y) {
        return x - y;
    }
}
