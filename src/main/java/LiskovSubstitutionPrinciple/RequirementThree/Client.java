package LiskovSubstitutionPrinciple.RequirementThree;

public class Client {
    public static void main(String[] args) {
        JavaProgrammingLanguage java = new JavaProgrammingLanguage();
        java.printf("java super printf %s", '\n');
        java.println("java println");
        PythonProgrammingLanguage python = new PythonProgrammingLanguage();
        python.printf("python super printf %s", '\n');
        python.print("python print");
    }
}
