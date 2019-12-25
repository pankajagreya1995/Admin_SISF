package com.agreyasoft.admin_sisf.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.agreyasoft.admin_sisf.R;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        ImageView img = (ImageView)findViewById(R.id.image);
        Animation Rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.cloclwise);
        img.startAnimation(Rotate);



        //stop screen 5 sec
        Handler handler=new Handler();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash_Screen.this,Login_page.class));
                finish();
            }
        };
        handler.postDelayed(runnable,5000);
    }
}
