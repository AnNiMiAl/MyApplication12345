package com.example.myapplication12345;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button Button23;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button23 = (Button) findViewById(R.id.button23);
        Button23.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button23:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }

    }
}