package com.example.ross.userinfo;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

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
    public String nameStrSafe;
    String name;
    String nameStr;
    String emailStr;
    String emailSubject;
    String[] emails;
    Intent sendEmail;
    Intent sendEmailIntent;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = (EditText) findViewById(R.id.name);
        editPassword = (EditText) findViewById(R.id.password);
        editEmail = (EditText) findViewById(R.id.email);
        editPhone = (EditText) findViewById(R.id.phone);

        nameError = (TextView) findViewById(R.id.nameError);
        passError = (TextView) findViewById(R.id.passError);
        emailError = (TextView) findViewById(R.id.emailError);
        phoneError = (TextView) findViewById(R.id.phoneError);

        nameStr = editName.getText().toString();
        emailStr = editEmail.getText().toString();

        emails[0] = emailStr;

        emailSubject = "Hello";
        submit = (Button) findViewById(R.id.subBtn);
    //    submit.setOnClickListener(new View.OnClickListener() {
    //        public void onClick(View view) {
     //           emailStr = editEmail.getText().toString();

                //emailStr = editEmail.getText().toString();
                //     composeEmail(emailSubject);

                // Intent sendIntent = new Intent(view.getContext(), Main2Activity.class);
                //  sendIntent.putExtra("userName", value);
                //   if (sendIntent.resolveActivity(getPackageManager()) != null)
                //    {
                //      startActivity(sendIntent);
                //    }
     //       }


            //     composeEmail(emailSubject);

            // Intent sendIntent = new Intent(view.getContext(), Main2Activity.class);
            //  sendIntent.putExtra("userName", value);
            //   if (sendIntent.resolveActivity(getPackageManager()) != null)
            //    {
            //      startActivity(sendIntent);
            //    }

      //  });
    }
}



   //     public void onClickSubmit(View view) {
    //    emailStr = editEmail.getText().toString();
        //     composeEmail(emailSubject);

        // Intent sendIntent = new Intent(view.getContext(), Main2Activity.class);
        //  sendIntent.putExtra("userName", value);
        //   if (sendIntent.resolveActivity(getPackageManager()) != null)
        //    {
        //      startActivity(sendIntent);
        //    }
   //     }
   // }




//    public void onClickSubmit(View view) {
//        emailStr = editEmail.getText().toString();
//        //     composeEmail(emailSubject);
//
//        // Intent sendIntent = new Intent(view.getContext(), Main2Activity.class);
//        //  sendIntent.putExtra("userName", value);
//        //   if (sendIntent.resolveActivity(getPackageManager()) != null)
//        //    {
//        //      startActivity(sendIntent);
//        //    }
//    }
//}
        //Uri attachment- SendMAilTO for no attachments
//        public void composeEmail(String message){
//
//            String[] to = new String[]{"rossnoltag@gmail.com"};
//            String subject=("A message from your app!");
//
//            Intent sendEmailIntent = new Intent(Intent.ACTION_SENDTO);
//
//           // sendEmailIntent.setData(Uri.parse("mailto:"));
//
//            sendEmailIntent.putExtra(Intent.EXTRA_EMAIL, to);
//            sendEmailIntent.putExtra(Intent.EXTRA_SUBJECT, subject );
//            sendEmailIntent.putExtra(Intent.EXTRA_TEXT,  emailSubject );
//
//            sendEmailIntent.setType("message/rfc822");
//            startActivity(Intent.createChooser(sendEmailIntent, "Send Email"));
//
//                //Intent.createChooser(sendEmailIntent, "Send Email");
//                //if(sendEmailIntent.resolveActivity(getPackageManager())!=null){
//            //}
//        }

            //  if(isValid) {
            //      Context context = getApplicationContext();
         //      CharSequence text = "Thank you  your request is being processed";
            //     int duration = Toast.LENGTH_SHORT;
            //     Toast toast = Toast.makeText(context, text, duration);
            ///   toast.show();
            /// }




        //    private void initializeWidgets(){
        //        editName = (EditText) findViewById(R.id.name);
        //        editPassword = (EditText) findViewById(R.id.password);
        //        editEmail = (EditText) findViewById(R.id.email);
        //        editPhone = (EditText) findViewById(R.id.phone);
        //
        //        nameError = (TextView) findViewById(R.id.nameError);
        //        passError = (TextView) findViewById(R.id.passError);
        //        emailError = (TextView) findViewById(R.id.emailError);
        //        phoneError = (TextView) findViewById(R.id.phoneError);
        //    }


//    public void submit() {
//
//        //nameStr = editName.getText().toString();
//        String passStr = editPassword.getText().toString();
//        //String emailStr = editEmail.getText().toString();
//        String phoneStr = editPhone.getText().toString();
//
//
//        if (nameStr.matches(".*\\d.*")) {
//            nameError.setText("No numbers");
//            isValid = false;
//
//        }
//        if (nameStr.matches(".*\\d.*")!= false){
//            nameStrSafe = nameStr;
//        }
//
//        if (passStr.length() < 4) {
//            passError.setText("Minimum 4 numbers");
//            isValid = false;
//        }
//
//        if (emailStr.isEmpty()) {
//            emailError.setText("Email needed");
//            isValid = false;
//        }
//
//        if (phoneStr.length() > 10) {
//            phoneError.setText("Max 10 numbers");
//            isValid = false;
//        }
//    }



         //    public void onClickSubmit(View view)
        //    {
        //            String value = "Thank you " + nameStr + "your request is being processed" ;
        //            Intent sendIntent = new Intent(view.getContext(), Main2Activity.class);
        //            sendIntent.putExtra("userName", value);
        //
        //
        //            if (sendIntent.resolveActivity(getPackageManager()) != null)
        //            {
        //                startActivity(sendIntent);
        //            }
        //        }


        //  if(isValid) {
        //      Context context = getApplicationContext();
        //      CharSequence text = "Thank you  your request is being processed";
         //     int duration = Toast.LENGTH_SHORT;
         //     Toast toast = Toast.makeText(context, text, duration);
         ///   toast.show();
       /// }



