package com.example.kiwininjaclicker;

import android.util.Log;

public class autoMining implements Runnable {
    private MainActivity main;

    autoMining(MainActivity main){
        this.main = main;
    }

    public void run(){
        main.incrementNbrClick(1);
    }
}
