package pl.sda.advanced;

public class Main {
    public static void main(String[] args) {
        createCarsBasic();
        createCarsWithOptions();
        createPerson();









    }
    public static void createPerson(){
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setFirstName("Nikolas");
        person2.setFirstName("Nikolas");

        person1.setLastName("Nowakowski");
        person2.setLastName("Nowakowskii");

        person1.setId("88091231213");
        person2.setId("88091231213");

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode()==person2.hashCode());
    }

    public static void createCarsWithOptions() {
        CarOption first = new CarOption();
        CarOption second = new CarOption();

        first.setOptionPrice(13.0);
        first.setOptionName("Radio");
        first.setChosen(true);

        second.setOptionPrice(130.00);
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
