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
    // Location is = x,y,z,h,w,d,total, exp value, exponent, custom, radius, sppedI,speedF,time
    int[] isDecimal = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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

    public void num1(View v) { setValues("1"); }
    public void num2(View v) { setValues("2"); }
    public void num3(View v) { setValues("3"); }
    public void num4(View v) {
        setValues("4");
    }
    public void num5(View v) {
        setValues("5");
    }
    public void num6(View v) {
        setValues("6");
    }
    public void num7(View v) {
        setValues("7");
    }
    public void num8(View v) {
        setValues("8");
    }
    public void num9(View v) {
        setValues("9");
    }
    public void num0(View v) {
        setValues("0");
    }
    public void del(View v) {
        specialFunc("del");
    }
    public void decimal(View v) {
        if (focus.equals("X") && isDecimal[0] != 1) {
            setValues(".");
            isDecimal[0] = 1;
        }
        if (focus.equals("Y") && isDecimal[1] != 1) {
            setValues(".");
            isDecimal[1] = 1;
        }
        if (focus.equals("Z") && isDecimal[2] != 1) {
            setValues(".");
            isDecimal[2] = 1;
        }
        if (focus.equals("H") && isDecimal[3] != 1) {
            setValues(".");
            isDecimal[3] = 1;
        }
        if (focus.equals("W") && isDecimal[4] != 1) {
            setValues(".");
            isDecimal[4] = 1;
        }
        if (focus.equals("D") && isDecimal[5] != 1) {
            setValues(".");
            isDecimal[5] = 1;
        }
        if (focus.equals("total") && isDecimal[6] != 1) {
            setValues(".");
            isDecimal[6] = 1;
        }
        if (focus.equals("expValue") && isDecimal[7] != 1) {
            setValues(".");
            isDecimal[7] = 1;
        }
        /*if (focus.equals("custom") && isDecimal[9] != 1) {
            setValues(".");
            isDecimal[9] = 1;
        }*/
        if (focus.equals("Radius") && isDecimal[10] != 1) {
            setValues(".");
            isDecimal[10] = 1;
        }
    }
    public void plus(View v) {
        setValues("+");
    }
    public void minus(View v) {
        setValues("-");
    }
    public void multi(View v) {
        setValues("*");
    }
    public void openBracket(View v){ setValues("(");}
    public void closeBracket(View v){ setValues(")");}

    public void setFocus(View v){
        TextView textMessage = findViewById(R.id.message);
        switch(v.getId())
        {
            case R.id.Xvalue:
                focus = "X";
                textMessage.setText("Focus on x selected");
                break;
            case R.id.Yvalue:
                focus = "Y";
                textMessage.setText("Focus on Y selected");
                break;
            case R.id.Zvalue:
                focus = "Z";
                textMessage.setText("Focus on Z selected");
                break;
        }
    }
    public void focusH(View v) {
        focus = "H";
        TextView textMessageH = findViewById(R.id.message);
        textMessageH.setText("Focus on h selected");
    }
    public void focusW(View v) {
        focus = "W";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on w selected");
    }
    public void focusD(View v) {
        focus = "D";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on D selected");
    }
    public void focusRadius(View v) {
        focus = "radius";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Radius selected");
    }
    public void focusTot(View v) {
        focus = "total";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Total selected");
    }
    public void focusEXP(View v) {
        focus = "expValue";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Exponent Value");
    }
    public void focusDegree(View v){
        focus = "degree";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus is on Degrees");
    }
    public void focusEXPSUP(View v) {
        focus = "expSuper";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Exponent");
    }
    public void focusSpeedI(View v) {
        focus = "si";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Speed Int");
    }
    public void focusSpeedF(View v) {
        focus = "sf";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Speed Final");
    }
    public void focusTime(View v) {
        focus = "t";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Time");
    }
    public void focusA(View v) {
        focus = "a";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on A");
    }
    public void focusB(View v) {
        focus = "b";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on B");
    }
    public void focusC(View v) {
        focus = "c";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on C");
    }
    public void focusAngle1(View v) {
        focus = "angle1";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on angle1");
    }
    public void focusAngle2(View v) {
        focus = "angle2";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on angle2");
    }
    public void focusTime2(View v) {
        focus = "time2";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on time");
    }

    public void setValues(String val) {
        if (focus.equals("X") && data.xString.length() != 0) {
            TextView valueX = findViewById(R.id.Xvalue);
            data.xString += val + "";
            valueX.setText(data.xString);
        } else if (focus.equals("X") && data.xString.length() == 0) {
            TextView valueX = findViewById(R.id.Xvalue);
            data.xString = val + "";
            valueX.setText(data.xString);
        } else if (focus.equals("Y") && data.yString.length() != 0) {
            TextView valueY = findViewById(R.id.Yvalue);
            data.yString += val;
            valueY.setText(data.yString);
        } else if (focus.equals("Y") && data.yString.length() == 0) {
            TextView valueY = findViewById(R.id.Yvalue);
            data.yString = val + "";
            valueY.setText(data.yString);
        } else if (focus.equals("Z") && data.zString.length() != 0) {
            TextView valueZ = findViewById(R.id.Zvalue);
            data.zString += val;
            valueZ.setText(data.zString);
        } else if (focus.equals("Z") && data.zString.length() == 0) {
            TextView valueZ = findViewById(R.id.Zvalue);
            data.zString = val + "";
            valueZ.setText(data.zString);
        } else if (focus.equals("H") && hString.length() != 0) {
            TextView valueH = findViewById(R.id.Hvalue);
            hString += val;
            valueH.setText(hString);
        } else if (focus.equals("H") && hString.length() == 0) {
            TextView valueH = findViewById(R.id.Hvalue);
            hString = val + "";
            valueH.setText(hString);
        } else if (focus.equals("W") && wString.length() != 0) {
            TextView valueW = findViewById(R.id.Wvalue);
            wString += val;
            valueW.setText(wString);
        } else if (focus.equals("W") && wString.length() == 0) {
            TextView valueW = findViewById(R.id.Wvalue);
            wString = val + "";
            valueW.setText(wString);
        } else if (focus.equals("D") && dString.length() != 0) {
            TextView valueD = findViewById(R.id.Dvalue);
            dString += val;
            valueD.setText(dString);
        } else if (focus.equals("D") && dString.length() == 0) {
            TextView valueD = findViewById(R.id.Dvalue);
            dString = val + "";
            valueD.setText(dString);
        } else if (focus.equals("total") && totalString.length() != 0) {
            TextView valueTotal = findViewById(R.id.Totvalue);
            totalString += val;
            valueTotal.setText(totalString);
        } else if (focus.equals("total") && totalString.length() == 0) {
            TextView valueTotal = findViewById(R.id.Totvalue);
            totalString = val + "";
            valueTotal.setText(totalString);
        } else if (focus.equals("expValue") && expValueString.length() != 0) {
            TextView valueExpValue = findViewById(R.id.expValue);
            expValueString += val;
            valueExpValue.setText(expValueString);
        } else if (focus.equals("expValue") && expValueString.length() == 0) {
            TextView valueExpValue = findViewById(R.id.expValue);
            expValueString = val + "";
            valueExpValue.setText(expValueString);
        } else if (focus.equals("expSuper") && expString.length() != 0) {
            TextView valueExp = findViewById(R.id.expSuper);
            expString += val;
            valueExp.setText(expString);
        } else if (focus.equals("expSuper") && expString.length() == 0) {
            TextView valueExp = findViewById(R.id.expSuper);
            expString = val + "";
            valueExp.setText(expString);
        } else if (focus.equals("custom")) {
            if (customValid == 1 && (val.equals("+") || val.equals("-") || val.equals("*"))) {
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
            if(val.equals("(") && data.paren == 0){
                TextView valueCustom = findViewById(R.id.Custom);
                customString += val;
                data.paren = 1;
                valueCustom.setText(customString);
            }
            if(val.equals(")") && data.paren == 1){
                TextView valueCustom = findViewById(R.id.Custom);
                customString += val;
                data.paren = 0;
                valueCustom.setText(customString);
            }
        } else if (focus.equals("custom") && customString.length() == 0) {
            TextView valueCustom = findViewById(R.id.custom);
            customString = val + "";
            valueCustom.setText(customString);
        } else if (focus.equals("radius") && radius.length() != 0) {
            TextView valueRadius = findViewById(R.id.Radius);
            radius += val;
            valueRadius.setText(radius);
        } else if (focus.equals("radius") && radius.length() == 0) {
            TextView valueRadius = findViewById(R.id.Radius);
            radius = val + "";
            valueRadius.setText(radius);
        } else if (focus.equals("degree") && data.degree.length() != 0) {
            TextView valueDegree = findViewById(R.id.Degree);
            data.degree += val;
            valueDegree.setText(data.degree);
        } else if (focus.equals("degree") && data.degree.length() == 0) {
            TextView valueDegree = findViewById(R.id.Degree);
            data.degree = val + "";
            valueDegree.setText(data.degree);
        } else if (focus.equals("si") && data.speedI.length() != 0) {
            TextView valueSpeedI = findViewById(R.id.intSpeed);
            data.speedI += val;
            valueSpeedI.setText(data.speedI);
        } else if (focus.equals("si") && data.speedI.length() == 0) {
            TextView valueSpeedI = findViewById(R.id.intSpeed);
            data.speedI = val + "";
            valueSpeedI.setText(data.speedI);
        } else if (focus.equals("sf") && data.speedF.length() != 0) {
            TextView valueSpeedF = findViewById(R.id.finalSpeed);
            data.speedF += val;
            valueSpeedF.setText(data.speedF);
        } else if (focus.equals("sf") && data.speedF.length() == 0) {
            TextView valueSpeedF = findViewById(R.id.finalSpeed);
            data.speedF = val + "";
            valueSpeedF.setText(data.speedF);
        } else if (focus.equals("t") && data.time.length() != 0) {
            TextView valueTime = findViewById(R.id.time);
            data.time += val;
            valueTime.setText(data.speedF);
        } else if (focus.equals("t") && data.time.length() == 0) {
            TextView valueTime = findViewById(R.id.time);
            data.time = val + "";
            valueTime.setText(data.time);
        } else if (focus.equals("a") && data.aString.length() != 0) {
            TextView aValueTime = findViewById(R.id.Avalue);
            data.aString += val;
            aValueTime.setText(data.aString);
        } else if (focus.equals("a") && data.aString.length() == 0) {
            TextView aValueTime = findViewById(R.id.Avalue);
            data.aString = val + "";
            aValueTime.setText(data.aString);
        } else if (focus.equals("b") && data.bString.length() != 0) {
            TextView bValueTime = findViewById(R.id.Bvalue);
            data.bString += val;
            bValueTime.setText(data.bString);
        } else if (focus.equals("b") && data.bString.length() == 0) {
            TextView bValueTime = findViewById(R.id.Bvalue);
            data.bString = val + "";
            bValueTime.setText(data.bString);
        } else if (focus.equals("c") && data.cString.length() != 0) {
            TextView cValueTime = findViewById(R.id.Cvalue);
            data.cString += val;
            cValueTime.setText(data.cString);
        } else if (focus.equals("c") && data.cString.length() == 0) {
            TextView cValueTime = findViewById(R.id.Cvalue);
            data.cString = val + "";
            cValueTime.setText(data.cString);
        } else if (focus.equals("angle1") && data.angle1.length() != 0) {
            TextView angle1ValueTime = findViewById(R.id.angle1);
            data.angle1 += val;
            angle1ValueTime.setText(data.angle1);
        } else if (focus.equals("angle1") && data.angle1.length() == 0) {
            TextView cValueTime = findViewById(R.id.angle1);
            data.angle1 = val + "";
            cValueTime.setText(data.angle1);
        } else if (focus.equals("angle2") && data.angle2.length() != 0) {
            TextView angle2ValueTime = findViewById(R.id.angle2);
            data.angle2 += val;
            angle2ValueTime.setText(data.angle2);
        } else if (focus.equals("angle2") && data.angle2.length() == 0) {
            TextView angle2ValueTime = findViewById(R.id.angle2);
            data.angle2 = val + "";
            angle2ValueTime.setText(data.angle2);
        } else if (focus.equals("time2") && data.time.length() != 0) {
            TextView time2ValueTime = findViewById(R.id.time2);
            data.time += val;
            time2ValueTime.setText(data.time);
        } else if (focus.equals("time2") && data.time.length() == 0) {
            TextView time2ValueTime = findViewById(R.id.time2);
            data.time = val + "";
            time2ValueTime.setText(data.time);
        }else {
            TextView textMessageX = findViewById(R.id.message);
            textMessageX.setText("ERROR!!!");
        }
    }

    public void specialFunc(String func) {
        TextView xText = findViewById(R.id.Xvalue);
        TextView yText = findViewById(R.id.Yvalue);
        TextView zText = findViewById(R.id.Zvalue);
        TextView hText = findViewById(R.id.Hvalue);
        TextView wText = findViewById(R.id.Wvalue);
        TextView dText = findViewById(R.id.Dvalue);
        TextView aText = findViewById(R.id.Avalue);
        TextView bText = findViewById(R.id.Bvalue);
        TextView cText = findViewById(R.id.Cvalue);
        TextView eText = findViewById(R.id.expSuper);
        TextView evText = findViewById(R.id.expValue);
        TextView t1Text = findViewById(R.id.Totvalue);
        TextView customText = findViewById(R.id.Custom);
        TextView radiusText = findViewById(R.id.Radius);
        TextView degreeText = findViewById(R.id.Degree);
        TextView speedIText = findViewById(R.id.intSpeed);
        TextView speedFText = findViewById(R.id.finalSpeed);
        TextView timeText = findViewById(R.id.time);
        if (func.equals("del")) {
            if (focus.equals("X") && data.xString.length() > 0) {
                String xLastChar = data.xString.charAt(data.xString.length() - 1) + "";
                if (xLastChar.equals(".")) {
                    isDecimal[0] = 0;
                    data.xString = data.xString.substring(0, (data.xString.length()) - 1);
                    xText.setText(data.xString);
                } else if (focus.equals("X") && (data.xString.length() > 0)) {
                    data.xString = data.xString.substring(0, (data.xString.length()) - 1);
                    xText.setText(data.xString);
                }
            }
            if (data.xString.length() == 0) {
                xText.setText("x");
            }

            if (focus.equals("Y") && data.yString.length() > 0) {
                String yLastChar = data.yString.charAt(data.yString.length() - 1) + "";
                if (yLastChar.equals(".")) {
                    isDecimal[1] = 0;
                    data.yString = data.yString.substring(0, (data.yString.length()) - 1);
                    yText.setText(data.yString);
                } else if (focus.equals("Y") && (data.yString.length() > 0)) {
                    data.yString = data.yString.substring(0, (data.yString.length()) - 1);
                    yText.setText(data.yString);
                }
            }
            if (data.yString.length() == 0) {
                yText.setText("y");
            }

            if (focus.equals("Z") && data.zString.length() > 0) {
                String zLastChar = data.zString.charAt(data.zString.length() - 1) + "";
                if (zLastChar.equals(".")) {
                    isDecimal[2] = 0;
                    data.zString = data.zString.substring(0, (data.zString.length()) - 1);
                    zText.setText(data.zString);
                } else if (focus.equals("Z") && (data.zString.length() > 0)) {
                    data.zString = data.zString.substring(0, (data.zString.length()) - 1);
                    zText.setText(data.zString);
                }
            }
            if (data.zString.length() == 0) {
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
            if (hString.length() == 0) {
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
            if (wString.length() == 0) {
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
            if (dString.length() == 0) {
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
            if (totalString.length() == 0) {
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
            if (expValueString.length() == 0) {
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
            if (expString.length() == 0) {
                eText.setText("exp");
            }

            if(focus.equals("custom") && customString.length()>0){
                customString = customString.substring(0,(customString.length())-1);
                customText.setText(customString);
                String customLastChar = customString.charAt(customString.length() - 1) + "";
                if(customLastChar.equals("+") || customLastChar.equals("-") || customLastChar.equals("8")){
                    customString = customString.substring(0,(customString.length())-1);
                }
                customText.setText(customString);
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
            }

            if (focus.equals("degree") && data.degree.length() > 0) {
                data.degree = data.degree.substring(0, (data.degree.length()) - 1);
                degreeText.setText(data.degree);
            }
            if(data.degree.length() == 0){
                degreeText.setText("degree");
            }
            if (focus.equals("si") && data.speedI.length() > 0) {
                data.speedI = data.speedI.substring(0, (data.speedI.length()) - 1);
                speedIText.setText(data.speedI);
            }
            if(data.speedI.length() == 0){
                speedIText.setText("si");
            }
            if (focus.equals("sf") && data.speedF.length() > 0) {
                data.speedF = data.speedF.substring(0, (data.speedF.length()) - 1);
                speedFText.setText(data.speedF);
            }
            if(data.speedF.length() == 0){
                speedFText.setText("sf");
            }
            if (focus.equals("t") && data.time.length() > 0) {
                data.time = data.time.substring(0, (data.time.length()) - 1);
                timeText.setText(data.time);
            }
            if(data.time.length() == 0){
                timeText.setText("t");
            }
            if (focus.equals("a") && data.aString.length() > 0) {
                data.aString = data.aString.substring(0, (data.aString.length()) - 1);
                aText.setText(data.aString);
            }
            if(data.aString.length() == 0){
                aText.setText("a");
            }
            if (focus.equals("b") && data.bString.length() > 0) {
                data.bString = data.bString.substring(0, (data.bString.length()) - 1);
                bText.setText(data.bString);
            }
            if(data.bString.length() == 0){
                bText.setText("b");
            }
            if (focus.equals("c") && data.cString.length() > 0) {
                data.cString = data.cString.substring(0, (data.cString.length()) - 1);
                cText.setText(data.cString);
            }
            if(data.cString.length() == 0){
                cText.setText("c");
            }
        }
    }

    public void displayBasic(View v) {
        displaySubs(1);
    }
    public void displayAlgebra(View v) {
        displaySubs(2);
    }
    public void displayCalculus(View v) {
        displaySubs(3);
    }
    public void displayPhysics(View v) {
        displaySubs(4);
    }
    public void displayGeometry(View v) {
        displaySubs(5);
    }
    public void displayTrig(View v){
        displaySubs(6);
    }
    public void displayCustom(View v) {
        focus = "custom";
        subCategory = "custom";
        setFormulaText(subCategory);
    }
    public void displaySubAngularMotion(View v){
        subCategory = "Angular Motion";
        displaySubs2(1);
    }

    public void setAddition(View v) {
        subCategory = "add";
        setFormulaText(subCategory);
    }
    public void setSubtraction(View v) {
        subCategory = "subtract";
        setFormulaText(subCategory);
    }
    public void setDivision(View v) {
        subCategory = "divide";
        setFormulaText(subCategory);
    }
    public void setMultiplication(View v) {
        subCategory = "multiply";
        setFormulaText(subCategory);
    }
    public void Square(View v) {
        subCategory = "square";
        setFormulaText(subCategory);
    }
    public void Cube(View v) {
        subCategory = "cube";
        setFormulaText(subCategory);
    }
    public void setExponent(View v) {
        subCategory = "Exponent";
        setFormulaText(subCategory);
    }
    public void AreaTriangle(View v) {
        subCategory = "AreaTriangle";
        setFormulaText(subCategory);
    }
    public void AreaCircle(View v) {
        subCategory = "AreaCircle";
        setFormulaText(subCategory);
    }
    public void setSin(View v){
        subCategory ="sin";
        setFormulaText(subCategory);
    }
    public void setCos(View v){
        subCategory ="cos";
        setFormulaText(subCategory);
    }
    public void setTan(View v){
        subCategory ="tan";
        setFormulaText(subCategory);
    }
    public void LinearVelocity(View v){
        subCategory = "LinearVelocity";
        setFormulaText(subCategory);
    }
    public void setPythagoren(View v){
        subCategory = "Pythagoren";
        setFormulaText(subCategory);
    }
    public void AngularAcc(View v){
        data.subCategory2 = "Angular Acceleration";
        setFormulaText(data.subCategory2);
    }

    public void displaySubs(int num) {
        displaySubs2(0);
        LinearLayout layout1 = findViewById(R.id.basicSub);
        LinearLayout layout2 = findViewById(R.id.algebraSub);
        LinearLayout layout3 = findViewById(R.id.calculusSub);
        LinearLayout layout4 = findViewById(R.id.physicsSub);
        LinearLayout layout5 = findViewById(R.id.geometrySub);
        LinearLayout layout6 = findViewById(R.id.trigSub);
        layout1.setVisibility(View.GONE);
        layout2.setVisibility(View.GONE);
        layout3.setVisibility(View.GONE);
        layout4.setVisibility(View.GONE);
        layout5.setVisibility(View.GONE);
        layout6.setVisibility(View.GONE);
        switch (num) {
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
            case 6:
                layout6.setVisibility(View.VISIBLE);
                break;
        }
    }
    public void displaySubs2(int num) {
        LinearLayout subLayout = findViewById(R.id.angularMotionSub);
        subLayout.setVisibility(View.GONE);
        switch (num) {
            case 0:
                subLayout.setVisibility(View.GONE);
                break;
            case 1:
                subLayout.setVisibility(View.VISIBLE);
                TextView message = findViewById(R.id.message);
                message.setText("Angular Motion selected");
                break;
        }
    }

    public void practiceSection(View v) {
        Intent intent = new Intent(this, PracticeSection.class);
        startActivity(intent);
    }

    public void clickToSolve(View v) {
        if (subCategory.equals("add") || subCategory.equals("subtract") || subCategory.equals("divide") || subCategory.equals("multiply")) {
            if (data.xString.length() > 0 && data.yString.length() > 0 && data.zString.length() == 0) {
                String result = formula.Basic(data.xString, data.yString, data.zString, subCategory);
                TextView valueZ = findViewById(R.id.Zvalue);
                valueZ.setText(result);
            }
            if (data.xString.length() > 0 && data.yString.length() == 0 && data.zString.length() > 0) {
                String result = formula.Basic(data.xString, data.yString, data.zString, subCategory);
                TextView valueY = findViewById(R.id.Yvalue);
                valueY.setText(result);
            }
            if (data.xString.length() == 0 && data.yString.length() > 0 && data.zString.length() > 0) {
                String result = formula.Basic(data.xString, data.yString, data.zString, subCategory);
                TextView valueX = findViewById(R.id.Xvalue);
                valueX.setText(result);
            }
        }
        if (subCategory.equals("square")) {
            if (hString.length() > 0 && wString.length() > 0 && totalString.length() == 0) {
                String result = formula.Multiply(hString, wString, totalString, isDecimal[3], isDecimal[4], isDecimal[6]);
                TextView TotalText = findViewById(R.id.Totvalue);
                TotalText.setText(result);
            } else if (hString.length() > 0 && wString.length() == 0 && totalString.length() > 0) {
                String result = formula.Multiply(hString, wString, totalString, isDecimal[3], isDecimal[4], isDecimal[6]);
                TextView wText = findViewById(R.id.Wvalue);
                wText.setText(result);
            } else if (hString.length() == 0 && wString.length() > 0 && totalString.length() > 0) {
                String result = formula.Multiply(hString, wString, totalString, isDecimal[3], isDecimal[4], isDecimal[6]);
                TextView hText = findViewById(R.id.Hvalue);
                hText.setText(result);
            }
        }
        if(subCategory.equals("cube")) {
            if (hString.length() > 0 && wString.length() > 0 && dString.length() > 0 && totalString.length() == 0) {
                String result = formula.Cube(hString, wString, dString, totalString, isDecimal[3], isDecimal[4], isDecimal[5], isDecimal[6]);
                TextView TotalText = findViewById(R.id.Totvalue);
                TotalText.setText(result);
            } else if (hString.length() > 0 && wString.length() > 0 && dString.length() == 0 && totalString.length() > 0) {
                String result = formula.Cube(hString, wString, dString, totalString, isDecimal[3], isDecimal[4], isDecimal[5], isDecimal[6]);
                TextView dText = findViewById(R.id.Dvalue);
                dText.setText(result);
            } else if (hString.length() > 0 && wString.length() == 0 && dString.length() > 0 && totalString.length() > 0) {
                String result = formula.Cube(hString, wString, dString, totalString, isDecimal[3], isDecimal[4], isDecimal[5], isDecimal[6]);
                TextView wText = findViewById(R.id.Wvalue);
                wText.setText(result);
            } else if (hString.length() == 0 && wString.length() > 0 && dString.length() > 0 && totalString.length() > 0) {
                String result = formula.Cube(hString, wString, dString, totalString, isDecimal[3], isDecimal[4], isDecimal[5], isDecimal[6]);
                TextView hText = findViewById(R.id.Hvalue);
                hText.setText(result);
            }
        }
        if(subCategory.equals("Exponent")) {
            String result = formula.Exponent(expValueString, expString);
            TextView totalText = findViewById(R.id.ExpTotvalue2);
            totalText.setText(result);
            totalString = "";
        }
        if(subCategory.equals("custom")) {
            String result = custom.customSolve2(customString);
            TextView totalCustom = findViewById(R.id.CusTotvalue2);
            totalCustom.setText(result);
        }
        if(subCategory.equals("AreaTriangle")){
            String result = formula.AreaTriangle(hString, wString);
            TextView triAreaTotal = findViewById(R.id.Totvalue);
            triAreaTotal.setText(result);
        }
        if(subCategory.equals("AreaCircle")){
            String result = formula.AreaCircle(radius);
            TextView circleAreaTotal = findViewById(R.id.CircleTotvalue);
            circleAreaTotal.setText(result);
        }
        if(subCategory.equals("sin") || subCategory.equals("cos") || subCategory.equals("tan")){
            String result = formula.SCTSolve(data.degree, subCategory);
            TextView randiansTotal = findViewById(R.id.radians);
            randiansTotal.setText(result);
        }
        if(subCategory.equals("LinearVelocity")){
            String result = formula.LinearVelocity(data.speedI, data.speedF, data.time);
            TextView linVelocityTotal = findViewById(R.id.linearVelocity);
            linVelocityTotal.setText(result);
        }
        if(subCategory.equals("Pythagoren")){
            String result = formula.Pythagoren(data.aString, data.bString, data.cString);
            String sqrtResult = (Math.sqrt(Double.valueOf(result)))+"";
            if (data.aString.length() > 0 && data.bString.length() > 0 && data.cString.length() == 0) {
                TextView cValueText = findViewById(R.id.Cvalue);
                cValueText.setText(sqrtResult);
                TextView specMessage = findViewById(R.id.message);
                specMessage.setText("The sqr of c is "+result);
            } else if (data.aString.length() > 0 && data.bString.length() == 0 && data.cString.length() > 0) {
                TextView bValueText = findViewById(R.id.Bvalue);
                bValueText.setText(sqrtResult);
                TextView specMessage = findViewById(R.id.message);
                specMessage.setText("The sqr of b is "+result);
            } else if (data.aString.length() == 0 && data.bString.length() > 0 && data.cString.length() > 0) {
                TextView aValueText = findViewById(R.id.Avalue);
                aValueText.setText(sqrtResult);
                TextView specMessage = findViewById(R.id.message);
                specMessage.setText("The sqr of a is "+result);
            }
        }
        if(data.subCategory2.equals("Angular Acceleration")){
            String result = formula.AngularAcceleration(data.angle1, data.angle2, data.time, data.acceleration);
            TextView angAccTotal = findViewById(R.id.AngMotionAcc);
            angAccTotal.setText(result);
        }
    }

    public void resetUI(){
        data.xString = "";
        data.yString = "";
        data.zString = "";
        hString = "";
        wString = "";
        dString = "";
        radius = "";
        data.degree = "";
        expValueString = "";
        expString ="";
        totalString = "";
        total=0;
        data.speedF = "";
        data.speedI = "";
        data.time = "";
        data.velocity = "";
        data.aString = "";
        data.bString = "";
        data.cString = "";
        data.angle1 = "";
        data.angle2 = "";
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
        TextView degreeTextString = findViewById(R.id.Degree);
        degreeTextString.setText("degree");
        TextView speedITextString = findViewById(R.id.intSpeed);
        speedITextString.setText("si");
        TextView speedFTextString = findViewById(R.id.finalSpeed);
        speedFTextString.setText("sf");
        TextView timeTextString = findViewById(R.id.time);
        timeTextString.setText("t");
        TextView aTextString = findViewById(R.id.Avalue);
        aTextString.setText("a");
        TextView bTextString = findViewById(R.id.Bvalue);
        bTextString.setText("b");
        TextView cTextString = findViewById(R.id.Cvalue);
        cTextString.setText("c");
        TextView angle1TextString = findViewById(R.id.angle1);
        angle1TextString.setText("\u03B8");
        TextView angle2TextString = findViewById(R.id.angle2);
        angle2TextString.setText("\u03B8");
        TextView time2TextString = findViewById(R.id.time2);
        time2TextString.setText("t");
    }

    public void setFormulaText(String sub){
        resetUI();
        LinearLayout mainBasic = findViewById(R.id.Basic);
        LinearLayout main23DArea = findViewById(R.id.SquareCube);
        LinearLayout mainExponent = findViewById(R.id.ExponentFormula);
        LinearLayout mainCustom = findViewById(R.id.CustomFormula);
        LinearLayout mainCircle = findViewById(R.id.CircleFormula);
        LinearLayout mainSCT = findViewById(R.id.sincostan);
        LinearLayout mainLinVelocity = findViewById(R.id.LinearVelocity);
        LinearLayout mainPythagoren = findViewById(R.id.Pythagoren);
        LinearLayout mainAngAcceleration = findViewById(R.id.AngularAcceleration);
        LinearLayout subMotion = findViewById(R.id.angularMotionSub);
        subMotion.setVisibility(View.GONE);
        mainBasic.setVisibility(View.GONE);
        main23DArea.setVisibility(View.GONE);
        mainExponent.setVisibility(View.GONE);
        mainCustom.setVisibility(View.GONE);
        mainCircle.setVisibility(View.GONE);
        mainSCT.setVisibility(View.GONE);
        mainLinVelocity.setVisibility(View.GONE);
        mainPythagoren.setVisibility(View.GONE);
        mainAngAcceleration.setVisibility(View.GONE);
        TextView sign1Text = findViewById(R.id.sign1);
        TextView textMessageSub = findViewById(R.id.message);
        textMessageSub.setText(subCategory);
        if(subCategory.equals("add")){
            mainBasic.setVisibility(View.VISIBLE);
            sign1Text.setText("+");
            textMessageSub.setText("Addition selected");
        }else if(subCategory.equals("subtract")){
            mainBasic.setVisibility(View.VISIBLE);;
            sign1Text.setText("-");
            textMessageSub.setText("Subtraction selected");
        }else if(subCategory.equals("divide")){
            mainBasic.setVisibility(View.VISIBLE);
            sign1Text.setText("/");
            textMessageSub.setText("Division Selected");
        }else if(subCategory.equals("multiply")){
            mainBasic.setVisibility(View.VISIBLE);
            sign1Text.setText("+");
            textMessageSub.setText("Multiplication Selected");
        }else if(subCategory.equals("square") || subCategory.equals("AreaTriangle")){
            mainBasic.setVisibility(View.INVISIBLE);
            main23DArea.setVisibility(View.VISIBLE);
            mainExponent.setVisibility(View.INVISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.INVISIBLE);
            mainSCT.setVisibility(View.INVISIBLE);
            mainLinVelocity.setVisibility(View.INVISIBLE);
            mainPythagoren.setVisibility(View.INVISIBLE);
            mainAngAcceleration.setVisibility(View.INVISIBLE);
            if(subCategory.equals("square")){
                textMessageSub.setText("2D Area Selected");
            } else {
                textMessageSub.setText("Area of Triangle Selected");
            }
            TextView sign2Text = findViewById(R.id.sign2);
            sign2Text.setVisibility(View.GONE);
            TextView dTextString = findViewById(R.id.Dvalue);
            dTextString.setVisibility(View.GONE);
        }else if(subCategory.equals("cube")){
            mainBasic.setVisibility(View.INVISIBLE);
            main23DArea.setVisibility(View.VISIBLE);
            mainExponent.setVisibility(View.INVISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.INVISIBLE);
            mainSCT.setVisibility(View.INVISIBLE);
            mainLinVelocity.setVisibility(View.INVISIBLE);
            mainPythagoren.setVisibility(View.INVISIBLE);
            mainAngAcceleration.setVisibility(View.INVISIBLE);
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
            mainSCT.setVisibility(View.INVISIBLE);
            mainLinVelocity.setVisibility(View.INVISIBLE);
            mainPythagoren.setVisibility(View.INVISIBLE);
            mainAngAcceleration.setVisibility(View.INVISIBLE);
            textMessageSub.setText("Exponent selected");
        } else if(subCategory.equals("AreaCircle")) {
            mainBasic.setVisibility(View.INVISIBLE);
            main23DArea.setVisibility(View.INVISIBLE);
            mainExponent.setVisibility(View.INVISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.VISIBLE);
            mainSCT.setVisibility(View.INVISIBLE);
            mainLinVelocity.setVisibility(View.INVISIBLE);
            mainPythagoren.setVisibility(View.INVISIBLE);
            mainAngAcceleration.setVisibility(View.INVISIBLE);
            textMessageSub.setText("Circle Area Selected");
        } else if(subCategory.equals("custom")){
            mainBasic.setVisibility(View.INVISIBLE);
            main23DArea.setVisibility(View.INVISIBLE);
            mainExponent.setVisibility(View.INVISIBLE);
            mainCustom.setVisibility(View.VISIBLE);
            mainCircle.setVisibility(View.INVISIBLE);
            mainSCT.setVisibility(View.INVISIBLE);
            mainLinVelocity.setVisibility(View.INVISIBLE);
            mainPythagoren.setVisibility(View.INVISIBLE);
            mainAngAcceleration.setVisibility(View.INVISIBLE);
            textMessageSub.setText("Custom Selected");
        } else if(subCategory.equals("sin") || subCategory.equals("cos") || subCategory.equals("tan")){
            TextView sctText = findViewById(R.id.SCT);
            mainBasic.setVisibility(View.INVISIBLE);
            main23DArea.setVisibility(View.INVISIBLE);
            mainExponent.setVisibility(View.INVISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.INVISIBLE);
            mainSCT.setVisibility(View.VISIBLE);
            mainLinVelocity.setVisibility(View.INVISIBLE);
            mainPythagoren.setVisibility(View.INVISIBLE);
            mainAngAcceleration.setVisibility(View.INVISIBLE);
            if(subCategory.equals("sin")){
                sctText.setText("sin");
            }else if(subCategory.equals("cos")){
                sctText.setText("cos");
            }else{
                sctText.setText("tan");
            }
        } else if(subCategory.equals("LinearVelocity")){
            mainBasic.setVisibility(View.INVISIBLE);
            main23DArea.setVisibility(View.INVISIBLE);
            mainExponent.setVisibility(View.INVISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.INVISIBLE);
            mainSCT.setVisibility(View.INVISIBLE);
            mainLinVelocity.setVisibility(View.VISIBLE);
            mainPythagoren.setVisibility(View.INVISIBLE);
            mainAngAcceleration.setVisibility(View.INVISIBLE);
            textMessageSub.setText("Linear Velocity Selected");
        } else if(subCategory.equals("Pythagoren")){
            mainBasic.setVisibility(View.INVISIBLE);
            main23DArea.setVisibility(View.INVISIBLE);
            mainExponent.setVisibility(View.INVISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.INVISIBLE);
            mainSCT.setVisibility(View.INVISIBLE);
            mainLinVelocity.setVisibility(View.INVISIBLE);
            mainPythagoren.setVisibility(View.VISIBLE);
            mainAngAcceleration.setVisibility(View.INVISIBLE);
            textMessageSub.setText("Pythagoren Selected");
        } else if(subCategory.equals("Angular Motion")){
            mainBasic.setVisibility(View.INVISIBLE);
            main23DArea.setVisibility(View.INVISIBLE);
            mainExponent.setVisibility(View.INVISIBLE);
            mainCustom.setVisibility(View.INVISIBLE);
            mainCircle.setVisibility(View.INVISIBLE);
            mainSCT.setVisibility(View.INVISIBLE);
            mainLinVelocity.setVisibility(View.INVISIBLE);
            mainPythagoren.setVisibility(View.INVISIBLE);
            if(data.subCategory2.equals("Angular Acceleration")){
                mainAngAcceleration.setVisibility(View.VISIBLE);
            }
            textMessageSub.setText("Angular Acceleration Selected");
        } else {
            textMessageSub.setText("Check your formula");
        }
    }
}//1138