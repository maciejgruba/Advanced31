package pl.sda.advanced.oop2;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;

public class OOP2 {
    public static void main(String[] args) {
        personBasics();
        Polymorfizm();
        interfaces();

        Countries poland = Countries.POLAND; // instancja enuma - obiekt Poland
        System.out.println(poland.name());
        System.out.println(poland.toString());
        System.out.println(poland); // toString jest domyslnie odpalany

        Countries[] values = Countries.values();
        System.out.println(Arrays.toString(values));// wyswietlenie w tablicy

        String polandText = "Poland";
        Countries countries = Countries.valueOf(polandText.toUpperCase());
        System.out.println(countries);  // mozna go wylapac ze stringa



    }

    private static void interfaces() {
        ageHolder studentPerson1 = new Student("Jan", "Kowalski", BigDecimal.valueOf(200), Countries.POLAND);
        ageHolder dog = new Dog(5);


        ageHolder[] ageHolders = new ageHolder[]{studentPerson1, dog};
        for (ageHolder ageHolder : ageHolders) {
            System.out.println(ageHolder.getAge());
        }
    }

    private static void Polymorfizm() {
        Person studentPerson = new Student("Jan", "Kowalski", BigDecimal.valueOf(200), Countries.POLAND);
        Person workerPerson = new Worker("Kuba", "Nowak", BigDecimal.valueOf(5000), Countries.POLAND);
        printIncome(studentPerson);
        printIncome(workerPerson);


        Person[] people = new Person[]{studentPerson, workerPerson};
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            String name = person.introduceMyself();
            System.out.println(name);
            if (person instanceof Student) { // sprawdzanie czy obiekt na ktory wskazuje zmienna jest typu student
                BigDecimal moneyFromMum = ((Student) person).getMoneyFromMum();// jezeli jest to mozemy rzutowac ( Student)
                System.out.println(moneyFromMum);
            }
            if (person instanceof Worker) {
                BigDecimal moneyFromWork = ((Worker) person).getMoneyFromWork();
                System.out.println(moneyFromWork);
            }
        }
    }

    // przyklad przypisania studenta/workera do klasy Person(zduplikowany kod)
//    public static void printIncome(Student student){
//        System.out.println(student.getIncome());
//    }
//    public static void printIncome(Worker worker){
//        System.out.println(worker.getIncome());
//    }
    public static void printIncome(Person person) {
        System.out.println(person.getIncome() + "tu");
    }


    private static void personBasics() {
        Student student = new Student("Jan", "Kowalski", BigDecimal.valueOf(200), Countries.POLAND);
        Worker worker = new Worker("Kuba", "Nowak", BigDecimal.valueOf(5000), Countries.POLAND);

        // Person person = new Person("Jakiś", "Człowiek");// nie da sie utworzyc obiektu klasy abstrakcyjnej
        System.out.println(student);
        System.out.println(worker);
        System.out.println(student.introduceMyself());
        System.out.println(worker.introduceMyself());
        System.out.println(student.getIncome());
        System.out.println(worker.getIncome());

        System.out.println(student.getMoneyFromMum());
        System.out.println(worker.getMoneyFromWork());
    }
}
