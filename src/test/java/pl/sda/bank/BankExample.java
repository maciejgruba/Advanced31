package pl.sda.bank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BankExample {
    @Test
    void sequential() {
        for (int i = 0; i <100 ; i++) {
            ClientAction clientAction = new ClientAction();

            clientAction.run();
        }
    }

    @Test
    void threads() {
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            ClientAction clientAction = new ClientAction();

            Thread t = new Thread(clientAction); // clientsAction to Nasza praca
            threadList.add(t);
        }
        for (Thread thread : threadList) {
            thread.start();

        }
        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Bank.printBalance();
    }
}
