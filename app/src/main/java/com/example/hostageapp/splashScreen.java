package com.example.hostageapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class splashScreen extends AppCompatActivity {

    private static int SPLASH_SCREEN = 3000;
    Animation topAnim,bottomAnim;
    ImageView image;
    TextView Logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);

       topAnim= AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        image=findViewById(R.id.logoImg);
        Logo=findViewById(R.id.logoTxt);

        image.setAnimation(topAnim);
        Logo.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= Intent(LoginActivity.this,LoginActivity.class);
            }
        }).SPLASH_SCREEN;


    }
}