package com.example.ross.lab2q3b;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView imgView5;
    TextView textView5;
    EditText urlTxt;
    String strUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyMT6faUNOJnsUkUudtjdTdGqW_26lZqgAOxcG_3XV3NqPGX5GbQ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView5 =(ImageView) findViewById(R.id.imageView);
        urlTxt= (EditText) findViewById(R.id.urlText);
        textView5 = (TextView) findViewById(R.id.textView5);
        btn= (Button) findViewById(R.id.btn1);


        btn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                new DownloadImage().execute(strUrl);//textView5
                System.out.println("------------------------------------------------------------------------");
                // imgView.setImageDrawable(loadImageFromNetwork(strUrl));
            }
        });
    }

  //  public void onClickBtn1(){

  //      new DownloadImage().execute(strUrl);
  //      System.out.println("------------------------------------------------------------------------");
     // imgView.setImageDrawable(loadImageFromNetwork(strUrl));

  //  }

    Drawable loadImageFromNetwork(String url)
    {
        try
        {
            InputStream is = (InputStream) new URL(url).getContent();
            Drawable d = Drawable.createFromStream(is, "src name");
            return d;
        } catch (Exception e)
        {
            System.out.println("Exc=" + e);
            return null;
        }

    }


    public class DownloadImage extends AsyncTask<String, Void, Drawable>
    {
        @Override
        protected Drawable doInBackground(String... params)
        {
                String urls = params[0];
                Drawable d = loadImageFromNetwork(urls);
                return d;
          //  catch (Exception e)
          //  {
         //       System.out.println("Exc" + e);
         //       return null;
            }

        @Override
        protected void onPostExecute(Drawable drawable) {
            imgView5.setImageDrawable(drawable);
        }
    }
 // imgView5.setImageDrawable(d);

}
