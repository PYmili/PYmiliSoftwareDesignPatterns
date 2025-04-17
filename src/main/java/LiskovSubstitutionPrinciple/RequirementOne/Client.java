package LiskovSubstitutionPrinciple.RequirementOne;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        SuperCalculator superCalculator = new SuperCalculator();
        // 错误的重载父类方法后，导致的继承后的子类方法无法使用父类原有功能。
        System.out.println(calculator.calculator(10, 10));
        System.out.println(superCalculator.calculator(10, 10));
        // 可以扩展父类方法或增加子类的方法
        System.out.println(superCalculator.add(10, 10));
        System.out.println(superCalculator.subtract(100, 10));
    }
}
