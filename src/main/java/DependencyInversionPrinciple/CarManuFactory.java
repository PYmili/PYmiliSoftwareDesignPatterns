package DependencyInversionPrinciple;

/**
 * <h1>汽车租借类的接口 - 中间层</h1>
 * @author PYmili
 */
public interface CarManuFactory {
    /**
     * 租借汽车的方法
     * @param model {@link String}
     */
    void rent(String model);
}
