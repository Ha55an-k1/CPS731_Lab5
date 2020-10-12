package com.example.masterdetailflowlab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;



public class Splash extends AppCompatActivity {
    MediaPlayer soundbite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        soundbite= new MediaPlayer();
        soundbite= MediaPlayer.create(this,R.raw.secunda);
        soundbite.start();

        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                finish();
                soundbite.stop();
                startActivity(new Intent(Splash.this, MusicianListActivity.class));

            }
        };

        Timer oppening= new Timer();
        oppening.schedule(task,5000);
    }
}