package com.example.ross.lab2q4;

import android.content.Context;
import android.database.sqlite.*;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;
import android.widget.Button;
import android.database.sqlite.SQLiteDatabase;
import android.database.DatabaseUtils;
/**
 * Created by Ross on 13/10/2017.
 */

public class databaseHandler {


    //SQLiteDatabase db;

    //db = openOrCreateDatabase("list1", Context.MODE_PRIVATE, null);



//    db = openOrCreateDatabase("listDB",Context.MODE_PRIVATE, null);
//        db.execSQL("CREATE TABLE IF NOT EXISTS list(ID INT, name VARCHAR, List VARCHAR);");
//
//
//
//
//    //Create------------------------------------------------
//        dbCreate.setOnClickListener(new Button.OnClickListener()
//    {
//        @Override
//        public void onClick(View view)
//        {
//            db.execSQL("CREATE TABLE IF NOT EXISTS list(ID INT, name VARCHAR, List VARCHAR;");
//        }
//    });
//
//    //Save---------------------------------------------------
//        dbInsert.setOnClickListener(new Button.OnClickListener()
//    {
//        @Override
//        public void onClick(View view)
//        {
//            db.execSQL("INSERT INTO list VALUES('"+listId.getText()+"','"+listName.getText()+"''"+listItems.getText()+"');");
//        }
//    });
//
//    //Retrieve------------------------------------------------
//        dbRetrive.setOnClickListener(new Button.OnClickListener()
//    {
//        @Override
//        public void onClick(View view)
//        {
//            c = db.rawQuery("SELECT * FROM student WHERE rollno='"+listId.getText()+"'",null);
//            if(c.moveToFirst())
//            {
//                listDisplay.setText(c.getString(1)+c.getString(2)+c.getString(3));
//            }
//        }
//    });
//
//    //Clear---------------------------------------------------
//        dbClear.setOnClickListener(new Button.OnClickListener()
//    {
//        @Override
//        public void onClick(View view)
//        {
//            db.execSQL("DELETE FROM list WHERE ID='"+listId.getText()+"'");
//        }
//    });
}
