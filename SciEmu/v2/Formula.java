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
                if(Double.valueOf(value3)/Double.valueOf(value1) != 0){
                    t1 = Double.valueOf(value3)/Double.valueOf(value1) + "";
                }else {
                    t1 = Integer.parseInt(value3) / Integer.parseInt(value1) + "";
                }
            }
            if(value1.equals("")){
                if(Double.valueOf(value3)/Double.valueOf(value3) != 0){
                    t1 = Double.valueOf(value3)/Double.valueOf(value2) + "";
                }else {
                    t1 = Integer.parseInt(value3) / Integer.parseInt(value2) + "";
                }
            }
        }else{
            if(value3.equals("")){
                t1 = (Double.valueOf(value1))*(Double.valueOf(value2))+"";
            }
            if(value2.equals("")){
                t1 = (Double.valueOf(value3))/(Double.valueOf(value1))+"";
            }
            if(value1.equals("")){
                t1 = (Double.valueOf(value3))/(Double.valueOf(value2))+"";
            }
        }
        return  t1;
    }

    static String Area3(String value1, String value2 , String value3, String value4, int decimal){
        if( decimal == 0){
            if(value4.equals("")){
                t1 = Integer.parseInt(value1)*Integer.parseInt(value2)*Integer.parseInt(value3)+"";
            }
            if(value3.equals("")){
                t1 = (Integer.parseInt(value1))*(Integer.parseInt(value2))+"";
            }
            if(value2.equals("")){
                if(Double.valueOf(value3)/Double.valueOf(value1) != 0){
                    t1 = Double.valueOf(value3)/Double.valueOf(value1) + "";
                }else {
                    t1 = Integer.parseInt(value3) / Integer.parseInt(value1) + "";
                }
            }
            if(value1.equals("")){
                if(Double.valueOf(value3)/Double.valueOf(value3) != 0){
                    t1 = Double.valueOf(value3)/Double.valueOf(value2) + "";
                }else {
                    t1 = Integer.parseInt(value3) / Integer.parseInt(value2) + "";
                }
            }
        }else{

        }

        return t1;
    }
}//69