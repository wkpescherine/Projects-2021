package com.example.sciemu_x2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Emulator extends AppCompatActivity {
    int x = 0;
    int y = 0;
    int z = 0;
    int h = 0;
    int w = 0;
    int d = 0;
    int total = 0;
    // Location   is =  x,y,z,h,w,d,total
    int [] isDecimal = {0,0,0,0,0,0,0};
    String xString = "";
    String yString = "";
    String zString = "";
    String hString = "";
    String wString = "";
    String dString = "";
    String totalString = "";
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
        if(focus.equals("X") && isDecimal[0] != 1){
            setValues(".");
            isDecimal[0] = 1;
        }
        if(focus.equals("Y") && isDecimal[1] != 1){
            setValues(".");
            isDecimal[1] = 1;
        }
        if(focus.equals("Z") && isDecimal[2] != 1){
            setValues(".");
            isDecimal[2] = 1;
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
        textMessageZ.setText("Focus on z selected");
    }
    public void focusH(View v){
        focus = "H";
        TextView textMessageH = findViewById(R.id.message);
        textMessageH.setText("docus on h selected");
    }
    public void focusW(View v){
        focus = "W";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on w selected");
    }
    public void focusTot(View v){
        focus = "total";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Total selected");
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
        TextView xText = findViewById(R.id.Xvalue);
        TextView yText = findViewById(R.id.Yvalue);
        TextView zText = findViewById(R.id.Zvalue);
        if(func.equals("del")) {
            if (focus.equals("X") && xString.length() > 0) {
                String xLastChar = xString.charAt(xString.length() - 1) + "";
                if (xLastChar.equals(".")) {
                    isDecimal[0] = 0;
                    xString = xString.substring(0, (xString.length()) - 1);
                    xText.setText(xString);
                } else if (focus.equals("X") && (xString.length() > 0)) {
                    xString = xString.substring(0, (xString.length()) - 1);
                    xText.setText(xString);
                }
            }
            if(xString.length() == 0){
                xText.setText("x");
            }

            if (focus.equals("Y") && yString.length() > 0) {
                String yLastChar = yString.charAt(yString.length() - 1) + "";
                if (yLastChar.equals(".")) {
                    isDecimal[1] = 0;
                    yString = yString.substring(0, (yString.length()) - 1);
                    yText.setText(yString);
                } else if (focus.equals("Y") && (yString.length() > 0)) {
                    yString = yString.substring(0, (yString.length()) - 1);
                    yText.setText(yString);
                }
            }
            if(yString.length() == 0){
                yText.setText("y");
            }

            if (focus.equals("Z") && zString.length() > 0) {
                String zLastChar = zString.charAt(zString.length() - 1) + "";
                if (zLastChar.equals(".")) {
                    isDecimal[2] = 0;
                    zString = zString.substring(0, (zString.length()) - 1);
                    zText.setText(zString);
                } else if (focus.equals("Z") && (zString.length() > 0)) {
                    zString = zString.substring(0, (zString.length()) - 1);
                    zText.setText(zString);
                }
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

    public void setAddition(View v){
        resetUI();
        subCategory = "add";
        setFormulaText(subCategory);
    }
    public void setSubtraction(View v){
        resetUI();
        subCategory = "subtract";
        setFormulaText(subCategory);
    }
    public void setDivision(View v){
        resetUI();
        subCategory = "divide";
        setFormulaText(subCategory);
    }
    public void setMultiplication(View v){
        resetUI();
        subCategory = "multiply";
        setFormulaText(subCategory);
    }
    public void Area2D(View v){
        subCategory = "Area2D";
        setFormulaText(subCategory);
    }

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

    public void practiceSection(View v){
        Intent intent = new Intent(this, PracticeSection.class);
        startActivity(intent);
    }

    public void clickToSolve(View v){
        TextView textMessageSolve = findViewById(R.id.message);
        if(subCategory.equals("add")) {
            if (yString.length() > 0 && xString.length() > 0) {
                if (isDecimal[0]==1 || isDecimal[1]==1) {
                    double yy = Double.valueOf(yString);
                    double xx = Double.valueOf(xString);
                    double zz = xx+yy;
                    zString = zz+"";
                    TextView valueZ = findViewById(R.id.Zvalue);
                    textMessageSolve.setText("Solved");
                    valueZ.setText(zString);
                    zString = "";
                }else {
                    x = Integer.parseInt(xString);
                    y = Integer.parseInt(yString);
                    z = x + y;
                    zString = z + "";
                    TextView valueZ = findViewById(R.id.Zvalue);
                    textMessageSolve.setText("Solved");
                    valueZ.setText(zString);
                    zString = "";
                }
            }
            if (zString.length() > 0 && xString.length() > 0) {
                if (isDecimal[2]==1 || isDecimal[0]==1) {
                    double zz = Double.valueOf(zString);
                    double xx = Double.valueOf(xString);
                    double yy = zz - xx;
                    yString = yy+"";
                    TextView valueY = findViewById(R.id.Yvalue);
                    textMessageSolve.setText("Solved");
                    valueY.setText(yString);
                    yString = "";
                }else {
                    x = Integer.parseInt(xString);
                    z = Integer.parseInt(zString);
                    y = z-x;
                    yString = y + "";
                    TextView valueY = findViewById(R.id.Yvalue);
                    textMessageSolve.setText("Solved");
                    valueY.setText(yString);
                    yString = "";
                }
            }
            if (zString.length() > 0 && yString.length() > 0) {
                if (isDecimal[2]==1 || isDecimal[1]==1) {
                    double zz = Double.valueOf(zString);
                    double yy = Double.valueOf(yString);
                    double xx = zz - yy;
                    xString = xx+"";
                    TextView valueX = findViewById(R.id.Xvalue);
                    textMessageSolve.setText("Solved");
                    valueX.setText(xString);
                    xString = "";
                }else {
                    y = Integer.parseInt(yString);
                    z = Integer.parseInt(zString);
                    x = z-y;
                    xString = x + "";
                    TextView valueX = findViewById(R.id.Xvalue);
                    textMessageSolve.setText("Solved");
                    valueX.setText(xString);
                    xString = "";
                }
            }
        }
        if(subCategory.equals("subtract")) {
            if (yString.length() > 0 && xString.length() > 0) {
                if (isDecimal[0]==1 || isDecimal[1]==1) {
                    double yy = Double.valueOf(yString);
                    double xx = Double.valueOf(xString);
                    double zz = xx-yy;
                    zString = zz+"";
                    TextView valueZ = findViewById(R.id.Zvalue);
                    textMessageSolve.setText("Solved");
                    valueZ.setText(zString);
                    zString = "";
                }else {
                    x = Integer.parseInt(xString);
                    y = Integer.parseInt(yString);
                    z = x - y;
                    zString = z + "";
                    TextView valueZ = findViewById(R.id.Zvalue);
                    textMessageSolve.setText("Solved");
                    valueZ.setText(zString);
                    zString = "";
                }
            }
            if (zString.length() > 0 && xString.length() > 0) {
                if (isDecimal[2]==1 || isDecimal[0]==1) {
                    double zz = Double.valueOf(zString);
                    double xx = Double.valueOf(xString);
                    double yy = xx - zz;
                    yString = yy+"";
                    TextView valueY = findViewById(R.id.Yvalue);
                    textMessageSolve.setText("Solved");
                    valueY.setText(yString);
                    yString = "";
                }else {
                    x = Integer.parseInt(xString);
                    z = Integer.parseInt(zString);
                    y = x - z;
                    yString = y + "";
                    TextView valueY = findViewById(R.id.Yvalue);
                    textMessageSolve.setText("Solved");
                    valueY.setText(yString);
                    yString = "";
                }
            }
            if (zString.length() > 0 && yString.length() > 0) {
                if (isDecimal[2]==1 || isDecimal[1]==1) {
                    double zz = Double.valueOf(zString);
                    double yy = Double.valueOf(yString);
                    double xx = zz + yy;
                    xString = xx+"";
                    TextView valueX = findViewById(R.id.Xvalue);
                    textMessageSolve.setText("Solved");
                    valueX.setText(xString);
                    xString = "";
                }else {
                    y = Integer.parseInt(yString);
                    z = Integer.parseInt(zString);
                    x = z+y;
                    xString = x + "";
                    TextView valueX = findViewById(R.id.Xvalue);
                    textMessageSolve.setText("Solved");
                    valueX.setText(xString);
                    xString = "";
                }
            }
        }
        if(subCategory.equals("divide")) {
            if (zString.length() == 0 && yString.length() > 0 && xString.length() > 0) {
                if (isDecimal[0]==1 || isDecimal[1]==1) {
                    double xx = Double.valueOf(x);
                    double yy = Double.valueOf(y);
                    double zz = xx/yy;
                    zString = zz + "";
                    TextView valueZ = findViewById(R.id.Zvalue);
                    valueZ.setText(zString);
                } else {
                    y = Integer.parseInt(yString);
                    x = Integer.parseInt(xString);
                    z = x/y;
                    zString = z + "";
                    TextView valueZ = findViewById(R.id.Zvalue);
                    valueZ.setText(zString);
                    zString = "";
                }
            } else if (zString.length() > 0 && yString.length() == 0 && xString.length() > 0) {
                if (isDecimal[0]==1 || isDecimal[2]==1) {
                    double xx = Double.valueOf(x);
                    double zz = Double.valueOf(z);
                    double yy = xx/zz ;
                    yString = yy + "";
                    TextView valueY = findViewById(R.id.Yvalue);
                    valueY.setText(yString);
                } else {
                    y = x/z;
                    yString = y + "";
                    TextView valueY = findViewById(R.id.Yvalue);
                    valueY.setText(yString);
                }
            } else if (zString.length() > 0 && yString.length() > 0 && xString.length() == 0) {
                if (isDecimal[2]==1 || isDecimal[1]==1) {
                    double yy = Double.valueOf(y);
                    double zz = Double.valueOf(z);
                    double xx = zz*yy;
                    xString = xx + "";
                    TextView valueX = findViewById(R.id.Xvalue);
                    valueX.setText(xString);
                }else {
                    y = Integer.parseInt(yString);
                    z = Integer.parseInt(zString);
                    x = z*y;
                    xString = Math.abs(x) + "";
                    TextView valueX = findViewById(R.id.Xvalue);
                    valueX.setText(xString);
                }
            } else {
                TextView errorMessage = findViewById(R.id.message);
                errorMessage.setText("Check your forumla as there sames to be an error");
            }
        }
    }

    public void resetUI(){
        TextView xTextString = findViewById(R.id.Xvalue);
        xTextString.setVisibility(View.VISIBLE);
        TextView yTextString = findViewById(R.id.Yvalue);
        yTextString.setVisibility(View.VISIBLE);
        TextView zTextString = findViewById(R.id.Zvalue);
        zTextString.setVisibility(View.VISIBLE);
        TextView hTextString = findViewById(R.id.Hvalue);
        hTextString.setVisibility(View.INVISIBLE);
        TextView wTextString = findViewById(R.id.Wvalue);
        wTextString.setVisibility(View.INVISIBLE);
        TextView totTextString = findViewById(R.id.Totvalue);
        totTextString.setVisibility(View.INVISIBLE);
    }

    public void setFormulaText(String sub){
        RelativeLayout main = findViewById(R.id.main);
        TextView sign1Text = findViewById(R.id.sign1);
        main.setVisibility(View.VISIBLE);
        TextView textMessageSub = findViewById(R.id.message);
        textMessageSub.setText(subCategory);
        if(subCategory.equals("add")){
            resetUI();
            sign1Text.setText("+");
            textMessageSub.setText("Addition selected");
        }else if(subCategory.equals("subtract")){
            resetUI();
            sign1Text.setText("-");
            textMessageSub.setText("Subtraction selected");
        }else if(subCategory.equals("divide")){
            resetUI();
            sign1Text.setText("/");
            textMessageSub.setText("Division Selected");
        }else if(subCategory.equals("multiply")){
            resetUI();
            sign1Text.setText("*");
            textMessageSub.setText("Multiplication Selected");
        }else if(subCategory.equals("Area2D")){
            TextView xTextString = findViewById(R.id.Xvalue);
            xTextString.setVisibility(View.INVISIBLE);
            TextView yTextString = findViewById(R.id.Yvalue);
            yTextString.setVisibility(View.INVISIBLE);
            TextView zTextString = findViewById(R.id.Zvalue);
            zTextString.setVisibility(View.INVISIBLE);
            TextView hTextString = findViewById(R.id.Hvalue);
            hTextString.setVisibility(View.VISIBLE);
            TextView wTextString = findViewById(R.id.Wvalue);
            wTextString.setVisibility(View.VISIBLE);
            sign1Text.setText("*");
            TextView totTextString = findViewById(R.id.Totvalue);
            totTextString.setVisibility(View.VISIBLE);
            textMessageSub.setText("2D Area Selected");
        }else{
            textMessageSub.setText("Check your formula");
        }
    }
}//492