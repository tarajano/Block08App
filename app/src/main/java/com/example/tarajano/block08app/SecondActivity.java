package com.example.tarajano.block08app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent callerActivity = getIntent();
        int rating = callerActivity.getIntExtra("rating", 0);

        TextView secActView = findViewById(R.id.textViewSecActivity);
        secActView.setText("You gave " + rating + " stars");
    }
}
