package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class SecondActivity2 extends AppCompatActivity {
    public MaterialButton btnExport;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        btnExport = findViewById(R.id.btn_export);
        textView = findViewById(R.id.tv_corretn);
    }

    @Override
    protected void onStart() {
        super.onStart();
        btnExport.setOnClickListener(v ->{
            finishAffinity();
        });

        textView.setText(getIntent().getStringExtra("resault"));

    }

}