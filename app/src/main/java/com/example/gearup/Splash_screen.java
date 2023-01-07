package com.example.gearup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Splash_screen extends AppCompatActivity {
    private TextView text;
    private static int Splash_timeout = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        text = findViewById(R.id.app_title);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashintent = new Intent(Splash_screen.this,IntroActivity.class);
                startActivity(splashintent);
                finish();
            }
        },Splash_timeout);
        Animation myanimation = AnimationUtils.loadAnimation(Splash_screen.this,R.anim.splash_anim);
        text.startAnimation(myanimation);



    }
}












