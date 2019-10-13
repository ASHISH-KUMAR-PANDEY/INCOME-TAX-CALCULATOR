package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent i = getIntent();
        final String p = i.getStringExtra("totaltax");
        TextView textView = (TextView)findViewById(R.id.tax);
        textView.setText(p);

        final String r = i.getStringExtra("taxable");
        TextView textView2 = (TextView)findViewById(R.id.taxinc);
        textView2.setText(r);

    }
}

