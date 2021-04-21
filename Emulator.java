package com.example.sciemu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Emulator extends AppCompatActivity {
    DataConfig data = new DataConfig();
    Formula formula = new Formula();
    SolveCustom custom = new SolveCustom();

    int total = 0;
    int customValid = 0;
    // Location is = x,y,z,h,w,d,total, exp value, exponent, custom, radius
    int [] isDecimal = {0,0,0,0,0,0,0,0,0,0,0};
    String xString = "";
    String yString = "";
    String zString = "";
    String hString = "";
    String wString = "";
    String dString = "";
    String radius = "";
    String expValueString = "";
    String expString = "";
    String totalString = "";
    String focus = "";
    String subCategory = "";
    String customString = "";

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
        if(focus.equals("expValue") && isDecimal[7] != 1){
            setValues(".");
            isDecimal[7] = 1;
        }
        if(focus.equals("custom") && isDecimal[9] != 1){
            setValues(".");
            isDecimal[9] = 1;
        }
        if(focus.equals("Radius") && isDecimal[10] != 1){
            setValues(".");
            isDecimal[10] = 1;
        }
    }
    public void plus(View v){ setValues("+"); }
    public void minus(View v){ setValues("-"); }
    public void multi(View v){ setValues("*"); }


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
    public void focusRadius(View v){
        focus = "Radius";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Radius selected");
    }
    public void focusTot(View v){
        focus = "total";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Total selected");
    }
    public void focusEXP(View v){
        focus = "expValue";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Exponent Value");
    }
    public void focusEXPSUP(View v){
        focus = "expSuper";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Exponent");
    }

    public void setValues(String val){
        if(focus.equals("X") && xString.length() != 0){
            TextView valueX = findViewById(R.id.Xvalue);
            xString  += val+"";
            valueX.setText(xString);
        }else if (focus.equals("X") && xString.length() == 0 ) {
            TextView valueX = findViewById(R.id.Xvalue);
            xString  = val+"";
            valueX.setText(xString);
        } else if(focus.equals("Y") && yString.length() != 0){
            TextView valueY = findViewById(R.id.Yvalue);
            yString  += val;
            valueY.setText(yString);
        } else if(focus.equals("Y") && yString.length() == 0 ){
            TextView valueY = findViewById(R.id.Yvalue);
            yString  = val+"";
            valueY.setText(yString);
        } else if(focus.equals("Z") && zString.length() != 0){
            TextView valueZ = findViewById(R.id.Zvalue);
            zString  += val;
            valueZ.setText(zString);
        } else if(focus.equals("Z") && zString.length() == 0 ){
            TextView valueZ = findViewById(R.id.Zvalue);
            zString  = val+"";
            valueZ.setText(zString);
        } else if(focus.equals("H") && hString.length() != 0){
            TextView valueH = findViewById(R.id.Hvalue);
            hString  += val;
            valueH.setText(hString);
        } else if(focus.equals("H") && hString.length() == 0 ){
            TextView valueH = findViewById(R.id.Hvalue);
            hString  = val+"";
            valueH.setText(hString);
        } else if(focus.equals("W") && wString.length() != 0){
            TextView valueW = findViewById(R.id.Wvalue);
            wString  += val;
            valueW.setText(wString);
        } else if(focus.equals("W") && wString.length() == 0 ){
            TextView valueW = findViewById(R.id.Wvalue);
            wString  = val+"";
            valueW.setText(wString);
        } else if(focus.equals("D") && dString.length() != 0){
            TextView valueD = findViewById(R.id.Dvalue);
            dString  += val;
            valueD.setText(dString);
        } else if(focus.equals("D") && dString.length() == 0 ){
            TextView valueD = findViewById(R.id.Dvalue);
            dString  = val+"";
            valueD.setText(dString);
        } else if(focus.equals("total") && totalString.length() != 0){
            TextView valueTotal = findViewById(R.id.Totvalue);
            totalString  += val;
            valueTotal.setText(totalString);
        } else if(focus.equals("total") && totalString.length() == 0 ){
            TextView valueTotal = findViewById(R.id.Totvalue);
            totalString  = val+"";
            valueTotal.setText(totalString);
        } else if(focus.equals("expValue") && expValueString.length() != 0){
            TextView valueExpValue = findViewById(R.id.expValue);
            expValueString  += val;
            valueExpValue.setText(expValueString);
        } else if(focus.equals("expValue") && expValueString.length() == 0 ){
            TextView valueExpValue = findViewById(R.id.expValue);
            expValueString  = val+"";
            valueExpValue.setText(expValueString);
        } else if(focus.equals("expSuper") && expString.length() != 0){
            TextView valueExp = findViewById(R.id.expSuper);
            expString  += val;
            valueExp.setText(expString);
        } else if(focus.equals("expSuper") && expString.length() == 0 ){
            TextView valueExp = findViewById(R.id.expSuper);
            expString  = val+"";
            valueExp.setText(expString);
        } else if(focus.equals("custom")){
            if(customValid == 1 && (val.equals("+") || val.equals("-") || val.equals("*"))) {
                TextView valueCustom = findViewById(R.id.Custom);
                customString += val;
                valueCustom.setText(customString);
                customValid = 0;
            } else {
                TextView valueCustom = findViewById(R.id.Custom);
                customString += val;
                valueCustom.setText(customString);
                customValid = 1;
            }
        } else if(focus.equals("custom") && customString.length() == 0 ){
            TextView valueCustom = findViewById(R.id.custom);
            customString  = val+"";
            valueCustom.setText(customString);
        } else if(focus.equals("radius") && radius.length() != 0){
            TextView valueRadius = findViewById(R.id.Radius);
            radius  += val;
            valueRadius.setText(radius);
        } else if(focus.equals("radius") && radius.length() == 0 ){
            TextView valueRadius = findViewById(R.id.Radius);
            radius  = val+"";
            valueRadius.setText(radius);
        } else {
            TextView textMessageX = findViewById(R.id.message);
            textMessageX.setText("ERROR!!!");
        }
    }
    public void specialFunc(String func){
        TextView xText = findViewById(R.id.Xvalue);
        TextView yText = findViewById(R.id.Yvalue);
        TextView zText = findViewById(R.id.Zvalue);
        TextView hText = findViewById(R.id.Hvalue);
        TextView wText = findViewById(R.id.Wvalue);
        TextView dText = findViewById(R.id.Dvalue);
        TextView eText = findViewById(R.id.expSuper);
        TextView evText = findViewById(R.id.expValue);
        TextView t1Text = findViewById(R.id.Totvalue);
        TextView customText = findViewById(R.id.custom);
        TextView radiusText = findViewById(R.id.Radius);
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

            if (focus.equals("expValue") && expValueString.length() > 0) {
                String expValueLastChar = expValueString.charAt(expValueString.length() - 1) + "";
                if (expValueLastChar.equals(".")) {
                    isDecimal[7] = 0;
                    expValueString = expValueString.substring(0, (expValueString.length()) - 1);
                    evText.setText(expValueString);
                } else if (focus.equals("expValue") && (expValueString.length() > 0)) {
                    expValueString = expValueString.substring(0, (expValueString.length()) - 1);
                    evText.setText(expValueString);
                }
            }
            if(expValueString.length() == 0){
                evText.setText("x");
            }

            if (focus.equals("expSuper") && expString.length() > 0) {
                String expLastChar = expString.charAt(expString.length() - 1) + "";
                if (expLastChar.equals(".")) {
                    isDecimal[8] = 0;
                    expString = expString.substring(0, (expString.length()) - 1);
                    eText.setText(expString);
                } else if (focus.equals("expSuper") && (expString.length() > 0)) {
                    expString = expString.substring(0, (expString.length()) - 1);
                    eText.setText(expString);
                }
            }
            if(expString.length() == 0){
                eText.setText("exp");
            }

            if (focus.equals("custom") && customString.length() > 0) {
                String customLastChar = customString.charAt(expString.length() - 1) + "";
                if (customLastChar.equals(".")) {
                    isDecimal[9] = 0;
                    customString = customString.substring(0, (customString.length()) - 1);
                    eText.setText(expString);
                } else if (focus.equals("custom") && (customString.length() > 0)) {
                    customString = customString.substring(0, (customString.length()) - 1);
                    customText.setText(customString);
                }
            }
            /*
            if(customString.length() == 0){
                customText.setText("");
            }

            if (focus.equals("radius") && radius.length() > 0) {
                String expLastChar = radius.charAt(radius.length() - 1) + "";
                if (expLastChar.equals(".")) {
                    radius = radius.substring(0, (radius.length()) - 1);
                    radiusText.setText(radius);
                } else if (focus.equals("radius") && (radius.length() > 0)) {
                    radius = radius.substring(0, (radius.length()) - 1);
                    eText.setText(radius);
                }
            }
            if(radius.length() == 0){
                radiusText.setText("radius");
            }*/
        }
    }

    public void displayBasic(View v){ displaySubs(1); }
    public void displayAlgebra(View v){ displaySubs(2); }
    public void displayCalculus(View v){ displaySubs(3); }
    public void displayPhysics(View v){ displaySubs(4); }
    public void displayGeometry(View v){ displaySubs(5);}
    public void displayCustom(View v){
        focus = "custom";
        subCategory = "custom";
        setFormulaText(subCategory);
    }

    public void setAddition(View v){
        subCategory = "add";
        setFormulaText(subCategory);
    }
    public void setSubtraction(View v){
        subCategory = "subtract";
        setFormulaText(subCategory);
    }
    public void setDivision(View v){
        subCategory = "divide";
        setFormulaText(subCategory);
    }
    public void setMultiplication(View v){
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
    public void AreaTriangle(View v){
        subCategory = "AreaTriangle";
        setFormulaText(subCategory);
    }
    public void AreaCircle(View v){
        subCategory = "AreaCircle";
        setFormulaText(subCategory);
    }

    public void displaySubs(int num){
        LinearLayout layout1 = findViewById(R.id.basicSub);
        LinearLayout layout2 = findViewById(R.id.algebraSub);
        LinearLayout layout3 = findViewById(R.id.calculusSub);
        LinearLayout layout4 = findViewById(R.id.physicsSub);
        LinearLayout layout5 = findViewById(R.id.geometrySub);
        layout1.setVisibility(View.GONE);
        layout2.setVisibility(View.GONE);
        layout3.setVisibility(View.GONE);
        layout4.setVisibility(View.GONE);
        layout5.setVisibility(View.GONE);
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
            case 5:
                layout5.setVisibility(View.VISIBLE);
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
                    int z = Integer.parseInt(xString) + Integer.parseInt(yString);
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
                }else {
                    int y = Integer.parseInt(zString)-Integer.parseInt(xString);
                    yString = y + "";
                    TextView valueY = findViewById(R.id.Yvalue);
                    textMessageSolve.setText("Solved");
                    valueY.setText(yString);
                } yString = "";
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
                    int x = Integer.parseInt(zString)-Integer.parseInt(yString);
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
                    int z = Integer.parseInt(xString) - Integer.parseInt(yString);
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
                    int y = Integer.parseInt(xString) - Integer.parseInt(zString);
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
                    int x = Integer.parseInt(zString)+Integer.parseInt(yString);
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
                    int z = Integer.parseInt(xString)/Integer.parseInt(yString);
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
                    int y = Integer.parseInt(xString)/Integer.parseInt(zString);
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
                    int x = Integer.parseInt(zString)*Integer.parseInt(yString);
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
                    int z = Integer.parseInt(xString) * Integer.parseInt(yString);
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
                    int y = Integer.parseInt(zString) / Integer.parseInt(xString);
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
                    int x = Integer.parseInt(zString) / Integer.parseInt(yString);
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
        if(subCategory.equals("Exponent")){
            String result = formula.Exponent(expValueString, expString);
            TextView totalText = findViewById(R.id.ExpTotvalue2);
            totalText.setText(result);
            totalString = "";
        }
        if(subCategory.equals("custom")){
            String result = custom.customSolve2(customString);
            TextView totalCustom = findViewById(R.id.CusTotvalue2);
            totalCustom.setText(result);
        }
        if(subCategory.equals("AreaTriangle")){
            String result = formula.AreaTriangle(hString,wString);
            TextView triAreaTotal = findViewById(R.id.Totvalue);
            triAreaTotal.setText(result);
        }
        if(subCategory.equals("AreaCircle")){
            String result = formula.AreaCircle(radius);
            TextView circleAreaTotal = findViewById(R.id.CircleTotvalue);
            circleAreaTotal.setText(result);
        }
    }

    public void resetUI(){
        xString = "";
        yString = "";
        zString = "";
        hString = "";
        wString = "";
        dString = "";
        radius = "";
        expValueString = "";
        expString ="";
        totalString = "";
        total=0;
        TextView xTextString = findViewById(R.id.Xvalue);
        xTextString.setText("x");
        TextView yTextString = findViewById(R.id.Yvalue);
        yTextString.setText("y");
        TextView zTextString = findViewById(R.id.Zvalue);
        zTextString.setText("z");
        TextView hTextString = findViewById(R.id.Hvalue);
        hTextString.setText("h");
        TextView wTextString = findViewById(R.id.Wvalue);
        wTextString.setText("w");
        TextView dTextString = findViewById(R.id.Dvalue);
        dTextString.setText("d");
        TextView expValTextString = findViewById(R.id.expValue);
        expValTextString.setText("x");
        TextView expTextString = findViewById(R.id.expSuper);
        expTextString.setText("exp");
        TextView totTextString = findViewById(R.id.Totvalue);
        totTextString.setText("Total");
        TextView radiusTextString = findViewById(R.id.Radius);
        radiusTextString.setText("radius");
    }

    public void setFormulaText(String sub){
        resetUI();
        LinearLayout mainBasic = findViewById(R.id.basicFormulas);
        LinearLayout main23DArea = findViewById(R.id.Area23DFormulas);
        LinearLayout mainExponent = findViewById(R.id.ExponentFormula);
        LinearLayout mainCustom = findViewById(R.id.CustomFormula);
        LinearLayout mainCircle = findViewById(R.id.CircleFormula);
        TextView sign1Text = findViewById(R.id.sign1);
        TextView textMessageSub = findViewById(R.id.message);
        textMessageSub.setText(subCategory);
        if(subCategory.equals("add")){
            mainBasic.setVisibility(View.VISIBLE);
            main23DArea.setVisibility(View.INVISIBLE);
            mainExponent.setVisibility(View.INVISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.INVISIBLE);
            sign1Text.setText("+");
            textMessageSub.setText("Addition selected");
        }else if(subCategory.equals("subtract")){
            mainBasic.setVisibility(View.VISIBLE);
            main23DArea.setVisibility(View.INVISIBLE);
            mainExponent.setVisibility(View.INVISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.INVISIBLE);
            sign1Text.setText("-");
            textMessageSub.setText("Subtraction selected");
        }else if(subCategory.equals("divide")){
            mainBasic.setVisibility(View.VISIBLE);
            main23DArea.setVisibility(View.INVISIBLE);
            mainExponent.setVisibility(View.INVISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.INVISIBLE);
            sign1Text.setText("/");
            textMessageSub.setText("Division Selected");
        }else if(subCategory.equals("multiply")){
            mainBasic.setVisibility(View.VISIBLE);
            main23DArea.setVisibility(View.INVISIBLE);
            mainExponent.setVisibility(View.INVISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.INVISIBLE);
            sign1Text.setText("+");
            textMessageSub.setText("Multiplication Selected");
        }else if(subCategory.equals("Area2D") || subCategory.equals("AreaTriangle")){
            mainBasic.setVisibility(View.INVISIBLE);
            main23DArea.setVisibility(View.VISIBLE);
            mainExponent.setVisibility(View.INVISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.INVISIBLE);
            if(subCategory.equals("Area2D")){
                textMessageSub.setText("2D Area Selected");
            } else {
                textMessageSub.setText("Area of Triangle Selected");
            }
            TextView sign2Text = findViewById(R.id.sign2);
            sign2Text.setVisibility(View.GONE);
            TextView dTextString = findViewById(R.id.Dvalue);
            dTextString.setVisibility(View.GONE);
        }else if(subCategory.equals("Area3D")){
            mainBasic.setVisibility(View.INVISIBLE);
            main23DArea.setVisibility(View.VISIBLE);
            mainExponent.setVisibility(View.INVISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.INVISIBLE);
            TextView sign2Text = findViewById(R.id.sign2);
            sign2Text.setVisibility(View.VISIBLE);
            TextView dTextString = findViewById(R.id.Dvalue);
            dTextString.setVisibility(View.VISIBLE);
            textMessageSub.setText("3D Area Selected");
        } else if(subCategory.equals("Exponent")){
            mainBasic.setVisibility(View.INVISIBLE);
            main23DArea.setVisibility(View.INVISIBLE);
            mainExponent.setVisibility(View.VISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.INVISIBLE);
        } else if(subCategory.equals("AreaCircle")) {
            mainBasic.setVisibility(View.INVISIBLE);
            main23DArea.setVisibility(View.INVISIBLE);
            mainExponent.setVisibility(View.VISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.VISIBLE);
        } else {
            textMessageSub.setText("Check your formula");
        }
    }
}//994