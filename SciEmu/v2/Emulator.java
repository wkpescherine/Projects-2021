package com.example.sciemu_x2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Emulator extends AppCompatActivity {
    int x = 0;
    int y = 0;
    int z = 0;
    // Location   is =  x,y,z,a,b,c
    int [] isDecimal = {0,0,0,0,0,0};
    String xString = "";
    String yString = "";
    String zString = "";
    String focus = "";
    String subCategory = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emulator);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    public void num1(View v){ setValues("1"); }
    public void num2(View v){ setValues("2"); }
    public void num3(View v){ setValues("3"); }
    public void num4(View v){ setValues("4"); }
    public void num5(View v){ setValues("5"); }
    public void num6(View v){ setValues("6"); }
    public void num7(View v){ setValues("7"); }
    public void num8(View v){ setValues("8"); }
    public void num9(View v){ setValues("9"); }
    public void num0(View v){ setValues("0"); }
    public void del(View v){specialFunc("del");}
    public void decimal(View v){
        if(focus.equals("X")){
            setValues(".");
            isDecimal[0] = 1;
        }
        if(focus.equals("Y")){
            setValues(".");
            isDecimal[1] = 1;
        }
        if(focus.equals("Z")){
            setValues(".");
            isDecimal[2] = 1;
        }
        if(focus.equals("A")){
            setValues(".");
            isDecimal[3] = 1;
        }
        if(focus.equals("B")){
            setValues(".");
            isDecimal[4] = 1;
        }
        if(focus.equals("C")){
            setValues(".");
            isDecimal[5] = 1;
        }
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
        TextView textMessageZ = findViewById(R.id.message);
        textMessageZ.setText("docus on z selected");
    }

    public void setValues(String val){
        if(focus.equals("X") && xString.length() != 0){
            TextView valueX = findViewById(R.id.Xvalue);
            xString  += val+"";
            valueX.setText(xString);
        }

        if(focus.equals("X") && xString.length() == 0){
            TextView valueX = findViewById(R.id.Xvalue);
            xString  = val+"";
            valueX.setText(xString);
        }

        if(focus.equals("Y") && yString.length() != 0){
            TextView valueY = findViewById(R.id.Yvalue);
            yString  += val;
            valueY.setText(yString);
        }

        if(focus.equals("Y") && yString.length() == 0 ){
            TextView valueY = findViewById(R.id.Yvalue);
            yString  = val+"";
            valueY.setText(yString);
        }

        if(focus.equals("Z") && zString.length() != 0){
            TextView valueZ = findViewById(R.id.Zvalue);
            zString  += val;
            valueZ.setText(zString);
        }

        if(focus.equals("Z") && zString.length() == 0 ){
            TextView valueZ = findViewById(R.id.Zvalue);
            zString  = val+"";
            valueZ.setText(zString);
        }
    }

    public void specialFunc(String func){
        String xLastChar = xString.charAt(xString.length()-1)+"";
        String yLastChar = yString.charAt(yString.length()-1)+"";
        String zLastChar = zString.charAt(zString.length()-1)+"";
        TextView xText = findViewById(R.id.Xvalue);
        TextView yText = findViewById(R.id.Yvalue);
        TextView zText = findViewById(R.id.Zvalue);
        if(func.equals("del")){
            if(focus.equals("X") && (xString.length() >0) && (xLastChar.equals("."))){
                isDecimal[0] = 0;
                xString = xString.substring(0, (xString.length())-1);
                xText.setText(xString);
            }
            if(focus.equals("Y") && (yString.length() >0) && (yLastChar.equals("."))){
                isDecimal[1] = 0;
                yString = yString.substring(0, (yString.length())-1);
                yText.setText(yString);
            }
            if(focus.equals("Z") && (zString.length() >0) && (zLastChar.equals("."))){
                isDecimal[2] = 0;
                zString = zString.substring(0, (zString.length())-1);
                zText.setText(zString);
            }
            if(focus.equals("X") && (xString.length() >0)){
                xString = xString.substring(0, (xString.length())-1);
                xText.setText(xString);
            }
            if(xString.length() == 0){
                xText.setText("x");
            }
            if(focus.equals("Y") && (yString.length() > 0)){
                yString = yString.substring(0, (yString.length())-1);
                yText.setText(yString);
            }
            if(yString.length() == 0){
                yText.setText("y");
            }
            if(focus.equals("Z") && (zString.length() > 0 )){
                zString = xString.substring(0, (zString.length())-1);
                zText.setText(zString);
            }
            if(zString.length() == 0){
                zText.setText("z");
            }
        }
    }

    public void displayBasic(View v){ displaySubs(1); }
    public void displayAlgebra(View v){ displaySubs(2); }
    public void displayCalculus(View v){ displaySubs(3); }
    public void displayPhysics(View v){ displaySubs(4); }

    public void displaySubs(int num){
        LinearLayout layout1 = findViewById(R.id.basicSub);
        LinearLayout layout2 = findViewById(R.id.algebraSub);
        LinearLayout layout3 = findViewById(R.id.calculusSub);
        LinearLayout layout4 = findViewById(R.id.physicsSub);
        layout1.setVisibility(View.GONE);
        layout2.setVisibility(View.GONE);
        layout3.setVisibility(View.GONE);
        layout4.setVisibility(View.GONE);
        switch(num){
            case 1:
                layout1.setVisibility(View.VISIBLE);
                break;
            case 2:
                layout2.setVisibility(View.VISIBLE);
                break;
            case 3:
                layout3.setVisibility(View.VISIBLE);
                break;
            case 4:
                layout4.setVisibility(View.VISIBLE);
                break;
        };
    }

}//201