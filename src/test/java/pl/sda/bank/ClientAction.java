package pl.sda.bank;

import java.util.Random;

public class ClientAction implements  Runnable{
    // symulacja wplaty i wyplaty

    @Override
    public void run() {
        // double v = Math.random() * 100;
        int amount = new Random().nextInt(100); // podany zakres

        Bank.withdraw(amount);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Bank.deposit(amount);
    }



}
