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
    String aString = "";
    String bString = "";
    String cString = "";
    String totalString = "";
    int x = 0;
    int y = 0;
    int z = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    int total = 0;

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
        RelativeLayout unique = findViewById(R.id.unique);
        unique.setVisibility(View.GONE);
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
        RelativeLayout unique = findViewById(R.id.unique);
        unique.setVisibility(View.GONE);
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
        RelativeLayout unique = findViewById(R.id.unique);
        unique.setVisibility(View.GONE);
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
        RelativeLayout unique = findViewById(R.id.unique);
        unique.setVisibility(View.GONE);
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
        textX.setText("h");
        textS.setText("*");
        textY.setText("w");
        textE.setText("=");
        textZ.setText("area");
    }
    public void Area3D(View v){
        RelativeLayout main = findViewById(R.id.main);
        main.setVisibility(View.GONE);
        RelativeLayout unique = findViewById(R.id.unique);
        unique.setVisibility(View.VISIBLE);
        a = 0;
        b = 0;
        c = 0;
        total = 0;
        aString = "";
        bString = "";
        cString = "";
        totalString = "";
        subCategory = "Area3D";
        TextView textA = findViewById(R.id.Avalue);
        TextView textS1 = findViewById(R.id.sign1);
        TextView textB = findViewById(R.id.Bvalue);
        TextView textS2 = findViewById(R.id.sign2);
        TextView textC = findViewById(R.id.sign2);
        TextView textE1 = findViewById(R.id.equals1);
        TextView texttot = findViewById(R.id.total);
        TextView textMessageSub = findViewById(R.id.message);
        textMessageSub.setText("3D Area selected");
        textA.setText("h");
        textS1.setText("*");
        textB.setText("w");
        textS2.setText("*");
        textC.setText("d");
        textE1.setText("=");
        texttot.setText("total");
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
    public void focusA(View v){
        focus = "A";
        TextView textMessageA = findViewById(R.id.Avalue);
        textMessageA.setText("focus on a selected");
    }
    public void focusB(View v){
        focus = "B";
        TextView textMessageA = findViewById(R.id.Bvalue);
        textMessageA.setText("focus on b selected");
    }
    public void focusC(View v){
        focus = "C";
        TextView textMessageA = findViewById(R.id.Cvalue);
        textMessageA.setText("focus on c selected");
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

        if(focus.equals("A") && a != 0){
            TextView valueA = findViewById(R.id.Avalue);
            aString  += val;
            a = Integer.parseInt(aString);
            valueA.setText(aString);
        }

        if(focus.equals("A") && a == 0 ){
            TextView valueA = findViewById(R.id.Avalue);
            aString  = val+"";
            a = Integer.parseInt(aString);
            valueA.setText(aString);
        }

        if(focus.equals("B") && b != 0){
            TextView valueB = findViewById(R.id.Bvalue);
            bString  += val;
            b = Integer.parseInt(bString);
            valueB.setText(bString);
        }

        if(focus.equals("B") && b == 0 ){
            TextView valueB = findViewById(R.id.Bvalue);
            bString  = val+"";
            b = Integer.parseInt(bString);
            valueB.setText(bString);
        }

        if(focus.equals("C") && c != 0){
            TextView valueC = findViewById(R.id.Cvalue);
            cString  += val;
            c = Integer.parseInt(cString);
            valueC.setText(cString);
        }

        if(focus.equals("C") && c == 0 ){
            TextView valueC = findViewById(R.id.Cvalue);
            cString  = val+"";
            c = Integer.parseInt(cString);
            valueC.setText(cString);
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
        if(subCategory.equals("Area2D")){
            total=a*b*c;
            totalString = total+"";
            TextView valueTotal = findViewById(R.id.total);
            valueTotal.setText(totalString);
        }
        TextView textMessageSolve = findViewById(R.id.message);
        textMessageSolve.setText("Solved");
        //This works for calling the formulas from the formula class/instance
        //z = basicFormula.addition(2,4);
        //Above will be used eventually to replace current  forumlas.
        textMessageSolve.setText(z+"");
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