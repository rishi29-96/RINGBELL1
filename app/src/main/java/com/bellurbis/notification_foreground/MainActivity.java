package com.bellurbis.notification_foreground;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;

public class MainActivity extends AppCompatActivity {

    @Override
    //When an Activity first call or launched then onCreate(Bundle savedInstanceState) method is responsible to create the activity.//
    protected void onCreate(Bundle savedInstanceState) {
        // by calling  code in addition to the existing code in the onCreate() of the parent class.
        // If you leave out this line, then only your code is run. The existing code is ignored completely.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//default ringtone syntax
        MediaPlayer player =  MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        //set looping
        player.setLooping(true);
        //executed
        player.start();


    }
}