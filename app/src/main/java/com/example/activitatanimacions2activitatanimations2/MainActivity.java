package com.example.activitatanimacions2activitatanimations2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int SPLASH_SCREEN = 2000;

    private ImageView imageView;
    private ImageView imageBack;


    private TextView textView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Hooks

        imageView = findViewById(R.id.imageView);
        imageBack = findViewById(R.id.imageBack);

        textView = findViewById(R.id.textView);

      //  imageBack.setTranslationY(0f);
        imageBack.animate().translationY(-1900f).setDuration(800).setStartDelay(500);



        Runnable r = new Runnable() {
            @Override
            public void run() {
                //intent
                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View, String>(imageView, "imageapp");
                pairs[1] = new Pair<View, String>(textView, "textapp");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                        pairs);
                startActivity(intent, options.toBundle());

            }
        };

        Handler h = new Handler(Looper.getMainLooper());
        h.postDelayed(r, SPLASH_SCREEN );
    }
}