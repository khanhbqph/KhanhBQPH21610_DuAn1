package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class StartScreen extends AppCompatActivity {
    ImageView loading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        loading = findViewById(R.id.load);
        startAnimation();

        Intent intent = new Intent(StartScreen.this, MainActivity.class);
        CountDownTimer countDownTimer = new CountDownTimer(6000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                startActivity(intent);
                finish();
            }
        }.start();
    }

    private void startAnimation() {
            Animation animLoading = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim);
            loading.startAnimation(animLoading);
    }
}