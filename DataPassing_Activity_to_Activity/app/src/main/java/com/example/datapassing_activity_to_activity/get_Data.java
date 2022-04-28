package com.example.datapassing_activity_to_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class get_Data extends AppCompatActivity {
    private TextView txt1, txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);
        txt1 = findViewById(R.id.txt1);
        txt2 =  findViewById(R.id.txt2);

        String username = getIntent().getStringExtra("keyname");
        String surname = getIntent().getStringExtra("keysurname");

        txt1.setText(username);
        txt2.setText(surname);
    }
}