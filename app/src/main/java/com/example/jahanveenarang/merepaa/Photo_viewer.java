package com.example.jahanveenarang.merepaa;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import spencerstudios.com.bungeelib.Bungee;

public class Photo_viewer extends AppCompatActivity {


    TextView button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_viewer);

        button = findViewById(R.id.button);

        MediaPlayer ring= MediaPlayer.create(Photo_viewer.this,R.raw.papa);
        ring.start();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Photo_viewer.this , Second_View.class);
                Bungee.shrink(Photo_viewer.this);
                startActivity(i);
                finish();
            }
        });




    }
}
