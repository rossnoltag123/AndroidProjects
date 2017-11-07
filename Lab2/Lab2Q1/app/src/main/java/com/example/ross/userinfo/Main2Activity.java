package com.example.ross.userinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameView = (TextView) findViewById(R.id.textView5);
        nameView.setText(getIntent().getExtras().getString("userName"));

       // public void onClicked(View v){
       // Intent myIntent = new Intent(this,MainActivity.class);
    }

}

