package com.example.wscube_notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String CHANNEL_ID = "My Channel";
    private static final int NOTIFICATION_ID = 100;
    private static final int REQ_CODE = 101;
    Notification notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // convert drawable to bitmap
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.help, null);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        Bitmap largeIcon = bitmapDrawable.getBitmap();
    // custom notifucation
        Intent inotify = new Intent(getApplicationContext(),MainActivity.class);
        inotify.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pi = PendingIntent.getActivity(this,REQ_CODE,inotify,PendingIntent.FLAG_UPDATE_CURRENT);

        Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle()
                .bigPicture(((BitmapDrawable)(ResourcesCompat.getDrawable(getResources(), R.drawable.help, null))).getBitmap())
                .bigLargeIcon(largeIcon)
                .setBigContentTitle("Image sent by mitesh")
                .setSummaryText("Image Message");
    //

        Notification.InboxStyle inboxStyle = new Notification.InboxStyle()
                .addLine("a")
                .addLine("b")
                .addLine("c")
                .addLine("d")
                .addLine("e")
                .addLine("f")
                .addLine("g")
                .addLine("h")
                .addLine("i")
                .addLine("j")
                .addLine("k")
                .addLine("l")
                .addLine("m")
                .addLine("n")
                .addLine("o")
                .addLine("p")
                .addLine("q")
                .addLine("r")
                .setBigContentTitle("Full Messages")
                .setSummaryText("Message from Mitesh");


        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
             notification = new Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.help)
                    .setContentText("New Message")
                    .setSubText("New Message from Abhishek")
                     //custom notification
                     .setContentIntent(pi)
                     .setStyle(inboxStyle)
                     .setOngoing(true)
                     .setAutoCancel(false)
                      //

                    .setChannelId(CHANNEL_ID)
                    .build();
             nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID,"New Channel",NotificationManager.IMPORTANCE_HIGH));
        }else{
            notification = new Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.help)
                    .setContentText("New Message")
                    .setSubText("New Message from Abhishek")
                    //
                    .setContentIntent(pi)
                    .setStyle(inboxStyle)
                    .setOngoing(true)
                    .setAutoCancel(false)
                    //
                    .build();
        }

        nm.notify(NOTIFICATION_ID,notification);
    }
}