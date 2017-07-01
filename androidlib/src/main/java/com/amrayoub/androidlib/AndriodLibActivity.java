package com.amrayoub.androidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndriodLibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s= getIntent().getStringExtra("joke");
        TextView textView = (TextView) findViewById(R.id.joke);
        textView.setText(s);
    }
}
