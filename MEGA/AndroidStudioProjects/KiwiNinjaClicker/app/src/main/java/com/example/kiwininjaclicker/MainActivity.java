package com.example.kiwininjaclicker;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout mainLayout;
    private Button buttonValider;
    private TextView nbrClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonValider = (Button) findViewById(R.id.buttonValider);
        mainLayout = findViewById(R.id.mainLayout);
        nbrClick = findViewById(R.id.nbrClick);

//        ThreadAutoMining thread = new ThreadAutoMining(this);
//        thread.start();

    }

    public void pushButton(View v) {
        incrementNbrClick(1);
    }

    public void incrementNbrClick(float i){

        int n = Integer.parseInt(nbrClick.getText().toString());
        n+=i;
        Log.d("value : ", String.valueOf(n));
        nbrClick.setText(String.valueOf(n));
    }
}