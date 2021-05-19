package com.example.sciemu;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.w3c.dom.Text;

public class Emulator extends AppCompatActivity {
    DataConfig data = new DataConfig();
    Formula formula = new Formula();
    SolveCustom custom = new SolveCustom();

    TextView textMessage, xText, yText, zText, hText, wText, dText, radius, total, aText, bText, cText;

    // Location is = x,y,z,h,w,d,total, exp value, exponent, custom, radius, speedI,speedF,time
    int[] isDecimal = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emulator);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        textMessage = findViewById(R.id.message);
        xText = findViewById(R.id.X);
        yText = findViewById(R.id.Y);
        zText = findViewById(R.id.Z);
        hText = findViewById(R.id.H);
        wText = findViewById(R.id.W);
        dText = findViewById(R.id.D);
        aText = findViewById(R.id.A);
        bText = findViewById(R.id.B);
        cText = findViewById(R.id.C);
        radius = findViewById(R.id.Radius);
        total = findViewById(R.id.Total);
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
    public void decimal(View v) {
        if (data.focus.equals("X") && isDecimal[0] != 1) {
            setValues(".");
            isDecimal[0] = 1;
        }
        if (data.focus.equals("Y") && isDecimal[1] != 1) {
            setValues(".");
            isDecimal[1] = 1;
        }
        if (data.focus.equals("Z") && isDecimal[2] != 1) {
            setValues(".");
            isDecimal[2] = 1;
        }
        if (data.focus.equals("H") && isDecimal[3] != 1) {
            setValues(".");
            isDecimal[3] = 1;
        }
        if (data.focus.equals("W") && isDecimal[4] != 1) {
            setValues(".");
            isDecimal[4] = 1;
        }
        if (data.focus.equals("D") && isDecimal[5] != 1) {
            setValues(".");
            isDecimal[5] = 1;
        }
        if (data.focus.equals("total") && isDecimal[6] != 1) {
            setValues(".");
            isDecimal[6] = 1;
        }
        if (data.focus.equals("expValue") && isDecimal[7] != 1) {
            setValues(".");
            isDecimal[7] = 1;
        }
        /*if (focus.equals("custom") && isDecimal[9] != 1) {
            setValues(".");
            isDecimal[9] = 1;
        }*/
        if (data.focus.equals("Radius") && isDecimal[10] != 1) {
            setValues(".");
            isDecimal[10] = 1;
        }
    }

    public void setFocus(View v){
        String focusOn = getResources().getResourceEntryName(v.getId());
        data.focus = focusOn;
        textMessage.setText("Focus on "+focusOn+ " value");
    }
    public void focusEXP(View v) {
        TextView textMessage = findViewById(R.id.message);
        data.focus = "expValue";
        textMessage.setText("Focus on Exponent Value");
    }
    public void focusDegree(View v){
        TextView textMessage = findViewById(R.id.message);
        data.focus = "degree";
        textMessage.setText("Focus is on Degrees");
    }
    public void focusEXPSUP(View v) {
        data.focus = "expSuper";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Exponent");
    }
    public void focusSpeedI(View v) {
        data.focus = "si";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Speed Int");
    }
    public void focusSpeedF(View v) {
        data.focus = "sf";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Speed Final");
    }
    public void focusTime(View v) {
        data.focus = "t";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on Time");
    }
    public void focusAngle1(View v) {
        data.focus = "angle1";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on angle1");
    }
    public void focusAngle2(View v) {
        data.focus = "angle2";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on angle2");
    }
    public void focusTime2(View v) {
        data.focus = "time2";
        TextView textMessageW = findViewById(R.id.message);
        textMessageW.setText("Focus on time");
    }

    public void setValues(String val) {
        if (data.focus.equals("X") && data.xString.length() != 0) {
            data.xString += val + "";
            xText.setText(data.xString);
        } else if (data.focus.equals("X") && data.xString.length() == 0) {
            data.xString = val + "";
            xText.setText(data.xString);
        } else if (data.focus.equals("Y") && data.yString.length() != 0) {
            data.yString += val;
            yText.setText(data.yString);
        } else if (data.focus.equals("Y") && data.yString.length() == 0) {
            data.yString = val + "";
            yText.setText(data.yString);
        } else if (data.focus.equals("Z") && data.zString.length() != 0) {
            data.zString += val;
            zText.setText(data.zString);
        } else if (data.focus.equals("Z") && data.zString.length() == 0) {
            data.zString = val + "";
            zText.setText(data.zString);
        } else if (data.focus.equals("H") && data.hString.length() != 0) {
            TextView valueH = findViewById(R.id.H);
            data.hString += val;
            valueH.setText(data.hString);
        } else if (data.focus.equals("H") && data.hString.length() == 0) {
            TextView valueH = findViewById(R.id.H);
            data.hString = val + "";
            valueH.setText(data.hString);
        } else if (data.focus.equals("W") && data.wString.length() != 0) {
            TextView valueW = findViewById(R.id.W);
            data.wString += val;
            valueW.setText(data.wString);
        } else if (data.focus.equals("W") && data.wString.length() == 0) {
            TextView valueW = findViewById(R.id.W);
            data.wString = val + "";
            valueW.setText(data.wString);
        } else if (data.focus.equals("D") && data.dString.length() != 0) {
            TextView valueD = findViewById(R.id.D);
            data.dString += val;
            valueD.setText(data.dString);
        } else if (data.focus.equals("D") && data.dString.length() == 0) {
            TextView valueD = findViewById(R.id.D);
            data.dString = val + "";
            valueD.setText(data.dString);
        } else if (data.focus.equals("total") && data.totalString.length() != 0) {
            TextView valueTotal = findViewById(R.id.Total);
            data.totalString += val;
            valueTotal.setText(data.totalString);
        } else if (data.focus.equals("total") && data.totalString.length() == 0) {
            TextView valueTotal = findViewById(R.id.Total);
            data.totalString = val + "";
            valueTotal.setText(data.totalString);
        } else if (data.focus.equals("expValue") && data.expValueString.length() != 0) {
            TextView valueExpValue = findViewById(R.id.expValue);
            data.expValueString += val;
            valueExpValue.setText(data.expValueString);
        } else if (data.focus.equals("expValue") && data.expValueString.length() == 0) {
            TextView valueExpValue = findViewById(R.id.expValue);
            data.expValueString = val + "";
            valueExpValue.setText(data.expValueString);
        } else if (data.focus.equals("expSuper") && data.subCategory.equals("Exponent") && data.expString.length() != 0) {
            TextView valueExp = findViewById(R.id.expSuper);
            data.expString += val;
            valueExp.setText(data.expString);
        } else if (data.focus.equals("expSuper") && data.subCategory.equals("Exponent") && data.expString.length() == 0) {
            TextView valueExp = findViewById(R.id.expSuper);
            data.expString = val + "";
            valueExp.setText(data.expString);
        } else if (data.focus.equals("custom")) {
            if (data.customValid == 1 && (val.equals("+") || val.equals("-") || val.equals("*"))) {
                TextView valueCustom = findViewById(R.id.Custom);
                data.customString += val;
                valueCustom.setText(data.customString);
                data.customValid = 0;
            } else {
                TextView valueCustom = findViewById(R.id.Custom);
                data.customString += val;
                valueCustom.setText(data.customString);
                data.customValid = 1;
            }
            if(val.equals("(") && data.paren == 0){
                TextView valueCustom = findViewById(R.id.Custom);
                data.customString += val;
                data.paren = 1;
                valueCustom.setText(data.customString);
            }
            if(val.equals(")") && data.paren == 1){
                TextView valueCustom = findViewById(R.id.Custom);
                data.customString += val;
                data.paren = 0;
                valueCustom.setText(data.customString);
            }
        } else if (data.focus.equals("custom") && data.customString.length() == 0) {
            TextView valueCustom = findViewById(R.id.custom);
            data.customString = val + "";
            valueCustom.setText(data.customString);
        } else if (data.focus.equals("radius") && radius.length() != 0) {
            TextView valueRadius = findViewById(R.id.Radius);
            data.radiusString += val;
            valueRadius.setText(data.radiusString);
        } else if (data.focus.equals("radius") && data.radiusString.length() == 0) {
            TextView valueRadius = findViewById(R.id.Radius);
            data.radiusString = val + "";
            valueRadius.setText(data.radiusString);
        } else if (data.focus.equals("degree") && data.degree.length() != 0) {
            TextView valueDegree = findViewById(R.id.Degree);
            data.degree += val;
            valueDegree.setText(data.degree);
        } else if (data.focus.equals("degree") && data.degree.length() == 0) {
            TextView valueDegree = findViewById(R.id.Degree);
            data.degree = val + "";
            valueDegree.setText(data.degree);
        } else if (data.focus.equals("si") && data.speedI.length() != 0) {
            TextView valueSpeedI = findViewById(R.id.intSpeed);
            data.speedI += val;
            valueSpeedI.setText(data.speedI);
        } else if (data.focus.equals("si") && data.speedI.length() == 0) {
            TextView valueSpeedI = findViewById(R.id.intSpeed);
            data.speedI = val + "";
            valueSpeedI.setText(data.speedI);
        } else if (data.focus.equals("sf") && data.speedF.length() != 0) {
            TextView valueSpeedF = findViewById(R.id.finalSpeed);
            data.speedF += val;
            valueSpeedF.setText(data.speedF);
        } else if (data.focus.equals("sf") && data.speedF.length() == 0) {
            TextView valueSpeedF = findViewById(R.id.finalSpeed);
            data.speedF = val + "";
            valueSpeedF.setText(data.speedF);
        } else if (data.focus.equals("t") && data.time.length() != 0) {
            TextView valueTime = findViewById(R.id.time);
            data.time += val;
            valueTime.setText(data.speedF);
        } else if (data.focus.equals("t") && data.time.length() == 0) {
            TextView valueTime = findViewById(R.id.time);
            data.time = val + "";
            valueTime.setText(data.time);
        } else if (data.focus.equals("a") && data.aString.length() != 0) {
            data.aString += val;
            aText.setText(data.aString);
        } else if (data.focus.equals("a") && data.aString.length() == 0) {
            data.aString = val + "";
            aText.setText(data.aString);
        } else if (data.focus.equals("b") && data.bString.length() != 0) {
            data.bString += val;
            bText.setText(data.bString);
        } else if (data.focus.equals("b") && data.bString.length() == 0) {
            data.bString = val + "";
            bText.setText(data.bString);
        } else if (data.focus.equals("c") && data.cString.length() != 0) {
            data.cString += val;
            cText.setText(data.cString);
        } else if (data.focus.equals("c") && data.cString.length() == 0) {
            data.cString = val + "";
            cText.setText(data.cString);
        } else if (data.focus.equals("angle1") && data.angle1.length() != 0) {
            TextView angle1ValueTime = findViewById(R.id.angle1);
            data.angle1 += val;
            angle1ValueTime.setText(data.angle1);
        } else if (data.focus.equals("angle1") && data.angle1.length() == 0) {
            TextView cValueTime = findViewById(R.id.angle1);
            data.angle1 = val + "";
            cValueTime.setText(data.angle1);
        } else if (data.focus.equals("angle2") && data.angle2.length() != 0) {
            TextView angle2ValueTime = findViewById(R.id.angle2);
            data.angle2 += val;
            angle2ValueTime.setText(data.angle2);
        } else if (data.focus.equals("angle2") && data.angle2.length() == 0) {
            TextView angle2ValueTime = findViewById(R.id.angle2);
            data.angle2 = val + "";
            angle2ValueTime.setText(data.angle2);
        } else if (data.focus.equals("time2") && data.time.length() != 0) {
            TextView time2ValueTime = findViewById(R.id.time2);
            data.time += val;
            time2ValueTime.setText(data.time);
        } else if (data.focus.equals("time2") && data.time.length() == 0) {
            TextView time2ValueTime = findViewById(R.id.time2);
            data.time = val + "";
            time2ValueTime.setText(data.time);
        }else {
            TextView textMessageX = findViewById(R.id.message);
            textMessageX.setText("ERROR!!!");
        }
    }

    public void specialFunc(String func) {
        TextView eText = findViewById(R.id.expSuper);
        TextView evText = findViewById(R.id.expValue);
        TextView customText = findViewById(R.id.Custom);
        TextView radiusText = findViewById(R.id.Radius);
        TextView degreeText = findViewById(R.id.Degree);
        TextView speedIText = findViewById(R.id.intSpeed);
        TextView speedFText = findViewById(R.id.finalSpeed);
        TextView timeText = findViewById(R.id.time);
        if (func.equals("del")) {
            if (data.focus.equals("X") && data.xString.length() > 0) {
                String xLastChar = data.xString.charAt(data.xString.length() - 1) + "";
                if (xLastChar.equals(".")) {
                    isDecimal[0] = 0;
                    data.xString = data.xString.substring(0, (data.xString.length()) - 1);
                    xText.setText(data.xString);
                } else if (data.focus.equals("X") && (data.xString.length() > 0)) {
                    data.xString = data.xString.substring(0, (data.xString.length()) - 1);
                    xText.setText(data.xString);
                }
            }
            if (data.xString.length() == 0) {
                xText.setText("x");
            }

            if (data.focus.equals("Y") && data.yString.length() > 0) {
                String yLastChar = data.yString.charAt(data.yString.length() - 1) + "";
                if (yLastChar.equals(".")) {
                    isDecimal[1] = 0;
                    data.yString = data.yString.substring(0, (data.yString.length()) - 1);
                    yText.setText(data.yString);
                } else if (data.focus.equals("Y") && (data.yString.length() > 0)) {
                    data.yString = data.yString.substring(0, (data.yString.length()) - 1);
                    yText.setText(data.yString);
                }
            }
            if (data.yString.length() == 0) {
                yText.setText("y");
            }

            if (data.focus.equals("Z") && data.zString.length() > 0) {
                String zLastChar = data.zString.charAt(data.zString.length() - 1) + "";
                if (zLastChar.equals(".")) {
                    isDecimal[2] = 0;
                    data.zString = data.zString.substring(0, (data.zString.length()) - 1);
                    zText.setText(data.zString);
                } else if (data.focus.equals("Z") && (data.zString.length() > 0)) {
                    data.zString = data.zString.substring(0, (data.zString.length()) - 1);
                    zText.setText(data.zString);
                }
            }
            if (data.zString.length() == 0) {
                zText.setText("z");
            }

            if (data.focus.equals("H") && data.hString.length() > 0) {
                String hLastChar = data.hString.charAt(data.hString.length() - 1) + "";
                if (hLastChar.equals(".")) {
                    isDecimal[3] = 0;
                    data.hString = data.hString.substring(0, (data.hString.length()) - 1);
                    hText.setText(data.hString);
                } else if (data.focus.equals("H") && (data.hString.length() > 0)) {
                    data.hString = data.hString.substring(0, (data.hString.length()) - 1);
                    hText.setText(data.hString);
                }
            }
            if (data.hString.length() == 0) {
                hText.setText("h");
            }

            if (data.focus.equals("W") && data.wString.length() > 0) {
                String wLastChar = data.wString.charAt(data.wString.length() - 1) + "";
                if (wLastChar.equals(".")) {
                    isDecimal[4] = 0;
                    data.wString = data.wString.substring(0, (data.wString.length()) - 1);
                    wText.setText(data.wString);
                } else if (data.focus.equals("W") && (data.wString.length() > 0)) {
                    data.wString = data.wString.substring(0, (data.wString.length()) - 1);
                    wText.setText(data.wString);
                }
            }
            if (data.wString.length() == 0) {
                wText.setText("w");
            }

            if (data.focus.equals("D") && data.dString.length() > 0) {
                String dLastChar = data.dString.charAt(data.dString.length() - 1) + "";
                if (dLastChar.equals(".")) {
                    isDecimal[5] = 0;
                    data.dString = data.dString.substring(0, (data.dString.length()) - 1);
                    dText.setText(data.dString);
                } else if (data.focus.equals("D") && (data.dString.length() > 0)) {
                    data.dString = data.dString.substring(0, (data.dString.length()) - 1);
                    dText.setText(data.dString);
                }
            }
            if (data.dString.length() == 0) {
                dText.setText("d");
            }

            if (data.focus.equals("total") && data.totalString.length() > 0) {
                String totalLastChar = data.totalString.charAt(data.totalString.length() - 1) + "";
                if (totalLastChar.equals(".")) {
                    isDecimal[6] = 0;
                    data.totalString = data.totalString.substring(0, (data.totalString.length()) - 1);
                    total.setText(data.totalString);
                } else if (data.focus.equals("total") && (data.totalString.length() > 0)) {
                    data.totalString = data.totalString.substring(0, (data.totalString.length()) - 1);
                    total.setText(data.totalString);
                }
            }
            if (data.totalString.length() == 0) {
                total.setText("total");
            }

            if (data.focus.equals("expValue") && data.expValueString.length() > 0) {
                String expValueLastChar = data.expValueString.charAt(data.expValueString.length() - 1) + "";
                if (expValueLastChar.equals(".")) {
                    isDecimal[7] = 0;
                    data.expValueString = data.expValueString.substring(0, (data.expValueString.length()) - 1);
                    evText.setText(data.expValueString);
                } else if (data.focus.equals("expValue") && (data.expValueString.length() > 0)) {
                    data.expValueString = data.expValueString.substring(0, (data.expValueString.length()) - 1);
                    evText.setText(data.expValueString);
                }
            }
            if (data.expValueString.length() == 0) {
                evText.setText("x");
            }

            if (data.focus.equals("expSuper") && data.expString.length() > 0) {
                String expLastChar = data.expString.charAt(data.expString.length() - 1) + "";
                if (expLastChar.equals(".")) {
                    isDecimal[8] = 0;
                    data.expString = data.expString.substring(0, (data.expString.length()) - 1);
                    eText.setText(data.expString);
                } else if (data.focus.equals("expSuper") && (data.expString.length() > 0)) {
                    data.expString = data.expString.substring(0, (data.expString.length()) - 1);
                    eText.setText(data.expString);
                }
            }
            if (data.expString.length() == 0) {
                eText.setText("exp");
            }

            if(data.focus.equals("custom") && data.customString.length()>0){
                data.customString = data.customString.substring(0,(data.customString.length())-1);
                customText.setText(data.customString);
                String customLastChar = data.customString.charAt(data.customString.length() - 1) + "";
                if(customLastChar.equals("+") || customLastChar.equals("-") || customLastChar.equals("8")){
                    data.customString = data.customString.substring(0,(data.customString.length())-1);
                }
                customText.setText(data.customString);
            }

            if (data.focus.equals("radius") && radius.length() > 0) {
                String expLastChar = data.radiusString.charAt(radius.length() - 1) + "";
                if (expLastChar.equals(".")) {
                    data.radiusString = data.radiusString.substring(0, (radius.length()) - 1);
                    radiusText.setText(data.radiusString);
                } else if (data.focus.equals("radius") && (data.radiusString.length() > 0)) {
                    data.radiusString = data.radiusString.substring(0, (data.radiusString.length()) - 1);
                    eText.setText(data.radiusString);
                }
            }
            if(data.radiusString.length() == 0){
                radiusText.setText("radius");
            }

            if (data.focus.equals("degree") && data.degree.length() > 0) {
                data.degree = data.degree.substring(0, (data.degree.length()) - 1);
                degreeText.setText(data.degree);
            }
            if(data.degree.length() == 0){
                degreeText.setText("\u00B0");
            }
            if (data.focus.equals("si") && data.speedI.length() > 0) {
                data.speedI = data.speedI.substring(0, (data.speedI.length()) - 1);
                speedIText.setText(data.speedI);
            }
            if(data.speedI.length() == 0){
                speedIText.setText("si");
            }
            if (data.focus.equals("sf") && data.speedF.length() > 0) {
                data.speedF = data.speedF.substring(0, (data.speedF.length()) - 1);
                speedFText.setText(data.speedF);
            }
            if(data.speedF.length() == 0){
                speedFText.setText("sf");
            }
            if (data.focus.equals("t") && data.time.length() > 0) {
                data.time = data.time.substring(0, (data.time.length()) - 1);
                timeText.setText(data.time);
            }
            if(data.time.length() == 0){
                timeText.setText("t");
            }
            if (data.focus.equals("a") && data.aString.length() > 0) {
                data.aString = data.aString.substring(0, (data.aString.length()) - 1);
                aText.setText(data.aString);
            }
            if(data.aString.length() == 0){
                aText.setText("a");
            }
            if (data.focus.equals("b") && data.bString.length() > 0) {
                data.bString = data.bString.substring(0, (data.bString.length()) - 1);
                bText.setText(data.bString);
            }
            if(data.bString.length() == 0){
                bText.setText("b");
            }
            if (data.focus.equals("c") && data.cString.length() > 0) {
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
        data.focus = "custom";
        data.subCategory = "custom";
        setFormulaText(data.subCategory);
    }
    public void displaySubAngularMotion(View v){
        data.subCategory = "Angular Motion";
        displaySubs2(1);
    }

    public void setFormula(View v){
        //String formulaSelect = getResources().getResourceEntryName(v.getText().toString());
        Button b = (Button)v;
        String formulaSelect = b.getText().toString();
        setFormulaText(formulaSelect);
        textMessage.setText("Formula selected "+formulaSelect);
    }
    public void setAddition(View v) {
        setFormulaText("add");
    }
    public void setSubtraction(View v) {
        setFormulaText("subtract");
    }
    public void setDivision(View v) {
        setFormulaText("divide");
    }
    public void setMultiplication(View v) {
        setFormulaText("multiply");
    }
    public void Square(View v) {
        setFormulaText("square");
    }
    public void Cube(View v) {
        setFormulaText("cube");
    }
    public void setExponent(View v) {
        data.subCategory = "Exponent";
        setFormulaText(data.subCategory);
    }
    public void AreaTriangle(View v) {
        data.subCategory = "AreaTriangle";
        setFormulaText(data.subCategory);
    }
    public void AreaCircle(View v) {
        data.subCategory = "AreaCircle";
        setFormulaText(data.subCategory);
    }
    public void setSin(View v){
        data.subCategory ="sin";
        setFormulaText(data.subCategory);
    }
    public void setCos(View v){
        data.subCategory ="cos";
        setFormulaText(data.subCategory);
    }
    public void setTan(View v){
        data.subCategory ="tan";
        setFormulaText(data.subCategory);
    }
    public void LinearVelocity(View v){
        data.subCategory = "LinearVelocity";
        setFormulaText(data.subCategory);
    }
    public void setPythagoren(View v){
        data.subCategory = "Pythagoren";
        setFormulaText(data.subCategory);
    }
    public void AngularAcc(View v){
        data.subCategory2 = "Angular Acceleration";
        setFormulaText(data.subCategory2);
    }
    public void x2(View v){
        data.subCategory = "x2";
        setFormulaText(data.subCategory);
        data.expString = "2";
    }
    public void x3(View v){
        data.subCategory = "x3";
        setFormulaText(data.subCategory);
        data.expString = "3";
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
        if(data.subCategory.equals("add") || data.subCategory.equals("subtract") || data.subCategory.equals("divide") || data.subCategory.equals("multiply")) {
            String result = formula.Basic(data.xString, data.yString, data.zString, data.subCategory);
            if (data.xString.length() > 0 && data.yString.length() > 0 && data.zString.length() == 0) {
                TextView valueZ = findViewById(R.id.Z);
                valueZ.setText(result);
            }
            if (data.xString.length() > 0 && data.yString.length() == 0 && data.zString.length() > 0) {
                TextView valueY = findViewById(R.id.Y);
                valueY.setText(result);
            }
            if (data.xString.length() == 0 && data.yString.length() > 0 && data.zString.length() > 0) {
                TextView valueX = findViewById(R.id.X);
                valueX.setText(result);
            }
        }
        if(data.subCategory.equals("square") || data.subCategory.equals("cube") || data.subCategory.equals("AreaTriangle")) {
            String result = formula.Area(data.hString, data.wString, data.dString, data.totalString, data.subCategory);
            if (data.hString.length() > 0 && data.wString.length() > 0 && data.totalString.length() == 0) {
                TextView TotalText = findViewById(R.id.Total);
                TotalText.setText(result);
            } else if (data.hString.length() > 0 && data.wString.length() == 0 && data.totalString.length() > 0) {
                TextView wText = findViewById(R.id.W);
                wText.setText(result);
            } else if (data.hString.length() == 0 && data.wString.length() > 0 && data.totalString.length() > 0) {
                TextView hText = findViewById(R.id.H);
                hText.setText(result);
            } else if(data.dString.length() == 0 && data.hString.length() > 0 && data.wString.length() > 0 && data.totalString.length()>0){
                TextView dText = findViewById(R.id.D);
                dText.setText(result);
            }
        }
        if(data.subCategory.equals("x2") || data.subCategory.equals("x3") || data.subCategory.equals("Exponent")){
            String result = formula.Power(data.expValueString, data.expString);
            TextView totalText = findViewById(R.id.ExpTotvalue2);
            totalText.setText(result);
            data.totalString = "";
        }
        if(data.subCategory.equals("custom")) {
            String result = custom.customSolve2(data.customString);
            TextView totalCustom = findViewById(R.id.CusTotvalue2);
            totalCustom.setText(result);
        }
        if(data.subCategory.equals("AreaTriangle")){
            String result = formula.Area(data.hString, data.wString, "0", "0", data.subCategory);
            TextView triAreaTotal = findViewById(R.id.Total);
            triAreaTotal.setText(result);
        }
        if(data.subCategory.equals("AreaCircle")){
            String result = formula.Area(data.radiusString,"0","0","0", data.subCategory);
            TextView circleAreaTotal = findViewById(R.id.CircleTotvalue);
            circleAreaTotal.setText(result);
        }
        if(data.subCategory.equals("sin") || data.subCategory.equals("cos") || data.subCategory.equals("tan")){
            String result = formula.SCTSolve(data.degree, data.subCategory);
            TextView randiansTotal = findViewById(R.id.radians);
            randiansTotal.setText(result);
        }
        if(data.subCategory.equals("LinearVelocity")){
            String result = formula.LinearVelocity(data.speedI, data.speedF, data.time);
            TextView linVelocityTotal = findViewById(R.id.linearVelocity);
            linVelocityTotal.setText(result);
        }
        if(data.subCategory.equals("Pythagoren")){
            String result = formula.Pythagoren(data.aString, data.bString, data.cString);
            String sqrtResult = (Math.sqrt(Double.valueOf(result)))+"";
            if (data.aString.length() > 0 && data.bString.length() > 0 && data.cString.length() == 0) {
                cText.setText(sqrtResult);
                TextView specMessage = findViewById(R.id.message);
                specMessage.setText("The sqr of c is "+result);
            } else if (data.aString.length() > 0 && data.bString.length() == 0 && data.cString.length() > 0) {
                bText.setText(sqrtResult);
                TextView specMessage = findViewById(R.id.message);
                specMessage.setText("The sqr of b is "+result);
            } else if (data.aString.length() == 0 && data.bString.length() > 0 && data.cString.length() > 0) {
                aText.setText(sqrtResult);
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
        displaySubs2(0);
        data.xString = "";
        data.yString = "";
        data.zString = "";
        data.hString = "";
        data.wString = "";
        data.dString = "";
        data.degree = "";
        data.expValueString = "";
        data.expString ="";
        data.totalString = "";
        data.speedF = "";
        data.speedI = "";
        data.time = "";
        data.velocity = "";
        data.aString = "";
        data.bString = "";
        data.cString = "";
        data.angle1 = "";
        data.angle2 = "";
        xText.setText("x");
        yText.setText("y");
        zText.setText("z");
        hText.setText("h");
        wText.setText("w");
        dText.setText("d");
        TextView expValTextString = findViewById(R.id.expValue);
        expValTextString.setText("x");
        TextView expTextString = findViewById(R.id.expSuper);
        expTextString.setText("exp");
        total.setText("Total");
        TextView radiusTextString = findViewById(R.id.Radius);
        radiusTextString.setText("radius");
        TextView degreeTextString = findViewById(R.id.Degree);
        degreeTextString.setText("\u00B0");
        TextView speedITextString = findViewById(R.id.intSpeed);
        speedITextString.setText("si");
        TextView speedFTextString = findViewById(R.id.finalSpeed);
        speedFTextString.setText("sf");
        TextView timeTextString = findViewById(R.id.time);
        timeTextString.setText("t");
        aText.setText("a");
        bText.setText("b");
        cText.setText("c");
        TextView angle1TextString = findViewById(R.id.angle1);
        angle1TextString.setText("\u03B8");
        TextView angle2TextString = findViewById(R.id.angle2);
        angle2TextString.setText("\u03B8");
        TextView time2TextString = findViewById(R.id.time2);
        time2TextString.setText("t");
    }

    public void setFormulaText(String sub){
        data.subCategory = sub;
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
        TextView sign1Text = findViewById(R.id.sign1);
        TextView getDivBy2 = findViewById(R.id.divBy2);
        TextView sctText = findViewById(R.id.SCT);
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
        getDivBy2.setVisibility(View.GONE);
        TextView textMessageSub = findViewById(R.id.message);
        textMessageSub.setText(data.subCategory);
        if(data.subCategory.equals("add")){
            mainBasic.setVisibility(View.VISIBLE);
            sign1Text.setText("+");
            textMessageSub.setText("Addition selected");
        }else if(data.subCategory.equals("subtract")){
            mainBasic.setVisibility(View.VISIBLE);;
            sign1Text.setText("-");
            textMessageSub.setText("Subtraction selected");
        }else if(data.subCategory.equals("divide")){
            mainBasic.setVisibility(View.VISIBLE);
            sign1Text.setText("/");
            textMessageSub.setText("Division Selected");
        }else if(data.subCategory.equals("multiply")){
            mainBasic.setVisibility(View.VISIBLE);
            sign1Text.setText("+");
            textMessageSub.setText("Multiplication Selected");
        }else if(data.subCategory.equals("square") || data.subCategory.equals("AreaTriangle")){
            main23DArea.setVisibility(View.VISIBLE);
            if(data.subCategory.equals("square")){
                textMessageSub.setText("2D Area Selected");
            } else {
                textMessageSub.setText("Area of Triangle Selected");
                getDivBy2.setVisibility(View.VISIBLE);
            }
            TextView sign2Text = findViewById(R.id.sign2);
            sign2Text.setVisibility(View.GONE);
            TextView dTextString = findViewById(R.id.D);
            dTextString.setVisibility(View.GONE);
        }else if(data.subCategory.equals("cube")){
            main23DArea.setVisibility(View.VISIBLE);
            TextView sign2Text = findViewById(R.id.sign2);
            sign2Text.setVisibility(View.VISIBLE);
            dText.setVisibility(View.VISIBLE);
            textMessageSub.setText("3D Area Selected");
        } else if(data.subCategory.equals("Exponent") || data.subCategory.equals("x2") || data.subCategory.equals("x3")){
            mainExponent.setVisibility(View.VISIBLE);
            textMessageSub.setText("Exponent selected");
            if(data.subCategory.equals("x2")){
                TextView power = findViewById(R.id.expSuper);
                power.setText("2");
            }
            if(data.subCategory.equals("x3")){
                TextView power = findViewById(R.id.expSuper);
                power.setText("3");
            }
        } else if(data.subCategory.equals("AreaCircle")) {
            mainCircle.setVisibility(View.VISIBLE);
            textMessageSub.setText("Circle Area Selected");
        } else if(data.subCategory.equals("custom")){
            mainCustom.setVisibility(View.VISIBLE);
            textMessageSub.setText("Custom Selected");
        } else if(data.subCategory.equals("sin") || data.subCategory.equals("cos") || data.subCategory.equals("tan")){
            mainSCT.setVisibility(View.VISIBLE);
            if(data.subCategory.equals("sin")){
                sctText.setText("sin");
            }else if(data.subCategory.equals("cos")){
                sctText.setText("cos");
            }else{
                sctText.setText("tan");
            }
        } else if(data.subCategory.equals("LinearVelocity")){
            mainLinVelocity.setVisibility(View.VISIBLE);
            textMessageSub.setText("Linear Velocity Selected");
        } else if(data.subCategory.equals("Pythagoren")){
            mainPythagoren.setVisibility(View.VISIBLE);
            textMessageSub.setText("Pythagoren Selected");
        } else if(data.subCategory.equals("Angular Motion")){
            if(data.subCategory2.equals("Angular Acceleration")){
                mainAngAcceleration.setVisibility(View.VISIBLE);
            }
            textMessageSub.setText("Angular Acceleration Selected");
        } else {
            textMessageSub.setText("Check your formula");
        }
    }
}//980