package pl.sda.advanced.oop2;

public class Worker extends Person {
    public Worker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String introduceMyself() {
        return "jestem pracownikiem";
    }
}
