package com.example.ws_cube_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    int[] arrNo = new int[]{1,2,3,4,5,6};
    ArrayList<String> arrNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        arrNames.add("abhi");
        arrNames.add("mitesh");
        arrNames.add("kavi");
        arrNames.add("gabbar");
        arrNames.add("deep");
        arrNames.add("abhi");
        arrNames.add("mitesh");
        arrNames.add("kavi");
        arrNames.add("gabbar");
        arrNames.add("deep");
        arrNames.add("abhi");
        arrNames.add("mitesh");
        arrNames.add("kavi");
        arrNames.add("gabbar");
        arrNames.add("deep");
        arrNames.add("abhi");
        arrNames.add("mitesh");
        arrNames.add("kavi");
        arrNames.add("gabbar");
        arrNames.add("deep");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int positon, long l) {

                if (positon==0){
                    Toast.makeText(MainActivity.this, "first item  ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
