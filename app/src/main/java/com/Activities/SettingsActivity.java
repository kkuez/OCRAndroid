package com.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.Utils.IOUtil;
import com.example.doerpinghaus.ocr_android.R;

import java.io.IOException;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        TextView serverIPTextView = findViewById(R.id.serverIPTextView);
        final EditText ipEditText = findViewById(R.id.ipEditText);
        try {
            ipEditText.setText(IOUtil.getProperty("serverIp", this));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ipEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    try {
                        IOUtil.setProperty("serverIp", ipEditText.getText().toString(), ipEditText.getContext());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
    }
}
