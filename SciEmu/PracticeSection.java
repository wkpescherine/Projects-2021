package com.example.sciemu;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.Random;

public class PracticeSection extends AppCompatActivity {
    int level = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_section);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        buildEquation();
    }

    public void startTest(View v){
        buildEquation();
    }

    public void buildEquation(String q){
        int x = 0;
        int y = 0;
        int upperBound = 10;
        String operation = "";
        Random rand = new Random();
        String  [] equationBasic = {"+","-","*","/"};
        x = rand.nextInt(upperBound)+1;
        y = rand.nextInt(upperBound)+1;
        operation = equationBasic[rand.nextInt(4)];
        TextView questionText = findViewById(R.id.question);
        questionText.setText(x + operation +y);
    }

    public void checkAnswer(View v){}
}//34