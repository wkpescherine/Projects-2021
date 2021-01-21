package com.example.sciemu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.View;
import android.widget.TextView;

public class Emulator extends AppCompatActivity {

    FormulaBasic basicFormula = new FormulaBasic();
    String Category = "None";
    String SubCategory = "None";
    String focus = "None";
    String Xvalue = "X";
    String Yvalue = "Y";
    String Zvalue = "Z";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emulator);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }
    public void FocusX(View v){
        focus = "X";
    }
    public void FocusY(View v){
        focus = "Y";
    }
    public void FocusZ(View v){
        focus = "Z";
    }

    public void TapNum1(View v){
        if(focus == "X" && Xvalue =="X"){
            Xvalue = "1";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="X" && Xvalue!="X"){
            Xvalue = Xvalue +"1";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Y" && Xvalue=="Y"){
            Xvalue = "1";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Y" && Xvalue!="Y"){
            Xvalue = Xvalue +"1";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Z" && Xvalue=="Z"){
            Xvalue = "1";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Z" && Xvalue!="Z"){
            Xvalue = Xvalue +"1";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }
    }
    public void TapNum2(View v){
        if(focus == "X" && Xvalue=="X"){
            Xvalue = "2";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="X" && Xvalue!="X"){
            Xvalue = Xvalue +"2";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Y" && Xvalue=="Y"){
            Xvalue = "2";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Y" && Xvalue!="Y"){
            Xvalue = Xvalue +"2";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Z" && Xvalue=="Z"){
            Xvalue = "2";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Z" && Xvalue!="Z"){
            Xvalue = Xvalue +"2";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }
    }
    public void TapNum3(View v){
        if(focus == "X" && Xvalue=="X"){
            Xvalue = "3";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="X" && Xvalue!="X"){
            Xvalue = Xvalue +"3";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Y" && Xvalue=="Y"){
            Xvalue = "3";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Y" && Xvalue!="Y"){
            Xvalue = Xvalue +"3";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Z" && Xvalue=="Z"){
            Xvalue = "3";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Z" && Xvalue!="Z"){
            Xvalue = Xvalue +"3";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }
    }
    public void TapNum4(View v){
        if(focus == "X" && Xvalue=="X"){
            Xvalue = "4";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="X" && Xvalue!="X"){
            Xvalue = Xvalue +"4";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Y" && Xvalue=="Y"){
            Xvalue = "4";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Y" && Xvalue!="Y"){
            Xvalue = Xvalue +"4";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Z" && Xvalue=="Z"){
            Xvalue = "4";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Z" && Xvalue!="Z"){
            Xvalue = Xvalue +"4";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }
    }
    public void TapNum5(View v){
        if(focus == "X" && Xvalue=="X"){
            Xvalue = "5";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="X" && Xvalue!="X"){
            Xvalue = Xvalue +"5";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Y" && Xvalue=="Y"){
            Xvalue = "5";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Y" && Xvalue!="Y"){
            Xvalue = Xvalue +"5";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Z" && Xvalue=="Z"){
            Xvalue = "5";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Z" && Xvalue!="Z"){
            Xvalue = Xvalue +"5";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }
    }
    public void TapNum6(View v){
        if(focus == "X" && Xvalue=="X"){
            Xvalue = "6";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="X" && Xvalue!="X"){
            Xvalue = Xvalue +"6";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Y" && Xvalue=="Y"){
            Xvalue = "6";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Y" && Xvalue!="Y"){
            Xvalue = Xvalue +"6";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Z" && Xvalue=="Z"){
            Xvalue = "6";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Z" && Xvalue!="Z"){
            Xvalue = Xvalue +"6";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }
    }
    public void TapNum7(View v){
        if(focus == "X" && Xvalue=="X"){
            Xvalue = "7";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="X" && Xvalue!="X"){
            Xvalue = Xvalue +"7";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Y" && Xvalue=="Y"){
            Xvalue = "7";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Y" && Xvalue!="Y"){
            Xvalue = Xvalue +"7";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Z" && Xvalue=="Z"){
            Xvalue = "7";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Z" && Xvalue!="Z"){
            Xvalue = Xvalue +"7";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }
    }
    public void TapNum8(View v){
        if(focus == "X" && Xvalue=="X"){
            Xvalue = "8";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="X" && Xvalue!="X"){
            Xvalue = Xvalue +"8";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Y" && Xvalue=="Y"){
            Xvalue = "8";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Y" && Xvalue!="Y"){
            Xvalue = Xvalue +"8";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Z" && Xvalue=="Z"){
            Xvalue = "8";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Z" && Xvalue!="Z"){
            Xvalue = Xvalue +"8";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }
    }
    public void TapNum9(View v){
        if(focus == "X" && Xvalue=="X"){
            Xvalue = "9";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="X" && Xvalue!="X"){
            Xvalue = Xvalue +"9";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Y" && Xvalue=="Y"){
            Xvalue = "9";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Y" && Xvalue!="Y"){
            Xvalue = Xvalue +"9";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Z" && Xvalue=="Z"){
            Xvalue = "9";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Z" && Xvalue!="Z"){
            Xvalue = Xvalue +"9";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }
    }
    public void TapNum0(View v){
        if(focus == "X" && Xvalue=="X"){
            Xvalue = "0";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="X" && Xvalue!="X"){
            Xvalue = Xvalue +"0";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Y" && Xvalue=="Y"){
            Xvalue = "0";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Y" && Xvalue!="Y"){
            Xvalue = Xvalue +"0";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }

        if(focus == "Z" && Xvalue=="Z"){
            Xvalue = "0";
            ((TextView)findViewById(R.id.Xvalue)).setText(Xvalue);
        }else if(focus=="Z" && Xvalue!="Z"){
            Xvalue = Xvalue +"0";
            ((TextView)findViewById(R.id.Answer)).setText(Xvalue);
        }
    }

    public void clickToSolve(View v){
        if(Xvalue=="X" && Yvalue!="Y"&& Zvalue!="Z"){
            int z = Integer.parseInt(Zvalue);
            int y = Integer.parseInt(Yvalue);
            int x = z - y;
            ((TextView)findViewById(R.id.Answer)).setText("The value of x is " + x);
        }else if(Yvalue=="Y" && Xvalue!="X" & Zvalue!="Z"){
            int z = Integer.parseInt(Zvalue);
            int x = Integer.parseInt(Xvalue);
            int y = z-x;
            ((TextView)findViewById(R.id.Answer)).setText("The value of y is " + y);
        }else if(Zvalue=="Z" && Xvalue!="X" && Yvalue!="Y"){
            int x = Integer.parseInt(Xvalue);
            int y = Integer.parseInt(Yvalue);
            int z = x + y;
            ((TextView)findViewById(R.id.Answer)).setText("The va;ue of z is " + z);
        }else{
            ((TextView)findViewById(R.id.Answer)).setText("You need to recheck the values something is wrong");
        }
    }

    public void solve(){
    }
}