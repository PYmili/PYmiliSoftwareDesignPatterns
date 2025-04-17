package LiskovSubstitutionPrinciple.RequirementTwo;

public class Client {
    public static void main(String[] args) {
        AbstractRoles superRoles = new RightSuperRoles();
        System.out.println(superRoles.RolesToList(new String[]{"a", "b"}));
    }
}
