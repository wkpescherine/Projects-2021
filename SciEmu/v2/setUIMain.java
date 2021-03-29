package com.example.sciemu_x2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

//import androidx.appcompat.app.AppCompatActivity;

public class setUIMain extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emulator);
    }

    public void Something(){
        TextView newMain = findViewById(R.id.Totvalue);
        newMain.setText("Something");
    }
}
