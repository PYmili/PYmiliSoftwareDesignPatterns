package LiskovSubstitutionPrinciple.RequirementTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>对抽象角色类的实现</h1>
 * @author PYmili
 */
public class WrongSuperRoles extends AbstractRoles {
    // @Override
    // public List<String> RolesToList(String[] roles) {
    //     return null;
    // }

    /**
     * <h3>上面为错误的写法，子类继承父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更严格才对。</h3>
     * @param roles {@code String[]}
     * @return {@link ArrayList<String>}
     */
    @Override
    public ArrayList<String> RolesToList(String[] roles) {
        return null;
    }
}
