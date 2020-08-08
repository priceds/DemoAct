package com.example.demoact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText first_inp;
    Button btn_second;
    TextView lbl_first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_inp= (EditText)findViewById(R.id.first_inp);
        btn_second =(Button)findViewById(R.id.btn_second);
        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String stc = first_inp.getText().toString();
             Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("message", stc);
                startActivity(intent);

            }
        });
    }
}