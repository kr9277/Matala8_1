package com.example.matala8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Switch sw;
    ToggleButton tb;
    ImageView iv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        sw = findViewById(R.id.sw);
        tb = findViewById(R.id.tb);
        iv = findViewById(R.id.iv);
    }

    public void Click(View view) {
        if (sw.isChecked() && tb.isChecked()){
            iv.setBackgroundResource(R.drawable.green);
        }
        if (!sw.isChecked() && !tb.isChecked()){
            iv.setBackgroundResource(R.drawable.pink);
        }
        if (sw.isChecked() && !tb.isChecked()) {
            iv.setBackgroundResource(R.drawable.yellow);
        }
        if (!sw.isChecked() && tb.isChecked()) {
            iv.setBackgroundResource(R.drawable.perple);
        }
    }
}