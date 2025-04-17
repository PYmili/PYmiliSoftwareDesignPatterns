package DependencyInversionPrinciple;

/**
 * <h1>汽车租借类的实现2</h1>
 * @author PYmili
 */
public class CarImplementTwo implements CarManuFactory {
    @Override
    public void rent(String model) {
        rentCar(model);
    }

    /**
     * {@link CarImplementTwo}类自己实现租借细节
     * @param model {@link String}
     */
    private void rentCar(String model) {
        String carName = CarImplementTwo.class.getName();
        System.out.println(carName + " rented " + model);
    }
}
