package com.example.sciemu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.WindowManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Emulator extends AppCompatActivity {
    FormulaBasic basicFormula = new FormulaBasic();

    String focus = "";
    String subCategory = "";
    String temopValue = "";
    String xString = "";
    String yString = "";
    String zString = "";
    int x = 0;
    int y = 0;
    int z = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emulator);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    public void num1(View v){ setValues(1); }
    public void num2(View v){ setValues(2); }
    public void num3(View v){ setValues(3); }
    public void num4(View v){ setValues(4); }
    public void num5(View v){ setValues(5); }
    public void num6(View v){ setValues(6); }
    public void num7(View v){ setValues(7); }
    public void num8(View v){ setValues(8); }
    public void num9(View v){ setValues(9); }
    public void num0(View v){ setValues(0); }

    public void displayBasic(View v){
        displaySubs(1);
    }
    public void displayAlgebra(View v){
        displaySubs(2);
    }

    public void additionText(View v){
        RelativeLayout main = findViewById(R.id.main);
        main.setVisibility(View.VISIBLE);
        x = 0;
        y = 0;
        z = 0;
        xString = "";
        yString = "";
        zString = "";
        subCategory = "addition";
        TextView textX = findViewById(R.id.Xvalue);
        TextView textS = findViewById(R.id.sign);
        TextView textY = findViewById(R.id.Yvalue);
        TextView textE = findViewById(R.id.equals);
        TextView textZ = findViewById(R.id.Zvalue);
        TextView textMessageAdd = findViewById(R.id.message);
        textMessageAdd.setText("addition selected");
        textX.setText("x");
        textS.setText("+");
        textY.setText("y");
        textE.setText("=");
        textZ.setText("z");
    }
    public void subtractionText(View v){
        RelativeLayout main = findViewById(R.id.main);
        main.setVisibility(View.VISIBLE);
        x = 0;
        y = 0;
        z = 0;
        xString = "";
        yString = "";
        zString = "";
        subCategory = "subtraction";
        TextView textX = findViewById(R.id.Xvalue);
        TextView textS = findViewById(R.id.sign);
        TextView textY = findViewById(R.id.Yvalue);
        TextView textE = findViewById(R.id.equals);
        TextView textZ = findViewById(R.id.Zvalue);
        TextView textMessageSub = findViewById(R.id.message);
        textMessageSub.setText("subtraction selected");
        textX.setText("x");
        textS.setText("-");
        textY.setText("y");
        textE.setText("=");
        textZ.setText("z");
    }
    public void divideText(View v){
        RelativeLayout main = findViewById(R.id.main);
        main.setVisibility(View.VISIBLE);
        x = 0;
        y = 0;
        z = 0;
        xString = "";
        yString = "";
        zString = "";
        subCategory = "division";
        TextView textX = findViewById(R.id.Xvalue);
        TextView textS = findViewById(R.id.sign);
        TextView textY = findViewById(R.id.Yvalue);
        TextView textE = findViewById(R.id.equals);
        TextView textZ = findViewById(R.id.Zvalue);
        TextView textMessageSub = findViewById(R.id.message);
        textMessageSub.setText("division selected");
        textX.setText("x");
        textS.setText("/");
        textY.setText("y");
        textE.setText("=");
        textZ.setText("z");
    }
    public void multiplyText(View v){
        RelativeLayout main = findViewById(R.id.main);
        main.setVisibility(View.VISIBLE);
        x = 0;
        y = 0;
        z = 0;
        xString = "";
        yString = "";
        zString = "";
        subCategory = "multiplication";
        TextView textX = findViewById(R.id.Xvalue);
        TextView textS = findViewById(R.id.sign);
        TextView textY = findViewById(R.id.Yvalue);
        TextView textE = findViewById(R.id.equals);
        TextView textZ = findViewById(R.id.Zvalue);
        TextView textMessageSub = findViewById(R.id.message);
        textMessageSub.setText("multiplcation selected");
        textX.setText("x");
        textS.setText("*");
        textY.setText("y");
        textE.setText("=");
        textZ.setText("z");
    }
    public void Area2D(View v){
        RelativeLayout main = findViewById(R.id.main);
        main.setVisibility(View.VISIBLE);
        x = 0;
        y = 0;
        z = 0;
        xString = "";
        yString = "";
        zString = "";
        subCategory = "Area2D";
        TextView textX = findViewById(R.id.Xvalue);
        TextView textS = findViewById(R.id.sign);
        TextView textY = findViewById(R.id.Yvalue);
        TextView textE = findViewById(R.id.equals);
        TextView textZ = findViewById(R.id.Zvalue);
        TextView textMessageSub = findViewById(R.id.message);
        textMessageSub.setText("2D Area selected");
        textX.setText("x");
        textS.setText("*");
        textY.setText("y");
        textE.setText("=");
        textZ.setText("z");
    }
    public void Area3D(View v){
        RelativeLayout main = findViewById(R.id.main);
        main.setVisibility(View.VISIBLE);
        x = 0;
        y = 0;
        z = 0;
        xString = "";
        yString = "";
        zString = "";
        subCategory = "Area2D";
        TextView textX = findViewById(R.id.Xvalue);
        TextView textS = findViewById(R.id.sign);
        TextView textY = findViewById(R.id.Yvalue);
        TextView textE = findViewById(R.id.equals);
        TextView textZ = findViewById(R.id.Zvalue);
        TextView textMessageSub = findViewById(R.id.message);
        textMessageSub.setText("2D Area selected");
        textX.setText("x");
        textS.setText("*");
        textY.setText("y");
        textE.setText("=");
        textZ.setText("z");
    }

    public void focusX(View v){
        focus = "X";
        TextView textMessageX = findViewById(R.id.message);
        textMessageX.setText("focus on x selected");
    }
    public void focusY(View v){
        focus = "Y";
        TextView textMessageY = findViewById(R.id.message);
        textMessageY.setText("Focus on y selected");
    }
    public void focusZ(View v){
        focus = "Z";
    }

    public void setValues(int val){
        if(focus.equals("X") && x != 0){
            TextView valueX = findViewById(R.id.Xvalue);
            xString  += val;
            x = Integer.parseInt(xString);
            valueX.setText(xString);
        }

        if(focus.equals("X") && x == 0){
            TextView valueX = findViewById(R.id.Xvalue);
            xString  = val+"";
            x = Integer.parseInt(xString);
            valueX.setText(xString);
        }

        if(focus.equals("Y") && y != 0){
            TextView valueY = findViewById(R.id.Yvalue);
            yString  += val;
            y = Integer.parseInt(yString);
            valueY.setText(yString);
        }

        if(focus.equals("Y") && y == 0 ){
            TextView valueY = findViewById(R.id.Yvalue);
            yString  = val+"";
            y = Integer.parseInt(yString);
            valueY.setText(yString);
        }

    }

    public void clickToSolve(View v){
        if(subCategory.equals("addition")){
            z=x+y;
            zString = z+"";
            TextView valueZ = findViewById(R.id.Zvalue);
            valueZ.setText(zString);
        }
        if(subCategory.equals("subtraction")){
            z=x-y;
            zString = z+"";
            TextView valueZ = findViewById(R.id.Zvalue);
            valueZ.setText(zString);
        }
        if(subCategory.equals("division")){
            z=x/y;
            zString = z+"";
            TextView valueZ = findViewById(R.id.Zvalue);
            valueZ.setText(zString);
        }
        if(subCategory.equals("multiplication")){
            z=x*y;
            zString = z+"";
            TextView valueZ = findViewById(R.id.Zvalue);
            valueZ.setText(zString);
        }
        if(subCategory.equals("Area2D")){
            z=x*y;
            zString = z+"";
            TextView valueZ = findViewById(R.id.Zvalue);
            valueZ.setText(zString);
        }
        TextView textMessageSolve = findViewById(R.id.message);
        textMessageSolve.setText("Solved");
        //This works for calling the formulas from the formula class/instance
        //z = basicFormula.addition(2,4);
        //textMessageSolve.setText(z+"");
        //Above will be used eventually to replace current  forumlas.
    }

    public void displaySubs(int num){
        LinearLayout layout1 = findViewById(R.id.basicSub);
        LinearLayout layout2 = findViewById(R.id.algebraSub);
        layout1.setVisibility(View.GONE);
        layout2.setVisibility(View.GONE);
        switch(num){
            case 1:
                layout1.setVisibility(View.VISIBLE);
                break;
            case 2:
                layout2.setVisibility(View.VISIBLE);
                break;
        };
    }
}/* 291 */