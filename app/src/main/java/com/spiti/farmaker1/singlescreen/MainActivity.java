package com.spiti.farmaker1.singlescreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView perigrafi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting a text to TextView programmatically
        perigrafi = (TextView) findViewById(R.id.perigrafi);
        perigrafi.setText(getResources().getString(R.string.permag));

    }
}
