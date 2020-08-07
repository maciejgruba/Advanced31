package pl.sda.bank;

public class Bank {  // static - bedzie jedno w skali aplikacji
    private static Integer balance = 1000; // pieniadze wyrazamy Integerem tylko dla celu zadania
    private static Integer counter = 0;

    public static synchronized void withdraw(Integer amount) {
        balance = balance - amount;
        System.out.println(Thread.currentThread().getName() + " Bilans konta po wypłacie: " + balance);

    }

    public static synchronized void deposit(Integer amount) {
        balance = balance + amount;
        System.out.println(Thread.currentThread().getName() + " Bilans konta po wpłacie: " + balance);
        counter++;
    }

    public static void printBalance() {
        System.out.println("Bilans po wszystkich operacjach: " + balance);
        System.out.println("liczba operacji: " + counter);
    }
}
