package com.example.mashka.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View v) {

        String strHello = "Hello";
        String strWorld = "World";

        ((TextView) findViewById(R.id.textView)).setText(strHello + " " + strWorld);

    }
}