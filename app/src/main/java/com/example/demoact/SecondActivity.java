package com.example.demoact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
 EditText first_msg;
 EditText to_third;
 Button btn_thrd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);
          first_msg=(EditText)findViewById(R.id.first_msg);
          to_third=(EditText)findViewById(R.id.to_third);
          btn_thrd=(Button)findViewById(R.id.btn_thrd);

        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            String str= getIntent().getStringExtra("message");
            first_msg.setText(str);
        }

        btn_thrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = getIntent().getStringExtra("message");
                String stc = str+" "+to_third.getText().toString();
                Intent intent2 = new Intent(getApplicationContext(),ThirdActivity.class);
                intent2.putExtra("message1",stc);
                startActivity(intent2);
            }
        });
    }
}