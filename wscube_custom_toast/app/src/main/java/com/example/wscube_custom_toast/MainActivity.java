package com.example.wscube_custom_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toast.makeText(this, "Good morning", Toast.LENGTH_SHORT).show();

        Toast toast = new Toast(getApplicationContext());
       View view = getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.viewContainer));
        toast.setView(view);

        txtMsg = view.findViewById(R.id.txtmsg);
        txtMsg.setText("Message sent Sucessfully");
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }
}