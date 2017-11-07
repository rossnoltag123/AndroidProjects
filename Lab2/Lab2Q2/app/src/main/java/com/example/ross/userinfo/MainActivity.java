package com.example.ross.userinfo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    Button submit;
    EditText editName;
    EditText editPassword;
    EditText editEmail;
    EditText editPhone;
    TextView nameError;
    TextView passError;
    TextView emailError;
    TextView phoneError;
    boolean isValid = true;
    String emailStr;
    String msg;
    String nameStr;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeWidgets();
    }

    private void initializeWidgets()
    {
        editName = (EditText) findViewById(R.id.name);
        editPassword = (EditText) findViewById(R.id.password);
        editEmail = (EditText) findViewById(R.id.email);
        editPhone = (EditText) findViewById(R.id.phone);

        nameError = (TextView) findViewById(R.id.nameError);
        passError = (TextView) findViewById(R.id.passError);
        emailError = (TextView) findViewById(R.id.emailError);
        phoneError = (TextView) findViewById(R.id.phoneError);
    }


    public void submit()
    {
        String nameStr = editName.getText().toString();
        String passStr = editPassword.getText().toString();
        emailStr = editEmail.getText().toString();
        String phoneStr = editPhone.getText().toString();

        if (nameStr.matches(".*\\d.*"))
        {
            nameError.setText("No numbers");
            isValid = false;
        }

        if (passStr.length() < 4)
        {
            passError.setText("Minimum 4 numbers");
            isValid = false;
        }

        if (emailStr.equals(""))
        {
            emailError.setText("Email needed");
            isValid = false;
        }

        if (phoneStr.length() > 10)
        {
            phoneError.setText("Max 10 numbers");
            isValid = false;
        }
    }

    public void onClickSubmit(View view) {

        nameStr = editName.getText().toString();
        String passStr = editPassword.getText().toString();
        emailStr = editEmail.getText().toString();
        String phoneStr = editPhone.getText().toString();

        msg = "Thank you " + nameStr + "your request is being processed";

        sendEmail(msg);

    }

    protected void sendEmail(String msg){
        String [] to = new String[]{"rossnoltag@gmail.com"};
        String subject=("A meesage from your app!");
        Intent sendEmailIntent = new Intent(Intent.ACTION_SEND);
        sendEmailIntent.putExtra(Intent.EXTRA_EMAIL, to);
        sendEmailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        sendEmailIntent.putExtra(Intent.EXTRA_TEXT, msg);
        sendEmailIntent.setType("message/rfc822");
        startActivity(Intent.createChooser(sendEmailIntent, "Email"));

    }


}
