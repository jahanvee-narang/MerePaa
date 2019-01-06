package com.example.jahanveenarang.merepaa;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import spencerstudios.com.bungeelib.Bungee;

public class Bio_view extends AppCompatActivity {

    ImageView cloud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_view);

        cloud = findViewById(R.id.cloud);
        cloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Bio_view.this, Message_VIew.class));
                Bungee.split(Bio_view.this);
                finish();
            }
        });

    }
}
