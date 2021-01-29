package com.example.sciemu;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class PracticeSection extends AppCompatActivity {

    String equation = "None";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_section);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    public void startTest(View v){
        TextView question = findViewById(R.id.question);
        buildEquation();
        question.setText(equation);
    }

    public static void buildEquation(){
        int x = 0;
        int y = 0;
        String  [] equationBasic = {"+","-","*","/"};
    }

    public void checkAnswer(View v){}
}//34