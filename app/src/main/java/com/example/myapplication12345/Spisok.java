package com.example.myapplication12345;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Spisok extends AppCompatActivity implements View.OnClickListener {

    Button Button1234;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spisok);

        Button1234 = (Button) findViewById(R.id.Button1234);
        Button1234.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Button1234:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }

    }
}