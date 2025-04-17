package LiskovSubstitutionPrinciple.RequirementTwo;

import java.util.ArrayList;
import java.util.Arrays;

public class RightSuperRoles extends AbstractRoles {
    /**
     * <h3>正确的写法，后置条件要么更严格，要么就保持一致。</h3>
     * @param roles {@code String[]}
     * @return {@link ArrayList<String>}
     */
    @Override
    public ArrayList<String> RolesToList(String[] roles) {
        if (roles.length == 0)
            return null;
        return new ArrayList<>(Arrays.asList(roles));
    }
}
