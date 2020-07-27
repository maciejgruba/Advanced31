package pl.sda.advanced.oop2;

import java.math.BigDecimal;

public class OOP2 {
    public static void main(String[] args) {
        personBasics();
        Polymorfizm();
        interfaces();

    }

    private static void interfaces() {
        ageHolder studentPerson1 = new Student("Jan", "Kowalski", BigDecimal.valueOf(200));
        ageHolder dog = new Dog(5);


        ageHolder[] ageHolders = new ageHolder[]{studentPerson1,dog};
        for (ageHolder ageHolder : ageHolders) {
            System.out.println(ageHolder.getAge());
        }
    }

    private static void Polymorfizm() {
        Person studentPerson = new Student("Jan", "Kowalski", BigDecimal.valueOf(200));
        Person workerPerson = new Worker("Kuba", "Nowak", BigDecimal.valueOf(5000));
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
        System.out.println(person.getIncome());
    }


    private static void personBasics() {
        Student student = new Student("Jan", "Kowalski", BigDecimal.valueOf(200));
        Worker worker = new Worker("Kuba", "Nowak", BigDecimal.valueOf(5000));

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
