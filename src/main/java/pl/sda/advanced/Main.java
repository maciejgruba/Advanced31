package pl.sda.advanced;

public class Main {
    public static void main(String[] args) {
        createCarsBasic();
    }

    private static void createCarsBasic() {
        Car car = new Car();
        car.setModel("Viper");
        car.setManufacturer("Dodge");
        car.setVIN("123");
        System.out.println(car.getModelAndManufacturer());

        Car car2 = new Car();
        car2.setModel("A4");
        car2.setManufacturer("Audi");
        System.out.println(car2.getModelAndManufacturer());

        Car car3 = car2;
        car3.setModel("A8");
        System.out.println(car3.getModelAndManufacturer());

        System.out.println(car3);

        Car car4 = new Car();
        car4.setModel("Viper");
        car4.setManufacturer("Dodge");
        car4.setVIN("123");

        System.out.println("Samochody takie same: " + car.equals(car4));


        System.out.println("Samochody te same: " + (car == car4));
    }
}
