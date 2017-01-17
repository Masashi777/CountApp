package com.example.akitoshihashizume.myapplication;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int number = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        textView.setText(String.valueOf(number));
    }

    public void add(View v){

        number++;
        textView.setText(String.valueOf(number));
    }

    public void minus(View v){

        number --;
        textView.setText(String.valueOf(number));
    }
}
