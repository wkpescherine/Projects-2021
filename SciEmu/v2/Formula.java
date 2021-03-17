package com.example.sciemu_x2;

import android.widget.TextView;

public class Formula {
    private static int valueTotal;
    static int Multiply(int valueH, int valueW, String total){
        if(total.equals("")){
            valueTotal = valueH*valueW;
        }
        return  valueTotal;
    }
}//13