package DependencyInversionPrinciple;

public class Client {

    /**
     * <h1>高层对接口层的使用。</h1>
     * @param cm {@link CarManuFactory}
     * @param model {@link String}
     */
    public static void rentCar(CarManuFactory cm, String model) {
        cm.rent(model);
    }

    public static void main(String[] args) {
        CarManuFactory carManuFactory = new CarImplementOne();
        rentCar(carManuFactory, "BMW X5");
        carManuFactory = new CarImplementTwo();
        rentCar(carManuFactory, "Xiaomi su7");
    }
}
