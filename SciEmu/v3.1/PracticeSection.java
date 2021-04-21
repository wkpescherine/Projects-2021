package com.example.sciemu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class PracticeSection extends AppCompatActivity {
    SolvePractice solution = new SolvePractice();

    int score = 0;
    int level = 0;
    String answer = "";
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_section);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    public void num1(View v) { setAnswer("1"); }
    public void num2(View v) { setAnswer("2"); }
    public void num3(View v) { setAnswer("3"); }
    public void num4(View v) { setAnswer("4"); }
    public void num5(View v) { setAnswer("5"); }
    public void num6(View v) { setAnswer("6"); }
    public void num7(View v) { setAnswer("7"); }
    public void num8(View v) { setAnswer("8"); }
    public void num9(View v) { setAnswer("9"); }
    public void num0(View v) { setAnswer("0"); }
    public void decimal(View v) { setAnswer("."); }

    public void setAnswer(String value){
        TextView answerText = findViewById(R.id.answer);
        answer += value;
        answerText.setText(answer);
    }

    public void startTest(View v){
        buildEquation();
        Button startButt = findViewById(R.id.startButton);
        startButt.setVisibility(View.GONE);
    }

    public void buildEquation(){
        int x = 0;
        int y = 0;
        int upperBound = 10;
        String operation = "";
        Random rand = new Random();
        String  [] equationBasic = {"+","-","*","/"};
        x = rand.nextInt(upperBound)+1;
        y = rand.nextInt(upperBound)+1;
        operation = equationBasic[rand.nextInt(3)];
        TextView questionText = findViewById(R.id.question);
        questionText.setText(x +" " + operation+" " +y);
        total = solution.Solution(x,y,operation);
    }

    public void checkAnswer(View v){
        TextView scoreText = findViewById(R.id.score);
        TextView answerText = findViewById(R.id.answer);
        if(total == Integer.parseInt(answer)){
            score +=1 ;
            scoreText.setText(score+"");
            answerText.setText("Answer");
            answer = "";
            buildEquation();
        }else {
            score -= 1 ;
            scoreText.setText(score+"");
            answerText.setText("Answer");
            answer = "";
            buildEquation();
        }
    }

    public void backToEmulator(View v){
        Intent intent = new Intent(this, Emulator.class);
        startActivity(intent);
    }
}//86