package com.example.shared_preference_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences preferences = getSharedPreferences("login",MODE_PRIVATE);
                Boolean check =  preferences.getBoolean("flag", false);

                if(check){ // If user is logged in

                    Intent inext = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(inext);

                }else{      //if user is not logged in

                    Intent inext = new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(inext);
                }

            }
        },3000);
    }
}