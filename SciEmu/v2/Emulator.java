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
    DataConfig data = new DataConfig();
    Formula formula = new Formula();

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
        if(focus.equals("H") && isDecimal[3] != 1){
            setValues(".");
            isDecimal[3] = 1;
        }
        if(focus.equals("W") && isDecimal[4] != 1){
            setValues(".");
            isDecimal[4] = 1;
        }
        if(focus.equals("D") && isDecimal[5] != 1){
            setValues(".");
            isDecimal[5] = 1;
        }
        if(focus.equals("total") && isDecimal[6] != 1){
            setValues(".");
            isDecimal[6] = 1;
        }
    }

    public void focusX(View v){
        focus = "X";
        TextView textMessageX = findViewById(R.id.message);
        textMessageX.setText("Focus on x selected");
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
        textMessageH.setText("Focus on h selected");
    }
    public void focusW(View v){
        focus = "W";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on w selected");
    }
    public void focusD(View v){
        focus = "D";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on D selected");
    }
    public void focusTot(View v){
        focus = "total";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Total selected");
    }
    public void focusEXP(View v){
        focus = "Exponent";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Exponent");
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
        if(focus.equals("H") && hString.length() != 0){
            TextView valueH = findViewById(R.id.Hvalue);
            hString  += val;
            valueH.setText(hString);
        }
        if(focus.equals("H") && hString.length() == 0 ){
            TextView valueH = findViewById(R.id.Hvalue);
            hString  = val+"";
            valueH.setText(hString);
        }
        if(focus.equals("W") && wString.length() != 0){
            TextView valueW = findViewById(R.id.Wvalue);
            wString  += val;
            valueW.setText(wString);
        }
        if(focus.equals("W") && wString.length() == 0 ){
            TextView valueW = findViewById(R.id.Wvalue);
            wString  = val+"";
            valueW.setText(wString);
        }
        if(focus.equals("D") && dString.length() != 0){
            TextView valueD = findViewById(R.id.Dvalue);
            dString  += val;
            valueD.setText(dString);
        }
        if(focus.equals("D") && dString.length() == 0 ){
            TextView valueD = findViewById(R.id.Dvalue);
            dString  = val+"";
            valueD.setText(dString);
        }
        if(focus.equals("total") && totalString.length() != 0){
            TextView valueTotal = findViewById(R.id.Totvalue);
            totalString  += val;
            valueTotal.setText(totalString);
        }
        if(focus.equals("total") && totalString.length() == 0 ){
            TextView valueTotal = findViewById(R.id.Totvalue);
            totalString  = val+"";
            valueTotal.setText(totalString);
        }
    }

    public void specialFunc(String func){
        TextView xText = findViewById(R.id.Xvalue);
        TextView yText = findViewById(R.id.Yvalue);
        TextView zText = findViewById(R.id.Zvalue);
        TextView hText = findViewById(R.id.Hvalue);
        TextView wText = findViewById(R.id.Wvalue);
        TextView dText = findViewById(R.id.Dvalue);
        TextView t1Text = findViewById(R.id.Totvalue);
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

            if (focus.equals("H") && hString.length() > 0) {
                String hLastChar = hString.charAt(hString.length() - 1) + "";
                if (hLastChar.equals(".")) {
                    isDecimal[3] = 0;
                    hString = hString.substring(0, (hString.length()) - 1);
                    hText.setText(hString);
                } else if (focus.equals("H") && (hString.length() > 0)) {
                    hString = hString.substring(0, (hString.length()) - 1);
                    hText.setText(hString);
                }
            }
            if(hString.length() == 0){
                hText.setText("h");
            }

            if (focus.equals("W") && wString.length() > 0) {
                String wLastChar = wString.charAt(wString.length() - 1) + "";
                if (wLastChar.equals(".")) {
                    isDecimal[4] = 0;
                    wString = wString.substring(0, (wString.length()) - 1);
                    wText.setText(wString);
                } else if (focus.equals("W") && (wString.length() > 0)) {
                    wString = wString.substring(0, (wString.length()) - 1);
                    wText.setText(wString);
                }
            }
            if(wString.length() == 0){
                wText.setText("w");
            }

            if (focus.equals("D") && dString.length() > 0) {
                String dLastChar = dString.charAt(dString.length() - 1) + "";
                if (dLastChar.equals(".")) {
                    isDecimal[5] = 0;
                    dString = dString.substring(0, (dString.length()) - 1);
                    dText.setText(dString);
                } else if (focus.equals("D") && (dString.length() > 0)) {
                    dString = dString.substring(0, (dString.length()) - 1);
                    dText.setText(dString);
                }
            }
            if(dString.length() == 0){
                dText.setText("d");
            }

            if (focus.equals("total") && totalString.length() > 0) {
                String totalLastChar = totalString.charAt(totalString.length() - 1) + "";
                if (totalLastChar.equals(".")) {
                    isDecimal[6] = 0;
                    totalString = totalString.substring(0, (totalString.length()) - 1);
                    t1Text.setText(totalString);
                } else if (focus.equals("total") && (totalString.length() > 0)) {
                    totalString = totalString.substring(0, (totalString.length()) - 1);
                    t1Text.setText(totalString);
                }
            }
            if(totalString.length() == 0){
                t1Text.setText("total");
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
    public void Area3D(View v){
        subCategory = "Area3D";
        setFormulaText(subCategory);
    }
    public void setExponent(View v){
        subCategory = "Exponent";
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
                if (Double.valueOf(xString)%Double.valueOf(yString)!=0) {
                    double xx = Double.valueOf(xString);
                    double yy = Double.valueOf(yString);
                    double zz = xx/yy;
                    zString = zz + "";
                    TextView valueZ = findViewById(R.id.Zvalue);
                    valueZ.setText(zString);
                    zString = "";
                } else if (isDecimal[0]==1 || isDecimal[1]==1) {
                    double xx = Double.valueOf(xString);
                    double yy = Double.valueOf(yString);
                    double zz = xx/yy;
                    zString = zz + "";
                    TextView valueZ = findViewById(R.id.Zvalue);
                    valueZ.setText(zString);
                    zString = "";
                } else {
                    z = Integer.parseInt(xString)/Integer.parseInt(yString);
                    zString = z + "";
                    TextView valueZ = findViewById(R.id.Zvalue);
                    valueZ.setText(zString);
                    zString = "";
                }
            }else if (zString.length() > 0 && yString.length() == 0 && xString.length() > 0) {
                if (Double.valueOf(xString)%Double.valueOf(zString)!=0) {
                    double xx = Double.valueOf(xString);
                    double zz = Double.valueOf(zString);
                    double yy = xx/zz;
                    yString = yy + "";
                    TextView valueY = findViewById(R.id.Yvalue);
                    valueY.setText(yString);
                    yString = "";
                } else if (isDecimal[0]==1 || isDecimal[2]==1) {
                    double xx = Double.valueOf(xString);
                    double zz = Double.valueOf(zString);
                    double yy = xx/zz;
                    yString = yy + "";
                    TextView valueY = findViewById(R.id.Yvalue);
                    valueY.setText(yString);
                    yString = "";
                } else {
                    y = Integer.parseInt(xString)/Integer.parseInt(zString);
                    yString = y + "";
                    TextView valueY = findViewById(R.id.Yvalue);
                    valueY.setText(yString);
                    yString = "";
                }
            } else if (zString.length() > 0 && yString.length() > 0 && xString.length() == 0) {
                if (isDecimal[2]==1 || isDecimal[1]==1) {
                    double yy = Double.valueOf(yString);
                    double zz = Double.valueOf(zString);
                    double xx = zz*yy;
                    xString = xx + "";
                    TextView valueX = findViewById(R.id.Xvalue);
                    valueX.setText(xString);
                    xString="";
                }else {
                    y = Integer.parseInt(yString);
                    z = Integer.parseInt(zString);
                    x = z*y;
                    xString = x + "";
                    TextView valueX = findViewById(R.id.Xvalue);
                    valueX.setText(xString);
                    xString="";
                }
            } else {
                TextView errorMessage = findViewById(R.id.message);
                errorMessage.setText("Check your forumla as there sames to be an error");
            }
        }
        if(subCategory.equals("multiply")) {
            if (zString.length() == 0 && yString.length() > 0 && xString.length() > 0) {
                if (isDecimal[0] == 1 || isDecimal[1] == 1) {
                    double yy = Double.valueOf(yString);
                    double xx = Double.valueOf(xString);
                    double zz = xx * yy;
                    zString = zz + "";
                    TextView valueZ = findViewById(R.id.Zvalue);
                    valueZ.setText(zString);
                    zString = "";
                } else {
                    x =Integer.parseInt(xString);
                    y =Integer.parseInt(yString);
                    z = x * y;
                    zString = z + "";
                    TextView valueZ = findViewById(R.id.Zvalue);
                    valueZ.setText(zString);
                    zString = "";
                }
            }else if (zString.length() > 0 && yString.length() == 0 && xString.length() > 0) {
                if (Double.valueOf(zString) % Double.valueOf(xString) != 0) {
                    double xx = Double.valueOf(xString);
                    double zz = Double.valueOf(zString);
                    double yy = zz / xx;
                    yString = yy + "";
                    TextView valueY = findViewById(R.id.Yvalue);
                    valueY.setText(yString);
                    yString = "";
                } else if (isDecimal[0] == 1 || isDecimal[2] == 1) {
                    double xx = Double.valueOf(xString);
                    double zz = Double.valueOf(zString);
                    double yy = zz / xx;
                    yString = yy + "";
                    TextView valueY = findViewById(R.id.Yvalue);
                    valueY.setText(yString);
                    yString = "";
                } else {
                    y = Integer.parseInt(zString) / Integer.parseInt(xString);
                    yString = y + "";
                    TextView valueY = findViewById(R.id.Yvalue);
                    valueY.setText(yString);
                    yString = "";
                }
            }else if (zString.length() > 0 && yString.length() > 0 && xString.length() == 0) {
                if (Double.valueOf(zString) % Double.valueOf(yString) != 0) {
                    double yy = Double.valueOf(yString);
                    double zz = Double.valueOf(zString);
                    double xx = zz / yy;
                    yString = xx + "";
                    TextView valueX = findViewById(R.id.Xvalue);
                    valueX.setText(xString);
                    xString = "";
                } else if (isDecimal[1] == 1 || isDecimal[2] == 1) {
                    double yy = Double.valueOf(yString);
                    double zz = Double.valueOf(zString);
                    double xx = zz / yy;
                    yString = xx + "";
                    TextView valueX = findViewById(R.id.Xvalue);
                    valueX.setText(xString);
                    xString = "";
                } else {
                    x = Integer.parseInt(zString) / Integer.parseInt(yString);
                    xString = x + "";
                    TextView valueX = findViewById(R.id.Xvalue);
                    valueX.setText(xString);
                    xString = "";
                }
            } else {
                TextView errorMessage = findViewById(R.id.message);
                errorMessage.setText("Check your forumla as there sames to be an error");
            }
        }
        if(subCategory.equals("Area2D")){
            if(isDecimal[3] == 1 || isDecimal[4] == 1 || isDecimal[6] == 1){
                String result1 = formula.Multiply(hString, wString, totalString, 1);
                if(hString.length() > 0 && wString.length() > 0 && totalString.length() == 0){
                    TextView TotalText = findViewById(R.id.Totvalue);
                    TotalText.setText(result1);
                    totalString = "";
                }else if(hString.length() > 0 && wString.length() == 0 && totalString.length() > 0){
                    TextView wText = findViewById(R.id.Wvalue);
                    wText.setText(result1);
                    wString = "";
                }else if(hString.length() == 0 && wString.length() > 0 && totalString.length() > 0){
                    TextView hText = findViewById(R.id.Hvalue);
                    hText.setText(result1);
                    hString = "";
                }
            }else{
                String result2 = formula.Multiply(hString, wString, totalString, 0);
                if(hString.length() > 0 && wString.length() > 0 && totalString.length() == 0){
                    TextView TotalText = findViewById(R.id.Totvalue);
                    TotalText.setText(result2);
                    totalString = "";
                }else if(hString.length() > 0 && wString.length() == 0 && totalString.length() > 0){
                    TextView wText = findViewById(R.id.Wvalue);
                    wText.setText(result2);
                    wString = "";
                }else if(hString.length() == 0 && wString.length() > 0 && totalString.length() > 0){
                    TextView hText = findViewById(R.id.Hvalue);
                    hText.setText(result2);
                    hString = "";
                }
            }
        }
        if(subCategory.equals("Area3D")){
            if(isDecimal[3] == 1 || isDecimal[4] == 1 || isDecimal[5]== 1 ||isDecimal[6] == 1){
                String result1 = formula.Area3(hString, wString, dString, totalString, 1);
                if(hString.length() > 0 && wString.length() > 0 && dString.length()>0 && totalString.length() == 0){
                    TextView TotalText = findViewById(R.id.Totvalue);
                    TotalText.setText(result1);
                    totalString = "";
                }else if(hString.length() > 0 && wString.length() > 0 && dString.length() ==0 && totalString.length() > 0){
                    TextView dText = findViewById(R.id.Dvalue);
                    dText.setText(result1);
                    dString = "";
                }else if(hString.length() > 0 && wString.length() == 0 && dString.length()>0 && totalString.length() > 0){
                    TextView wText = findViewById(R.id.Wvalue);
                    wText.setText(result1);
                    wString = "";
                }else if(hString.length() == 0 && wString.length() > 0 && dString.length()>0&& totalString.length() > 0){
                    TextView hText = findViewById(R.id.Hvalue);
                    hText.setText(result1);
                    hString = "";
                }
            }else{
                String result2 = formula.Area3(hString, wString, dString , totalString, 0);
                if(hString.length() > 0 && wString.length() > 0 && dString.length()>0 && totalString.length() == 0){
                    TextView TotalText = findViewById(R.id.Totvalue);
                    TotalText.setText(result2);
                    totalString = "";
                }else if(hString.length() > 0 && wString.length() > 0 && dString.length()==0 && totalString.length() > 0){
                    TextView dText = findViewById(R.id.Dvalue);
                    dText.setText(result2);
                    dString = "";
                }else if(hString.length() > 0 && wString.length() == 0 && dString.length()>0 && totalString.length() > 0){
                    TextView wText = findViewById(R.id.Wvalue);
                    wText.setText(result2);
                    wString = "";
                }else if(hString.length() == 0 && wString.length() > 0 && dString.length()>0 && totalString.length() > 0){
                    TextView hText = findViewById(R.id.Hvalue);
                    hText.setText(result2);
                    hString = "";
                }
            }
        }
    }

    public void resetUI(){
        xString = "";
        yString = "";
        zString = "";
        hString = "";
        wString = "";
        dString = "";
        totalString = "";
        x=0;
        y=0;
        z=0;
        h=0;
        w=0;
        d=0;
        total=0;
        TextView xTextString = findViewById(R.id.Xvalue);
        xTextString.setText("x");
        xTextString.setVisibility(View.VISIBLE);
        TextView yTextString = findViewById(R.id.Yvalue);
        yTextString.setVisibility(View.VISIBLE);
        yTextString.setText("y");
        TextView zTextString = findViewById(R.id.Zvalue);
        zTextString.setVisibility(View.VISIBLE);
        zTextString.setText("z");
        TextView hTextString = findViewById(R.id.Hvalue);
        hTextString.setVisibility(View.INVISIBLE);
        TextView wTextString = findViewById(R.id.Wvalue);
        wTextString.setVisibility(View.INVISIBLE);
        TextView dTextString = findViewById(R.id.Dvalue);
        dTextString.setVisibility(View.INVISIBLE);
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
            TextView expTextSTring = findViewById(R.id.expSuper);
            expTextSTring.setVisibility(View.INVISIBLE);
            resetUI();
            sign1Text.setText("+");
            sign1Text.setVisibility(View.VISIBLE);
            TextView sign2Text = findViewById(R.id.sign2);
            sign2Text.setVisibility(View.GONE);
            TextView dTextString = findViewById(R.id.Dvalue);
            dTextString.setVisibility(View.GONE);
            textMessageSub.setText("Addition selected");
        }else if(subCategory.equals("subtract")){
            resetUI();
            sign1Text.setText("-");
            sign1Text.setVisibility(View.VISIBLE);
            TextView sign2Text = findViewById(R.id.sign2);
            sign2Text.setVisibility(View.GONE);
            TextView dTextString = findViewById(R.id.Dvalue);
            dTextString.setVisibility(View.GONE);
            TextView expTextSTring = findViewById(R.id.expSuper);
            expTextSTring.setVisibility(View.INVISIBLE);
            textMessageSub.setText("Subtraction selected");
        }else if(subCategory.equals("divide")){
            resetUI();
            sign1Text.setText("/");
            sign1Text.setVisibility(View.VISIBLE);
            TextView sign2Text = findViewById(R.id.sign2);
            sign2Text.setVisibility(View.GONE);
            TextView dTextString = findViewById(R.id.Dvalue);
            dTextString.setVisibility(View.GONE);
            TextView expTextSTring = findViewById(R.id.expSuper);
            expTextSTring.setVisibility(View.INVISIBLE);
            textMessageSub.setText("Division Selected");
        }else if(subCategory.equals("multiply")){
            resetUI();
            sign1Text.setText("*");
            sign1Text.setVisibility(View.VISIBLE);
            TextView sign2Text = findViewById(R.id.sign2);
            sign2Text.setVisibility(View.GONE);
            TextView dTextString = findViewById(R.id.Dvalue);
            dTextString.setVisibility(View.GONE);
            TextView expTextSTring = findViewById(R.id.expSuper);
            expTextSTring.setVisibility(View.INVISIBLE);
            textMessageSub.setText("Multiplication Selected");
        }else if(subCategory.equals("Area2D")){
            TextView sign2Text = findViewById(R.id.sign2);
            sign2Text.setVisibility(View.GONE);
            TextView dTextString = findViewById(R.id.Dvalue);
            dTextString.setVisibility(View.GONE);
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
            TextView expTextSTring = findViewById(R.id.expSuper);
            expTextSTring.setVisibility(View.INVISIBLE);
            textMessageSub.setText("2D Area Selected");
        }else if(subCategory.equals("Area3D")){
            TextView expTextSTring = findViewById(R.id.expSuper);
            expTextSTring.setVisibility(View.INVISIBLE);
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
            TextView sign2Text = findViewById(R.id.sign2);
            sign2Text.setVisibility(View.VISIBLE);
            sign2Text.setText("*");
            TextView dTextString = findViewById(R.id.Dvalue);
            dTextString.setVisibility(View.VISIBLE);
            dTextString.setText("d");
            sign1Text.setText("*");
            TextView totTextString = findViewById(R.id.Totvalue);
            totTextString.setVisibility(View.VISIBLE);
            textMessageSub.setText("3D Area Selected");
        } else if(subCategory.equals("Exponent")){
            TextView yTextString = findViewById(R.id.Yvalue);
            yTextString.setVisibility(View.INVISIBLE);
            TextView zTextString = findViewById(R.id.Zvalue);
            zTextString.setVisibility(View.INVISIBLE);
            TextView sign1String = findViewById(R.id.sign1);
            sign1String.setVisibility(View.INVISIBLE);
            TextView totTextString = findViewById(R.id.Totvalue);
            totTextString.setVisibility(View.VISIBLE);
            TextView sign2Text = findViewById(R.id.sign2);
            sign2Text.setVisibility(View.INVISIBLE);
            TextView expTextSTring = findViewById(R.id.expSuper);
            expTextSTring.setVisibility(View.VISIBLE);
            TextView dTextString = findViewById(R.id.Dvalue);
            dTextString.setVisibility(View.GONE);
        }else{
            textMessageSub.setText("Check your formula");
        }
    }
}//884