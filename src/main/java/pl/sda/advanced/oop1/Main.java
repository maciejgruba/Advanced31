package pl.sda.advanced.oop1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        createCarsBasic();
        createCarsWithOptions();
        createPerson();

        CarOption radio = new CarOption("Radio- Nemesis", BigDecimal.valueOf(50000));
        CarOption whipers = new CarOption("Wycieraczki", BigDecimal.valueOf(170));

        Car car = new Car();
        car.setManufacturer("Skoda");
        car.setModel("Fabia");
        car.setOptions(new CarOption[]{radio, whipers});
    }

    public static void createPerson() {
        PersonTest personTest1 = new PersonTest();
        PersonTest personTest2 = new PersonTest();

        personTest1.setFirstName("Nikolas");
        personTest2.setFirstName("Nikolas");

        personTest1.setLastName("Nowakowski");
        personTest2.setLastName("Nowakowskii");

        personTest1.setId("88091231213");
        personTest2.setId("88091231213");

        System.out.println(personTest1 == personTest2);
        System.out.println(personTest1.equals(personTest2));
        System.out.println(personTest1.hashCode() == personTest2.hashCode());
    }

    public static void createCarsWithOptions() {
        CarOption first = new CarOption();
        CarOption second = new CarOption();

        first.setOptionPrice(BigDecimal.valueOf(130.0));
        first.setOptionName("Radio");
        first.setChosen(true);

        second.setOptionPrice(BigDecimal.valueOf(1300.00));
        second.setOptionName("DiamondRadio");
        second.setChosen(true);

        CarOption[] tab = new CarOption[2];
        tab[0] = first;
        tab[1] = second;

        CarOption[] tab2 = new CarOption[]{first, second};
        Car car = new Car();
        car.setModel("Fabia");
        car.setManufacturer("Skoda");
        car.setOptions(tab);
        System.out.println();
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
