package com.example.ross.anumbersgame;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    TextView score1;
    TextView score2;
    String btn1Str;
    Random rand = new Random();
    int i = 1;
    boolean bigger = false;
    boolean bigger2 = false;
    boolean smaller = false;
    int valueA = 0;
    int valueB = 0;

    int value1 = 0;
    int value2 = 0;
    int AA = 0;
    int BB = 0;

    int value11 = 0;
    int value22 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score1 = (TextView) findViewById(R.id.score1);
        //  score2 = (TextView) findViewById(R.id.score2);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        valueA = rand.nextInt(10) + 1;
        valueB = rand.nextInt(10) + 1;

        btn1.setText("" + valueA);
        btn2.setText("" + valueB);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (valueA >= valueB) {
                    // bigger = true;
                    score1.setText("" + i++);
                }

                valueA = rand.nextInt(10) + 1;
                valueB = rand.nextInt(10) + 1;

               // if (value1 >= value2) {
                   // bigger = true;
                //    score1.setText("" + i++);
              //  }

                btn1.setText("" + valueA);
                btn2.setText("" + valueB);
            }


        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (valueB >= valueA) {
                    // bigger = true;
                    score1.setText("" + i++);
                }

                valueA = rand.nextInt(10) + 1;
                valueB = rand.nextInt(10) + 1;

                // if (value1 >= value2) {
                // bigger = true;
                //    score1.setText("" + i++);
                //  }

                btn1.setText("" + valueA);
                btn2.setText("" + valueB);

           ///////     value11 = rand.nextInt(10) + 1;
           //     value22 = rand.nextInt(10) + 1;

          ///      if (value22 >= value11) {
          //          score1.setText(""+ i++);
          //      }

           ///     btn1.setText(""+ value11);
           //     btn2.setText("" + value22);
            }
        });

    }

}









