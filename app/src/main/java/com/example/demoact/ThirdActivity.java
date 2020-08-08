package com.example.demoact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
EditText msg_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_main);

        msg_second=(EditText)findViewById(R.id.msg_second);

        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            String str= extras.getString("message1");
            String first= extras.getString("message");
            msg_second.setText(str);


        }
    }
}