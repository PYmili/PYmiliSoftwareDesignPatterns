package LiskovSubstitutionPrinciple.RequirementThree;

/**
 * <h1>编程语言抽象类</h1>
 * @author PYmili
 */
public abstract class AbstractProgrammingLanguage {
    public String name;

    public abstract void printf(String format, Object ... args);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
