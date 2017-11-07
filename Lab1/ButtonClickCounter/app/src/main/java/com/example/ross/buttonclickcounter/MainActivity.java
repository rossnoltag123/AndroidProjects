package com.example.ross.buttonclickcounter;

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

    public void onClickButtonB(View view) {
        TextView tv = (TextView) findViewById(R.id.mytextView);
        tv.setText("You clicked button B");
    }

    public void onClickButtonA(View view) {
        TextView tv = (TextView) findViewById(R.id.mytextView);
        tv.setText("You clicked button A");
    }
}
