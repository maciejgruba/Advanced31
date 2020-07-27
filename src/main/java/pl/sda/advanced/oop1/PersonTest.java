package pl.sda.advanced.oop1;

import java.util.Objects;

// ta klasa jest muttable- poniewaz zawiera settery

public class PersonTest {
    private String firstName;
    private String lastName;
    private int age;
    private String id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        PersonTest personTest = (PersonTest) o;
        return Objects.equals(personTest.id,this.id);
    }

    public int hashCode(){
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
