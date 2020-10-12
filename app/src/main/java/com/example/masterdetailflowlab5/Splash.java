package com.example.masterdetailflowlab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(Splash.this, MusicianDetailActivity.class));

            }
        };
        Timer oppening= new Timer();
        oppening.schedule(task,5000);
    }
}