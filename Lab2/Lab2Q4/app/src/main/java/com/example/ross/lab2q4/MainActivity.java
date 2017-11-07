package com.example.ross.lab2q4;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.database.sqlite.*;
import android.database.sqlite.SQLiteDatabase;
import android.database.DatabaseUtils;
import android.widget.Scroller;


public class MainActivity  extends AppCompatActivity
{
    Button dbClear, dbInsert, dbRetrieve, dbCreate, dbAll, dbEdit;
    EditText listId,listName,listItems, listDisplay;
    Cursor c;
    SQLiteDatabase db;
    String clearDisplay = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbClear = (Button) findViewById(R.id.clearBtn);
        dbInsert = (Button) findViewById(R.id.insertBtn);
        dbRetrieve = (Button) findViewById(R.id.retrieveBtn);
        dbCreate = (Button) findViewById(R.id.createBtn);
        dbAll = (Button) findViewById(R.id.allBtn);
        dbEdit = (Button) findViewById(R.id.editBtn);

        listId = (EditText) findViewById(R.id.listIdInput);
        listName = (EditText) findViewById(R.id.listNameInput);
        listItems = (EditText) findViewById(R.id.listItemsInput);
        listDisplay = (EditText) findViewById(R.id.dbDisplayListItem);

        db = openOrCreateDatabase("list", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS list(id VARCHAR, name VARCHAR, list VARCHAR);");


        //Create------------------------------------------------
        dbCreate.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view) {
              listDisplay.setText(clearDisplay);
            }
        });

        //Save---------------------------------------------------
        dbInsert.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                db.execSQL("INSERT INTO list VALUES('"+listId.getText()+"','"+listName.getText()+"','"+listItems.getText()+"');");
            }
        });

        //Retrieve------------------------------------------------
        dbRetrieve.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer buffer = new StringBuffer();
                c = db.rawQuery("SELECT * FROM list WHERE name='" + listName.getText() + "'", null);

                if (c.moveToFirst()) {
                    buffer.append("ID: "+c.getString(0)+ "\n");
                    buffer.append("List: " +c.getString(1)+ "\n");
                    buffer.append("Items: " +c.getString(2)+ "\n");
                }

                    listDisplay.setText( buffer.toString());
                  //  listDisplay.setText(c.getString(2));
                  //  listDisplay.setText(c.getString(3));
                }

        });

        //Clear---------------------------------------------------
        dbClear.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                db.execSQL("DELETE FROM list WHERE name='"+listName.getText()+"'");
            }
        });

        dbAll.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                c= db.rawQuery("SELECT * FROM list" , null);
                if(c.getCount()==0)
                {
                    listDisplay.setText("Error , No records found");
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                    while(c.moveToNext())
                    {
                      buffer.append("ID: "+ c.getString(0) + "\n");
                      buffer.append("List: " + c.getString(1)+"\n");
                      buffer.append("Items: " + c.getString(2)+ "\n");
                    }
                listDisplay.setText( buffer.toString());
            }
        });

        dbEdit.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                db.execSQL("UPDATE list SET name='"+listName.getText()+"',list='"+listItems.getText()+"'WHERE id='"+listId.getText()+"'");
            }
        });
    }
}



