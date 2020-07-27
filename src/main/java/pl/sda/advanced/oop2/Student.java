package pl.sda.advanced.oop2;

public class Student extends Person {   //student rozszerza mozliwosci klasy
    public Student(String firstName, String lastName) {
        super(firstName, lastName); // super()- wywolanie konstruktora z nadklasy(Person)

    }

    @Override
    public String introduceMyself() {
        return "jestem studentem";
    }
}
