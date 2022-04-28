package com.example.ws_cube_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ArrayList<String> arrId = new ArrayList<>();
    AutoCompleteTextView autoCompleteTextView;
    ArrayList<String> arrlanguages = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        autoCompleteTextView = findViewById(R.id.actxtView);

        // for spinner

        arrId.add("aadhar card");
        arrId.add("voter Id");
        arrId.add("PAN card");
        arrId.add("Driving licence card");
        arrId.add("ration card card");
        arrId.add("Xth score card");
        arrId.add("XIIth score card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrId);
        spinner.setAdapter(spinnerAdapter);

        // for autocompletetextview

        arrlanguages.add("c");
        arrlanguages.add("c++");
        arrlanguages.add("java");
        arrlanguages.add("html");
        arrlanguages.add("css");
        arrlanguages.add("c#");
        arrlanguages.add("swift");
        arrlanguages.add("nodeJS");
        arrlanguages.add("angular");
        arrlanguages.add("python");
        arrlanguages.add("dart");

        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrlanguages);
        autoCompleteTextView.setAdapter(actvAdapter);
        autoCompleteTextView.setThreshold(1);
    }
}