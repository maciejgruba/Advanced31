package pl.sda.threads;

public class OurRunnable implements Runnable{   // praca do wykonania
    @Override
    public void run() {  // szczegóły pracy i jej rozpoczęcie
        System.out.println(Thread.currentThread().getName() + " klasa OurRunnable");

    }


}
