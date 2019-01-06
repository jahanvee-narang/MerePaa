package com.example.jahanveenarang.merepaa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.simmorsal.library.Entry;
import com.simmorsal.library.ScatterImageView;

import spencerstudios.com.bungeelib.Bungee;

public class Second_View extends AppCompatActivity {

    ImageView finish ;
 int splash_time  = 6000 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second__view);


       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {


               Intent i = new Intent( Second_View.this , Last.class);
               Bungee.diagonal(Second_View.this);
               startActivity(i);
               finish();

           }
       },splash_time);


    }
}

