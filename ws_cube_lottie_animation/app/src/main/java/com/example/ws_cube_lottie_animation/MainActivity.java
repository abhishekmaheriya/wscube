package com.example.ws_cube_lottie_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView laView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        laView = findViewById(R.id.laView);
//        laView.setAnimation(R.raw.lf20_hzyzmdld);
//        laView.playAnimation();
//        laView.loop(true);
    }
}
