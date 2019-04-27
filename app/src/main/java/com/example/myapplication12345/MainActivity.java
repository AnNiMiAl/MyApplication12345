package com.example.myapplication12345;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Button6;
    Button Button4;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);

        Button6=(Button) findViewById(R.id.button6);
        Button6.setOnClickListener(this);
        Button4=(Button) findViewById(R.id.button4);
        Button4.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button6:
                Intent intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
            break;
            default:
                break;

        }



        switch (v.getId()) {
            case R.id.button4:
                Intent intent = new Intent(this, Spisok.class);
                startActivity(intent);
                break;
            default:
                break;

        }



    }
}
