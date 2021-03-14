package com.example.sciemu_x2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
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
    }

    public void checkAnswer(View v){
        TextView question2solve = findViewById(R.id.question);
        String qString = question2solve.getText().toString();
        String [] splitQ = qString.split(" ");
        int xSub = Integer.parseInt(splitQ[0]);
        int ySub = Integer.parseInt(splitQ[2]);
        int totalSub = 0;
        if(splitQ[1].equals("+")){totalSub = xSub+ySub;};
        if(splitQ[1].equals("-")){totalSub = xSub-ySub;};
        if(splitQ[1].equals("*")){totalSub = xSub*ySub;};
        if(splitQ[1].equals("/")){totalSub = xSub/ySub;};
    }
}//57