package com.example.intentcalleranggika;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentCaller2Phone extends Activity implements View.OnClickListener {

        public Button button1;
        public EditText editA;

        public String ACTION_CHECK="com.example.intentcalleranggika.ACTION_CHECK";

        public void onCreate(Bundle saveInstanceState) {
            super.onCreate(saveInstanceState);
            setContentView(R.layout.activity_intent);
            button1=(Button)findViewById(R.id.button2);
            editA=(EditText)findViewById(R.id.editText1);
            button1.setOnClickListener(this);
        }
        @Override
        public void onClick(View arg0) {
            int startSelection, andSelection;
            if (arg0==button1) {
                startSelection=editA.getSelectionStart();
                andSelection=editA.getSelectionEnd();
                String url = "https://mail.google.com/mail/";
                Intent email = new Intent(Intent.ACTION_VIEW);
                email.setData(Uri.parse(url));
                startActivity(email);
            }
        }


}

