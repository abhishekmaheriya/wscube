package com.example.wscube_tech_implicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnDial, btnMsg, btnShare, btnEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDial = findViewById(R.id.dailing);
        btnMsg = findViewById(R.id.messaging);
        btnEmail = findViewById(R.id.email_send);
        btnShare = findViewById(R.id.sharing);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent idail = new Intent(Intent.ACTION_DIAL);
//                idail.setAction(Intent.ACTION_DIAL);   another way to dial
                idail.setData(Uri.parse("tel: +917096345713"));
                startActivity(idail);
            }
        });

        btnMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imsg = new Intent(Intent.ACTION_SENDTO);
                imsg.setData(Uri.parse("smsto: "+Uri.encode(" +919925468551")));
                imsg.putExtra("sms_body","please solve this issue asap");
                startActivity(imsg);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iEmail = new Intent(Intent.ACTION_SEND);
                iEmail.setType("message/rfc822");
                iEmail.putExtra(Intent.EXTRA_EMAIL,new String[]{"maheriyaabhishek@gmail.com","abc@gmail.com"});
                iEmail.putExtra(Intent.EXTRA_SUBJECT,"Quries");
                iEmail.putExtra(Intent.EXTRA_TEXT,"please solve this issue");
                startActivity(Intent.createChooser(iEmail,"Email via"));
            }
        });
        
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iShare = new Intent(Intent.ACTION_SEND);
                    iShare.setType("text/plain");
                    iShare.putExtra(Intent.EXTRA_TEXT,"Download this application,https://github.com/abhishekmaheriya");
                    startActivity(Intent.createChooser(iShare,"share via"));
            }
        });
    }
}