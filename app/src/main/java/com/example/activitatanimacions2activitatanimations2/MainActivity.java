package com.example.activitatanimacions2activitatanimations2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int SPLASH_SCREEN = 2000;

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Hooks

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };

        Handler h = new Handler();
        h.postDelayed(r, SPLASH_SCREEN );
    }
}