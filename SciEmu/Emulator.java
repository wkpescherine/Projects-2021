package com.example.sciemu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.View;
import android.widget.TextView;


public class Emulator extends AppCompatActivity {
    FormulaBasic basicFormula = new FormulaBasic();

    String focus = "";
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

    public void additionText(View v){
        x = 0;
        y = 0;
        z = 0;
        xString = "";
        yString = "";
        zString = "";
        TextView textX = findViewById(R.id.Xvalue);
        TextView textS = findViewById(R.id.sign);
        TextView textY = findViewById(R.id.Yvalue);
        TextView textE = findViewById(R.id.equals);
        TextView textZ = findViewById(R.id.Zvalue);
        textX.setText("x");
        textS.setText("+");
        textY.setText("y");
        textE.setText("=");
        textZ.setText("z");
    }

    public void subtractionText(View v){
        x = 0;
        y = 0;
        z = 0;
        xString = "";
        yString = "";
        zString = "";
        TextView textX = findViewById(R.id.Xvalue);
        TextView textS = findViewById(R.id.sign);
        TextView textY = findViewById(R.id.Yvalue);
        TextView textE = findViewById(R.id.equals);
        TextView textZ = findViewById(R.id.Zvalue);
        textX.setText("x");
        textS.setText("-");
        textY.setText("y");
        textE.setText("=");
        textZ.setText("z");
    }

    public void focusX(View v){focus = "X";}
    public void focusY(View v){focus = "Y";}
    public void focusZ(View v){focus = "Z";}

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
    }
}/* 118 */