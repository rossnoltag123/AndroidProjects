//package com.example.ross.lab2q3;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.net.URL;
import java.io.InputStream;
import android.graphics.drawable.Drawable;

public class MainActivity extends AppCompatActivity
{

    // URL fileUrl= http://i.pinimg.com/564x/f5/0e/63/f50e63bfa51220b8dd65fc9e7f1c04a6.jpg;

  //  EditText urlText;
  //  TextView errorText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  initializeWidgets();
    }

  //  public void initializeWidgets(){
     //   urlText = (EditText) findViewById(R.id.url);
      //  errorText = (TextView) findViewById(R.id.errorText);
  //  }



  //  public void onClickPic(View view) {

      //  String stringUrl = urlText.getText().toString();
     //   ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
     //   NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
     //   if(networkInfo != null && networkInfo.isConnected()){
     //       new DownloadWebpageTask().execute(stringUrl);
     //   }
     //   else{
       //    errorText.setText("No Network connection available");
      //  }




    //////////////////////////// DownloadImage
    // Intent downloadIntent = new Intent(this, DownloadService.class );
    //  downloadIntent.setData(Uri.parse("https://i.pinimg.com/564x/f5/0e/63/f50e63bfa51220b8dd65fc9e7f1c04a6.jpg"));
    //startService(downloadIntent);
    ///////////////////////////////



}



