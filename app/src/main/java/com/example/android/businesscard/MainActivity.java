package com.example.android.businesscard;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.textview);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Graceland-Personal-Use.ttf");
        t.setTypeface(typeface);

    }


}
