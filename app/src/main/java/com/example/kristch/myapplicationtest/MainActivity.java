package com.example.kristch.myapplicationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hello Git", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello Git", Toast.LENGTH_SHORT).show();
    }
}
