
package com.example.jahanveenarang.merepaa;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import spencerstudios.com.bungeelib.Bungee;

public class SplashScreen extends AppCompatActivity {

   public static final  int SPLASH_TME = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.papa);
      //  Bitmap circularBitmap = Photto.getRoundedCornerBitmap(bitmap, 100);

        MediaPlayer ring= MediaPlayer.create(SplashScreen.this,R.raw.bdayy);
        ring.start();

        ImageView circularImageView = (ImageView) findViewById(R.id.imageView);
       // circularImageView.setImageBitmap(circularBitmap);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, Bio_view.class));
                Bungee.inAndOut(SplashScreen.this);
                finish();
            }
        } , SPLASH_TME);
    }
}
