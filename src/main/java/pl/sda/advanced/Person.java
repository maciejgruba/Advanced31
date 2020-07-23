package pl.sda.advanced;

public class Person {
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
        Person person = (Person) o;
        return this.id.equals(person.id);
    }

    public int hashCode(){
        return id.hashCode();
    }
}
