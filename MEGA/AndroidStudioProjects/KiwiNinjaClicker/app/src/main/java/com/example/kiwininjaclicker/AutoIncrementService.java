package com.example.kiwininjaclicker;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class AutoIncrementService extends Service {
//
//    private final int UPDATE_INTERVAL = 1000;
//    private Timer timer = new Timer();
//    private float bonus;
//    private MainActivity main;
//
//    public AutoIncrementService(float bonus, MainActivity main){
//        this.bonus = bonus;
//        this.main = main;
//        this.onCreate();
//        Log.d("", "AutoIncrementService: constructeur");
//    }
//
//    @Override
//    public IBinder onBind(Intent intent) {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
//    @Override
//    public void onCreate() {
//        // Code to execute when the service is first created
//
//        Log.d("salut", "onCreate: ");
//    }
//
//    @Override
//    public void onDestroy() {
//        if (timer != null) {
//            timer.cancel();
//        }
//    }
//
//    @Override
//    public int onStartCommand(Intent intent, int flags, int startid) {
//        Log.d("start", "onStartCommand: ");
//        main.incrementNbrClick(bonus);
//        timer.scheduleAtFixedRate(new TimerTask() {
//
//            @Override
//            public void run() {
//                // Check if there are updates here and notify if true
//            }
//        }, 0, UPDATE_INTERVAL);
//        return START_STICKY;
//    }
//
//    private void stopService() {
//        if (timer != null) timer.cancel();
//    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //TODO do something useful
        Log.d("yo", "onStartCommand: ");
        return Service.START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        //TODO for communication return IBinder implementation
        return null;
    }
}
