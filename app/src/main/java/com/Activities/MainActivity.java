package com.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.Backend.ObjectHub;
import com.example.doerpinghaus.ocr_android.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ObjectHub.getInstance();

        setContentView(R.layout.activity_main);

        TextView helloTextView = findViewById(R.id.helloTextView);
        setContentView(R.layout.activity_menu);
    }
}
