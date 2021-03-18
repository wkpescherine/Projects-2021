package com.example.sciemu_x2;

import android.widget.TextView;

public class Formula {
    private static String t1;

    static String Multiply(String value1, String value2, String value3, int  decimal){
        if(decimal == 0){
            if(value3.equals("")){
                t1 = (Integer.parseInt(value1))*(Integer.parseInt(value2))+"";
            }
            if(value2.equals("")){
                int h = Integer.parseInt(value1);
                int t = Integer.parseInt(value3);
                t1 = t/h+"";
            }
            if(value1.equals("")){
                int t = Integer.parseInt(value3);
                int w = Integer.parseInt(value2);
                t1 = w/t+"";
            }
        }else{

        }
        return  t1;
    }
}//28