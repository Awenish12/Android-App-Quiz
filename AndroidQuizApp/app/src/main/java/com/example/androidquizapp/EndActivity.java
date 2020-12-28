package com.example.androidquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.androidquizapp.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class EndActivity extends AppCompatActivity {

    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        PDFView pdfView = findViewById(R.id.pdfView2);
        pdfView.fromAsset("jpg2pdf2.pdf")
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAntialiasing(true)
                .pageFitPolicy(FitPolicy.BOTH)
                .load();
        PDFView pdfView1 = findViewById(R.id.pdfView3);
        pdfView1.fromAsset("jpg2pdf3.pdf")
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAntialiasing(true)
                .pageFitPolicy(FitPolicy.BOTH)
                .load();

        res = findViewById(R.id.result);

        int correct = getIntent().getIntExtra("correct", 0);
        int incorrect = getIntent().getIntExtra("incorrect", 0);

        res.setText("Correct: " + correct + "\nWrong: " + incorrect);
    }
}