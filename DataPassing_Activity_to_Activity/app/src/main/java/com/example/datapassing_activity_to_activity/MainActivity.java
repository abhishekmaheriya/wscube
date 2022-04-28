package com.example.datapassing_activity_to_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, surname1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        surname1 = findViewById(R.id.surname);
        btn = findViewById(R.id.btnsend);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username= name.getText().toString();
                String surname = surname1.getText().toString();

                Intent intent = new Intent(getApplicationContext(), get_Data.class);
                intent.putExtra("keyname", username);
                intent.putExtra("keysurname",surname);
                startActivity(intent);
            }
        });

    }
}