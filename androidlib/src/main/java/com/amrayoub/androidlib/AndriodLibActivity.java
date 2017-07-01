package com.amrayoub.androidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class AndriodLibActivity extends AppCompatActivity {
    public final static String INTENT_JOKE = "INTENT_JOKE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);
        String s= getIntent().getStringExtra(INTENT_JOKE);
        TextView textView = (TextView) findViewById(R.id.joke);
        textView.setText(s);
    }
}
