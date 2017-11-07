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

public class MainActivity extends AppCompatActivity {

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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeWidgets();
    }

    private void initializeWidgets(){
        editName = (EditText) findViewById(R.id.name);
        editPassword = (EditText) findViewById(R.id.password);
        editEmail = (EditText) findViewById(R.id.email);
        editPhone = (EditText) findViewById(R.id.phone);

        nameError = (TextView) findViewById(R.id.nameError);
        passError = (TextView) findViewById(R.id.passError);
        emailError = (TextView) findViewById(R.id.emailError);
        phoneError = (TextView) findViewById(R.id.phoneError);
    }


    public void submit() {

        String nameStr = editName.getText().toString();
        String passStr = editPassword.getText().toString();
        emailStr = editEmail.getText().toString();
        String phoneStr = editPhone.getText().toString();

        if (nameStr.matches(".*\\d.*")) {
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

        if (phoneStr.length() > 10) {
            phoneError.setText("Max 10 numbers");
            isValid = false;
        }
    }



    public void onClickSubmit(View view) {
       // submit();

        String nameStr = editName.getText().toString();
        String passStr = editPassword.getText().toString();
        emailStr = editEmail.getText().toString();
        String phoneStr = editPhone.getText().toString();

        String value = "Thank you " + nameStr + "your request is being processed" ;
        Intent sendIntent = new Intent(view.getContext(), Main2Activity.class);
        sendIntent.putExtra("userName", value);
        if (sendIntent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(sendIntent);
        }

//
//        if(isValid) {
//            Context context = getApplicationContext();
//            CharSequence text = "Thank you,your request is being processed";
//            int duration = Toast.LENGTH_SHORT;
//            Toast toast = Toast.makeText(context, text, duration);
//            toast.show();
//        }
    }
}
