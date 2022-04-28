package com.example.ws_cube_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent fromActivity = getIntent();
       String title = fromActivity.getStringExtra("title");
       String student = fromActivity.getStringExtra("student");
       int  roll = fromActivity.getIntExtra("roll no", 0);

        TextView txtStudentInfo = findViewById(R.id.txtStudentInfo);
        txtStudentInfo.setText("roll no : "+ roll+" name : "+ student);  // for set text

        // for set title
        getSupportActionBar().setTitle(title);
    }
}