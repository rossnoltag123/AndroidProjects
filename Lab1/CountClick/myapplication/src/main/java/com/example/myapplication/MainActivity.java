package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
     TextView textView1;
    int clickCount = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     btn1 = (Button) findViewById(R.id.btn1);
        textView1 = (TextView) findViewById(R.id.textView1);

    btn1.setOnClickListener(new OnClickListener() {
        public void onClick (View v){
            clickCount++;
            textView1.setText("" + clickCount);
        }
    });
    }
}
