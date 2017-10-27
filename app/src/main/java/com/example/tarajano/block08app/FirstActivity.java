package com.example.tarajano.block08app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void submit(View view) {
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        int rating = Math.round(ratingBar.getRating());
        Intent goToSecondActivity = new Intent();
        goToSecondActivity.setClass(this, SecondActivity.class);
        goToSecondActivity.putExtra("rating", rating);
        startActivity(goToSecondActivity);

        ratingBar.setRating(0); // Forget previous rating if returns from 2ndActivity
        //finish(); // Disable returning to 1stActivity (close app on BackButton)
    }
}
