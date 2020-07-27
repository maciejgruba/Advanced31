package pl.sda.advanced.oop2;

public class OOP2 {
    public static void main(String[] args) {
        Student student = new Student("Jan", "Kowalski");
        Worker worker = new Worker("Kuba", "Nowak");

        System.out.println(student);
        System.out.println(worker);
        System.out.println(student.introduceMyself());
        System.out.println(worker.introduceMyself());

//        student.setFirstName("Jan");
//        student.setLastName("Nowak");
//
//        worker.setFirstName("Kuba");
//        worker.setLastName("Kowalski");
    }
}
