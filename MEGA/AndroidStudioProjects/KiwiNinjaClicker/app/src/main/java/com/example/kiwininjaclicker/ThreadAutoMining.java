package com.example.kiwininjaclicker;

public class ThreadAutoMining extends Thread {
    private MainActivity main;

    public ThreadAutoMining(MainActivity main){
        this.main = main;
    }

    @Override
    public void run() {
        while (true) {
            autoMining autoMining = new autoMining(main);
            autoMining.run();
            // traitement du thread
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }
    }
}
