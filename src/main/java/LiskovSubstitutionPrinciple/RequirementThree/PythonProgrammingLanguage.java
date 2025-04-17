package LiskovSubstitutionPrinciple.RequirementThree;

/**
 * <h1>Python编程语言，对抽象编程语言类的实现</h1>
 * @author PYmili
 */
public class PythonProgrammingLanguage extends AbstractProgrammingLanguage {

    /**
     * 对父类方法的实现。
     * @param format {@link String}
     * @param args {@link Object}
     */
    @Override
    public void printf(String format, Object ... args) {
        System.out.printf(format, args);
    }

    /**
     * 自己实现的方法
     * @param object {@link Object}
     */
    public void print(Object object) {
        System.out.print(object);
    }
}
