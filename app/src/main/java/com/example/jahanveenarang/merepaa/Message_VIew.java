package com.example.jahanveenarang.merepaa;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.ViewFlipper;

import spencerstudios.com.bungeelib.Bungee;

public class Message_VIew extends Activity {

    int SPLASH_TME = 48000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message__view);


       ViewFlipper simpleViewFlipper =  findViewById(R.id.simpleViewFlipper);
        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        simpleViewFlipper.setInAnimation(in);
        simpleViewFlipper.setOutAnimation(out);

//        TextView text_view = (TextView)findViewById(R.id.textView1);
//        Typeface font = Typeface.createFromAsset(getAssets(), "font.ttf");
//        text_view.setTypeface(font);
//        text_view.setText("पपा - यह सिर्फ एक शाब्द नई ज़िन्दगी हो हमारी , हर समेह रास्ता दिखाने के लिए , अपनी जरूरत भूलकर , हमें याद रखने के लिए , हमेशा हमारा ध्यान रखने के लिए , LOVE YOU PAPA❤");
        MediaPlayer ring= MediaPlayer.create(Message_VIew.this,R.raw.music);
        ring.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent( Message_VIew.this , Photo_viewer.class);
                Bungee.split(Message_VIew.this);
                startActivity(i);
                finish();
            }
        } , SPLASH_TME);

    }


}
