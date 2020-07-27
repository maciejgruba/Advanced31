package pl.sda.advanced.oop2;

public class Dog implements ageHolder {
    private int age;

    public Dog(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
