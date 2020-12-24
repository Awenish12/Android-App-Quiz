package com.example.androidquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.androidquizapp.R;

public class EndActivity extends AppCompatActivity {

    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        res = findViewById(R.id.result);

        int correct = getIntent().getIntExtra("correct", 0);
        int incorrect = getIntent().getIntExtra("incorrect", 0);

        res.setText("Correct: " + correct + "\nWrong: " + incorrect);
    }
}