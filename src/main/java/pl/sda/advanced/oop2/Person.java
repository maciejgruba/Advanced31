package pl.sda.advanced.oop2;

import java.math.BigDecimal;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Countries country;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String introduceMyself(){
        return "Jestem człowiekiem";
    }

    public abstract BigDecimal getIncome();// metoda abstrakcyjna
    // nie posiada ciała i wymaga nadpisania





    public Person(String firstName, String lastName, Countries country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country=" + country +
                '}';
    }
}
