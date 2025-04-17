package LiskovSubstitutionPrinciple.RequirementThree;

/**
 * <h1>Java编程语言，对抽象编程语言类的实现</h1>
 * @author PYmili
 */
public class JavaProgrammingLanguage extends AbstractProgrammingLanguage {

    /**
     * 对父类抽象方法的实现。
     * @param format {@link String}
     * @param args {@link Object}
     */
    @Override
    public void printf(String format, Object ... args) {
        System.out.printf(format, args);
    }

    /**
     * 自己的扩展类
     * @param s {@link String}
     */
    public void println(String s) {
        System.out.println(s);
    }
}
