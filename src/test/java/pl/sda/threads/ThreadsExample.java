package pl.sda.threads;

import org.junit.jupiter.api.Test;

public class ThreadsExample {

    @Test
    void runnableBasics() {
        // 1 sposob
        Runnable ourRunnable = new OurRunnable(); // polimorfizm
        //  ourRunnable.run();// to uruchomi się w wątku main

        // 2 sposob
        Runnable runnable = new Runnable() {  // Klasa anonimowa
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " klasa anonimowa");
            }
        };
        // 3 sposob
        Runnable lambaRunnable = ()-> System.out.println(Thread.currentThread().getName() + " lambda");

        // Te prace uruchomią się w aktualnym wątku - watek Main
        ourRunnable.run();
        runnable.run();
        lambaRunnable.run();

        // Powolujemy 3 nowych pracownikow - watki i przekazujemy im prace do wykonania
        Thread t1 = new Thread(ourRunnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(lambaRunnable);

        //  t1.run(); // wykonanie na watku metody run spowoduje wykonanie pracy w watku AAKTUALNYM
        t1.start();
        t2.start();
        t3.start();

    }
}
