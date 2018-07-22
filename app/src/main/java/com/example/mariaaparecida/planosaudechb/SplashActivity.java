package com.example.mariaaparecida.planosaudechb;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.id;

/**
 * Created by Alexsander on 08/08/2016.
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView imageView =findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        imageView.startAnimation(animation);

        TextView textView =findViewById(R.id.textView);
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        textView.startAnimation(animation);

        TextView textView1 =findViewById(R.id.textView1);
        Animation anima = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        textView1.startAnimation(animation);

   Thread time=new Thread() {
       @Override
       public void run() {
           try {
               sleep(3000);
               Intent intent = new Intent(getApplicationContext(), MainActivity.class);
               startActivity(intent);
               finish();
               super.run();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

       };
       time.start();
   }
    }