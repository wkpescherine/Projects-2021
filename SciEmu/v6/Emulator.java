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

    TextView textMessage, xText, yText, zText, hText, wText, dText, radius, total, aText, bText,
            cText, power, xPower, XFText, XIText, n1Text, n2Text, polySignText, rSphere,
            rCircumference;

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
        XFText = findViewById(R.id.XF);
        XIText = findViewById(R.id.XI);
        radius = findViewById(R.id.R);
        rSphere = findViewById(R.id.RadiusS1);
        rCircumference = findViewById(R.id.RadiusCir);
        power = findViewById(R.id.Power);
        xPower = findViewById(R.id.xPower);
        total = findViewById(R.id.Total);
        n1Text = findViewById(R.id.polyn1);
        n2Text = findViewById(R.id.polyn2);
        polySignText = findViewById(R.id.polySign);
    }

    public void setNumber(View v){
        TextView t = (TextView) v;
        String valueSelect = t.getText().toString();
        setValues(valueSelect);
    }
    public void del(View v) {specialFunc("del");}
    public void plus(View v) {setValues("+");}
    public void minus(View v) {setValues("-");}
    public void multi(View v) {setValues("*");}
    //public void openBracket(View v){ setValues("(");}
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
    public void getArgFocus(View v){
        TextView tv = (TextView) v;
        String argText = tv.getText().toString();
        data.focus = argText;
        textMessage.setText("Focus on "+argText+ " value");
    }
    public void focusDegree(View v){
        data.focus = "degree";
        textMessage.setText("Focus is on Degrees");
    }
    public void focusTime(View v) {
        data.focus = "t";
        textMessage.setText("Focus on Time");
    }
    public void focusAngle1(View v) {
        data.focus = "angle1";
        textMessage.setText("Focus on angle1");
    }
    public void focusAngle2(View v) {
        data.focus = "angle2";
        textMessage.setText("Focus on angle2");
    }
    public void focusTime2(View v) {
        data.focus = "time2";
        textMessage.setText("Focus on time");
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
            data.hString += val;
            hText.setText(data.hString);
        } else if (data.focus.equals("H") && data.hString.length() == 0) {
            data.hString = val + "";
            hText.setText(data.hString);
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
        } else if (data.focus.equals("Total") && data.totalString.length() != 0) {
            TextView valueTotal = findViewById(R.id.Total);
            data.totalString += val;
            valueTotal.setText(data.totalString);
        } else if (data.focus.equals("Total") && data.totalString.length() == 0) {
            TextView valueTotal = findViewById(R.id.Total);
            data.totalString = val + "";
            valueTotal.setText(data.totalString);
        } else if (data.focus.equals("xPower") && data.xPowerString.length() != 0) {
            data.xPowerString += val;
            xPower.setText(data.xPowerString);
        } else if (data.focus.equals("xPower") && data.xPowerString.length() == 0) {
            data.xPowerString = val + "";
            xPower.setText(data.xPowerString);
        } else if (data.focus.equals("Power") && data.powerString.length() != 0) {
            data.powerString += val;
            power.setText(data.powerString);
        } else if (data.focus.equals("Power") && data.powerString.length() == 0) {
            data.powerString = val + "";
            power.setText(data.powerString);
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
        } else if (data.focus.equals("R") && radius.length() != 0) {
            data.radiusString += val;
            radius.setText(data.radiusString);
        } else if (data.focus.equals("R") && data.radiusString.length() == 0) {
            data.radiusString = val + "";
            radius.setText(data.radiusString);
        } else if (data.focus.equals("r") && radius.length() != 0) {
            data.radiusString += val;
            if(data.subCategory.equals("sphere")){
                rSphere.setText(data.radiusString);
            } else if(data.subCategory.equals("circumference")){
                rCircumference.setText(data.radiusString);
            }
        } else if (data.focus.equals("r") && data.radiusString.length() == 0) {
            data.radiusString = val + "";
            if(data.subCategory.equals("sphere")){
                rSphere.setText(data.radiusString);
            } else if(data.subCategory.equals("circumference")){
                rCircumference.setText(data.radiusString);
            }
        } else if (data.focus.equals("degree") && data.degree.length() != 0) {
            TextView valueDegree = findViewById(R.id.Degree);
            data.degree += val;
            valueDegree.setText(data.degree);
        } else if (data.focus.equals("degree") && data.degree.length() == 0) {
            TextView valueDegree = findViewById(R.id.Degree);
            data.degree = val + "";
            valueDegree.setText(data.degree);
        } else if (data.focus.equals("XI") && data.XI.length() != 0) {
            data.XI += val;
            XIText.setText(data.XI);
        } else if (data.focus.equals("XI") && data.XI.length() == 0) {
            data.XI = val + "";
            XIText.setText(data.XI);
        } else if (data.focus.equals("XF") && data.XF.length() != 0) {
            data.XF += val;
            XFText.setText(data.XF);
        } else if (data.focus.equals("XF") && data.XF.length() == 0) {
            data.XF = val + "";
            XFText.setText(data.XF);
        } else if (data.focus.equals("t") && data.time.length() != 0) {
            TextView valueTime = findViewById(R.id.time);
            data.time += val;
            valueTime.setText(data.time);
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
        } else if (data.focus.equals("polyn1") && data.n1String.length() != 0) {
            data.n1String += val;
            n1Text.setText(data.n1String);
        } else if (data.focus.equals("polyn1") && data.n1String.length() == 0) {
            data.n1String = val + "";
            n1Text.setText(data.n1String);
        } else if (data.focus.equals("polyn2") && data.n1String.length() != 0) {
            data.n2String += val;
            n2Text.setText(data.n2String);
        } else if (data.focus.equals("polyn2") && data.n1String.length() == 0) {
            data.n2String = val + "";
            n2Text.setText(data.n2String);
        }else {
            TextView textMessageX = findViewById(R.id.message);
            textMessageX.setText("ERROR!!!");
        }
    }

    public void specialFunc(String func) {
        TextView customText = findViewById(R.id.Custom);
        TextView degreeText = findViewById(R.id.Degree);
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

            if (data.focus.equals("Total") && data.totalString.length() > 0) {
                String totalLastChar = data.totalString.charAt(data.totalString.length() - 1) + "";
                if (totalLastChar.equals(".")) {
                    isDecimal[6] = 0;
                    data.totalString = data.totalString.substring(0, (data.totalString.length()) - 1);
                    total.setText(data.totalString);
                } else if (data.focus.equals("Total") && (data.totalString.length() > 0)) {
                    data.totalString = data.totalString.substring(0, (data.totalString.length()) - 1);
                    total.setText(data.totalString);
                }
            }
            if (data.totalString.length() == 0) {
                total.setText("Total");
            }
            if (data.focus.equals("xPower") && data.xPowerString.length() > 0) {
                String expValueLastChar = data.xPowerString.charAt(data.xPowerString.length() - 1) + "";
                if (expValueLastChar.equals(".")) {
                    isDecimal[7] = 0;
                    data.xPowerString = data.xPowerString.substring(0, (data.xPowerString.length()) - 1);
                    xPower.setText(data.xPowerString);
                } else if (data.focus.equals("xPower") && (data.xPowerString.length() > 0)) {
                    data.xPowerString = data.xPowerString.substring(0, (data.xPowerString.length()) - 1);
                    xPower.setText(data.xPowerString);
                }
            }
            if (data.xPowerString.length() == 0) {
                xPower.setText("x");
            }

            if (data.focus.equals("Power") && data.powerString.length() > 0) {
                String expLastChar = data.powerString.charAt(data.powerString.length() - 1) + "";
                if (expLastChar.equals(".")) {
                    isDecimal[8] = 0;
                    data.powerString = data.powerString.substring(0, (data.powerString.length()) - 1);
                    power.setText(data.powerString);
                } else if (data.focus.equals("Power") && (data.powerString.length() > 0)) {
                    data.powerString = data.powerString.substring(0, (data.powerString.length()) - 1);
                    power.setText(data.powerString);
                }
            }
            if (data.powerString.length() == 0) {
                power.setText("power");
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

            if (data.focus.equals("R") && data.radiusString.length() > 0) {
                String expLastChar = data.radiusString.charAt(data.radiusString.length() - 1) + "";
                if (expLastChar.equals(".")) {
                    data.radiusString = data.radiusString.substring(0, (data.radiusString.length()) - 1);
                    radius.setText(data.radiusString);
                } else if (data.focus.equals("R") && (data.radiusString.length() > 0)) {
                    data.radiusString = data.radiusString.substring(0, (data.radiusString.length()) - 1);
                    radius.setText(data.radiusString);
                }
            }
            if(data.radiusString.length() == 0){
                radius.setText("r");
            }

            if (data.focus.equals("r") && data.radiusString.length() > 0) {
                String expLastChar = data.radiusString.charAt(data.radiusString.length() - 1) + "";
                if (expLastChar.equals(".")) {
                    data.radiusString = data.radiusString.substring(0, (data.radiusString.length()) - 1);
                    if(data.subCategory.equals("sphere")){
                        rSphere.setText(data.radiusString);
                    } else if(data.subCategory.equals("circumference")){
                        rCircumference.setText(data.radiusString);
                    }
                } else if (data.focus.equals("r") && (data.radiusString.length() > 0)) {
                    data.radiusString = data.radiusString.substring(0, (data.radiusString.length()) - 1);
                    if(data.subCategory.equals("sphere")){
                        rSphere.setText(data.radiusString);
                    } else if(data.subCategory.equals("circumference")){
                        rCircumference.setText(data.radiusString);
                    }
                }
            }
            if(data.radiusString.length() == 0){
                if(data.subCategory.equals("sphere")){
                    rSphere.setText("r");
                } else if(data.subCategory.equals("circumference")){
                    rCircumference.setText("r");
                }
            }

            if (data.focus.equals("degree") && data.degree.length() > 0) {
                data.degree = data.degree.substring(0, (data.degree.length()) - 1);
                degreeText.setText(data.degree);
            }
            if(data.degree.length() == 0){
                degreeText.setText("\u00B0");
            }
            if (data.focus.equals("XI") && data.XI.length() > 0) {
                data.XI = data.XI.substring(0, (data.XI.length()) - 1);
                XIText.setText(data.XI);
            }
            if(data.XI.length() == 0){
                XIText.setText("xi");
            }
            if (data.focus.equals("XF") && data.XF.length() > 0) {
                data.XF = data.XF.substring(0, (data.XF.length()) - 1);
                XFText.setText(data.XF);
            }
            if(data.XF.length() == 0){
                XFText.setText("xf");
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
            if (data.focus.equals("polyn1") && data.n1String.length() > 0) {
                data.n1String = data.n1String.substring(0, (data.n1String.length()) - 1);
                n1Text.setText(data.n1String);
            }
            if(data.n1String.length() == 0){
                n1Text.setText("n1");
            }
            if (data.focus.equals("polyn2") && data.n2String.length() > 0) {
                data.n2String = data.n2String.substring(0, (data.n2String.length()) - 1);
                n2Text.setText(data.n2String);
            }
            if(data.n2String.length() == 0){
                n2Text.setText("n2");
            }
        }
    }

    public void polyChangeSign(View v){
        if(data.polySign.equals("+")){
            data.polySign = "-";
            polySignText.setText("-");
        } else {
            data.polySign = "+";
            polySignText.setText("+");
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
        Button b = (Button)v;
        String formulaSelect = b.getText().toString();
        data.subCategory = formulaSelect;
        setFormulaText(formulaSelect);
        textMessage.setText("Formula selected "+formulaSelect);
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
        data.subCategory = "triangle";
        setFormulaText(data.subCategory);
    }
    public void AreaCircle(View v) {
        data.subCategory = "circle";
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
    public void AngularVelocity(View v){
        data.subCategory2 = "AngularVelocity";
        setFormulaText(data.subCategory2);
    }
    public void x2(View v){
        data.subCategory = "x2";
        setFormulaText(data.subCategory);
        data.powerString = "2";
    }
    public void x3(View v){
        data.subCategory = "x3";
        setFormulaText(data.subCategory);
        data.powerString = "3";
    }
    public void Sphere(View v){
        data.subCategory = "sphere";
        setFormulaText(data.subCategory);
    }
    public void Cone(View v){
        data.subCategory = "cone";
        setFormulaText(data.subCategory);
    }
    public void setBox(View v){
        data.subCategory = "box";
        setFormulaText(data.subCategory);
    }
    public void setCircumference(View v){
        data.subCategory = "circumference";
        setFormulaText(data.subCategory);
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

    public void selectSub2(View v){
        displaySubs2(0);
        Button b = (Button) v;
        String sub2Select = b.getText().toString();
        if(sub2Select.equals("Motion")){displaySubs2(1);}
        if(sub2Select.equals("Area")){displaySubs2(2);}
    }

    public void displaySubs2(int num) {
        LinearLayout moSub = findViewById(R.id.motionSub);
        LinearLayout arSub = findViewById(R.id.areaSub);
        switch (num) {
            case 0:
                moSub.setVisibility(View.GONE);
                arSub.setVisibility(View.GONE);
                break;
            case 1:
                arSub.setVisibility(View.GONE);
                moSub.setVisibility(View.VISIBLE);
                textMessage.setText(" Motion selected");
                break;
            case 2:
                moSub.setVisibility(View.GONE);
                arSub.setVisibility(View.VISIBLE);
                textMessage.setText(" Area selected");
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
        if(data.subCategory.equals("square") || data.subCategory.equals("cube") || data.subCategory.equals("AreaTriangle") || data.subCategory.equals("box")) {
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
            String result = formula.Power(data.xPowerString, data.powerString);
            TextView totalText = findViewById(R.id.ExpTotvalue2);
            totalText.setText(result);
            data.totalString = "";
        }
        if(data.subCategory.equals("custom")) {
            String result = custom.customSolve2(data.customString);
            TextView totalCustom = findViewById(R.id.CusTotvalue2);
            totalCustom.setText(result);
        }
        if(data.subCategory.equals("triangle")){
            String result = formula.Area(data.hString, data.wString, "0", data.totalString, data.subCategory);
            if(data.hString.equals("")){
                hText.setText(result);
            } else if (data.wString.equals("")){
                wText.setText(result);
            } else {
                TextView triAreaTotal = findViewById(R.id.Total);
                triAreaTotal.setText(result);
            }
        }
        if(data.subCategory.equals("circle") || data.subCategory.equals("sphere")){
            String result = formula.Area(data.radiusString,"0","0",data.totalString , data.subCategory);
            if(data.subCategory.equals("circle")){
                TextView circleAreaTotal = findViewById(R.id.CircleTotvalue);
                circleAreaTotal.setText(result);
            }else{
                TextView sphereTotal = findViewById(R.id.SphereTotal);
                sphereTotal.setText(result);
            }
        }
        if(data.subCategory.equals("sin") || data.subCategory.equals("cos") || data.subCategory.equals("tan")){
            String result = formula.SCTSolve(data.degree, data.subCategory);
            TextView randiansTotal = findViewById(R.id.radians);
            randiansTotal.setText(result);
        }
        if(data.subCategory.equals("LinearVelocity")){
            String result = formula.LinearVelocity(data.XI, data.XF, data.time);
            TextView linVelocityTotal = findViewById(R.id.LV);
            linVelocityTotal.setText(result);
        }
        if(data.subCategory.equals("Pythagoren")){
            String result = formula.Pythagorean(data.aString, data.bString, data.cString);
            String sqrtResult = (Math.sqrt(Double.valueOf(result)))+"";
            if (data.aString.length() > 0 && data.bString.length() > 0 && data.cString.length() == 0) {
                cText.setText(sqrtResult);
                textMessage.setText("The sqr of c is "+result);
            } else if (data.aString.length() > 0 && data.bString.length() == 0 && data.cString.length() > 0) {
                bText.setText(sqrtResult);
                textMessage.setText("The sqr of b is "+result);
            } else if (data.aString.length() == 0 && data.bString.length() > 0 && data.cString.length() > 0) {
                aText.setText(sqrtResult);
                textMessage.setText("The sqr of a is "+result);
            }
        }
        if(data.subCategory2.equals("Angular Acceleration")){
            String result = formula.AngularAcceleration(data.angle1, data.angle2, data.time, data.acceleration);
            TextView angAccTotal = findViewById(R.id.AngMotionAcc);
            angAccTotal.setText(result);
        }
        if(data.subCategory.equals("(x\u00B1y)\u00B2")){
            String result = formula.Polynomal(data.n1String, data.n2String, data.polySign);
            LinearLayout polybase = findViewById(R.id.polynomalFormulaBase);
            LinearLayout polyResults = findViewById(R.id.polyResult);
            TextView polyResultText = findViewById(R.id.polyResult1);
            polybase.setVisibility(View.GONE);
            polyResults.setVisibility(View.VISIBLE);
            polyResultText.setText(result);
        }
        if(data.subCategory.equals("circumference")){
            String result = formula.Circumference(data.radiusString);
            TextView cirTotal = findViewById(R.id.circumferenceTotal);
            cirTotal.setText(result);
        }
    }

    public void resetUI(){
        displaySubs2(0);
        data.resetStats();
        xText.setText("x");
        yText.setText("y");
        zText.setText("z");
        hText.setText("h");
        wText.setText("w");
        dText.setText("d");
        xPower.setText("x");
        power.setText("power");
        total.setText("Total");
        radius.setText("r");
        TextView circleTotal = findViewById(R.id.CircleTotvalue);
        circleTotal.setText("Total");
        TextView degreeTextString = findViewById(R.id.Degree);
        degreeTextString.setText("\u00B0");
        XIText.setText("xi");
        XFText.setText("xf");
        TextView timeTextString = findViewById(R.id.time);
        timeTextString.setText("t");
        aText.setText("a");
        bText.setText("b");
        cText.setText("c");
        n1Text.setText("n1");
        n2Text.setText("n2");
        TextView LVText = findViewById(R.id.LV);
        LVText.setText("v");
        TextView angle1TextString = findViewById(R.id.angle1);
        angle1TextString.setText("\u03B8");
        TextView angle2TextString = findViewById(R.id.angle2);
        angle2TextString.setText("\u03B8");
        TextView time2TextString = findViewById(R.id.time2);
        time2TextString.setText("t");
        TextView radiusSphere = findViewById(R.id.RadiusS1);
        radiusSphere.setText("r");
        TextView totalSphere = findViewById(R.id.SphereTotal);
        totalSphere.setText("total");
        TextView circumRad = findViewById(R.id.RadiusCir);
        circumRad.setText("r");
        TextView circumTotal = findViewById(R.id.circumferenceTotal);
        circumTotal.setText("total");
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
        LinearLayout mainAngVelocity = findViewById(R.id.AngularVelocity);
        LinearLayout mainPolynomal = findViewById(R.id.polynomalFormula);
        LinearLayout mainSphere = findViewById(R.id.sphereFormula);
        LinearLayout mainCircumference = findViewById(R.id.circumferenceFormula);
        LinearLayout mainCone = findViewById(R.id.ConeFormula);
        //LinearLayout subMotion = findViewById(R.id.angularMotionSub);
        TextView sign1Text = findViewById(R.id.sign1);
        TextView getDivBy2 = findViewById(R.id.divBy2);
        TextView sctText = findViewById(R.id.SCT);
        //subMotion.setVisibility(View.GONE);
        mainPolynomal.setVisibility(View.GONE);
        mainBasic.setVisibility(View.GONE);
        main23DArea.setVisibility(View.GONE);
        mainExponent.setVisibility(View.GONE);
        mainCustom.setVisibility(View.GONE);
        mainCircle.setVisibility(View.GONE);
        mainSCT.setVisibility(View.GONE);
        mainLinVelocity.setVisibility(View.GONE);
        mainPythagoren.setVisibility(View.GONE);
        mainAngVelocity.setVisibility(View.GONE);
        getDivBy2.setVisibility(View.GONE);
        mainSphere.setVisibility(View.GONE);
        mainCircumference.setVisibility(View.GONE);
        mainCone.setVisibility(View.GONE);
        TextView textMessageSub = findViewById(R.id.message);
        textMessageSub.setText(data.subCategory);
        if(sub.equals("add")){
            mainBasic.setVisibility(View.VISIBLE);
            sign1Text.setText("+");
        }else if(data.subCategory.equals("subtract")){
            mainBasic.setVisibility(View.VISIBLE);;
            sign1Text.setText("-");
        }else if(data.subCategory.equals("divide")){
            mainBasic.setVisibility(View.VISIBLE);
            sign1Text.setText("/");
        }else if(data.subCategory.equals("multiply")){
            mainBasic.setVisibility(View.VISIBLE);
            sign1Text.setText("*");
        }else if(data.subCategory.equals("square") || data.subCategory.equals("triangle")){
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
        }else if(data.subCategory.equals("cube") || data.subCategory.equals("box")){
            main23DArea.setVisibility(View.VISIBLE);
            TextView sign2Text = findViewById(R.id.sign2);
            sign2Text.setVisibility(View.VISIBLE);
            dText.setVisibility(View.VISIBLE);
            if(data.subCategory.equals("cube")){
                textMessage.setText("You have selected Cube");
            } else {
                textMessage.setText("You have selected Box");
            }
        } else if(data.subCategory.equals("Exponent") || data.subCategory.equals("x2") || data.subCategory.equals("x3")){
            mainExponent.setVisibility(View.VISIBLE);
            textMessageSub.setText("Exponent selected");
            if(data.subCategory.equals("x2")){
                power.setText("2");
            }
            if(data.subCategory.equals("x3")){
                power.setText("3");
            }
        } else if(data.subCategory.equals("circle")) {
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
        } else if(data.subCategory.equals("AngularVelocity")){
            mainAngVelocity.setVisibility(View.VISIBLE);
            textMessageSub.setText("Angular Acceleration Selected");
        } else if(data.subCategory.equals("(x\u00B1y)\u00B2")){
            mainPolynomal.setVisibility(View.VISIBLE);
            LinearLayout polybase = findViewById(R.id.polynomalFormulaBase);
            LinearLayout polyResults = findViewById(R.id.polyResult);
            polybase.setVisibility(View.VISIBLE);
            polyResults.setVisibility(View.GONE);
        } else if(data.subCategory.equals("sphere")){
            mainSphere.setVisibility(View.VISIBLE);
        } else if(data.subCategory.equals("circumference")){
            mainCircumference.setVisibility(View.VISIBLE);
        } else if(data.subCategory.equals("cone")){
            mainCone.setVisibility(View.VISIBLE);
        } else {
            textMessageSub.setText("Check your formula");
        }
    }
}//1052