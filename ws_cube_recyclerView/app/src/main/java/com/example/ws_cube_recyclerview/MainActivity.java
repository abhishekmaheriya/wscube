package com.example.ws_cube_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ContactModel> arrayContacts = new ArrayList<>();
    FloatingActionButton btnOpenDialog;
    RecyclerContactAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerContact);
        btnOpenDialog = findViewById(R.id.btnOpenDialog);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_update_lay);

                EditText edtName = dialog.findViewById(R.id.edtName);
                EditText edtNumber = dialog.findViewById(R.id.edtNumber);
                Button btnAction = dialog.findViewById(R.id.btnAction);

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name = "", number = "";

                        if (!edtName.getText().toString().equals("")){
                           name = edtName.getText().toString();
                        }else{
                            Toast.makeText(MainActivity.this, "Please Enter Contact Name", Toast.LENGTH_SHORT).show();
                        }
                        if (!edtNumber.getText().toString().equals("")) {
                            number = edtNumber.getText().toString();
                        }else{
                            Toast.makeText(MainActivity.this, "Please Enter Contact Number", Toast.LENGTH_SHORT).show();
                        }

                        arrayContacts.add(new ContactModel(name, number));
                         adapter.notifyItemInserted(arrayContacts.size()-1);
                        recyclerView.scrollToPosition(arrayContacts.size()-1);
                    }
                });
                dialog.show();
            }
        });





        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"abhi","7096345713"));
        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"abhishek","7096345713"));
        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"mitesh","7096345713"));
        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"kavi","7096345713"));
        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"gabbar","7096345713"));
        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"abhi","7096345713"));
        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"abhishek","7096345713"));
        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"mitesh","7096345713"));
        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"kavi","7096345713"));
        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"gabbar","7096345713"));
        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"abhi","7096345713"));
        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"abhishek","7096345713"));
        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"mitesh","7096345713"));
        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"kavi","7096345713"));
        arrayContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"gabbar","7096345713"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrayContacts);
        recyclerView.setAdapter(adapter);

    }
}