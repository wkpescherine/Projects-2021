package com.example.sciemu;

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
                if((Double.valueOf(value4)%Double.valueOf(value1)*Double.valueOf(value2)) != 0){
                    t1 = (Double.valueOf(value4)/Double.valueOf(value1)*Double.valueOf(value2))+"";
                }else {
                    t1 = (Integer.parseInt(value4) / Integer.parseInt(value1) * Integer.parseInt(value2)) + "";
                }
            }
            if(value2.equals("")){
                if((Double.valueOf(value4)%Double.valueOf(value1)*Double.valueOf(value3)) != 0){
                    t1 = (Double.valueOf(value4)/Double.valueOf(value1)*Double.valueOf(value3))+ "";
                }else {
                    t1 = (Integer.parseInt(value4) / Integer.parseInt(value1) * Integer.parseInt(value3)) + "";
                }
            }
            if(value1.equals("")){
                if(Double.valueOf(value3)/Double.valueOf(value3) != 0){
                    t1 = (Double.valueOf(value4)/Double.valueOf(value2)*Double.valueOf(value3))+ "";
                }else {
                    t1 = (Integer.parseInt(value4) / Integer.parseInt(value2) * Integer.parseInt(value3)) + "";
                }
            }
        }else{
            if(value4.equals("")){
                t1 = (Double.valueOf(value1))*(Double.valueOf(value2))*(Double.valueOf(value3))+"";
            }
            if(value3.equals("")){
                t1 = (Double.valueOf(value4)/Double.valueOf(value1)*Double.valueOf(value2))+"";
            }
            if(value2.equals("")){
                t1 = (Double.valueOf(value4)/Double.valueOf(value1)*Double.valueOf(value3))+ "";
            }
            if(value1.equals("")){
                t1 = (Double.valueOf(value4)/Double.valueOf(value2)*Double.valueOf(value3))+ "";
            }
        }
        return t1;
    }

    static String Exponent(String value1, String value2){
        if( Double.valueOf(value1)%2 != 0){
            double subt1 = Double.valueOf(value1);
            for (int a = 1; a < Integer.parseInt(value2); a++) {
                subt1 = subt1 * Double.valueOf(value1);
            }
            t1 = subt1+"";
        }else {
            int subT1 = Integer.parseInt(value1);
            for (int a = 1; a < Integer.parseInt(value2); a++) {
                subT1 = subT1 * Integer.parseInt(value1);
            }
            t1 = subT1+"";
        }
        return t1;
    }

    static String AreaTriangle(String value1, String value2){
        if(Integer.parseInt(value1)%2 != 0){
            t1 = ((Double.valueOf(value1)/2)* Double.valueOf(value2)) + "";
        } else {
            t1 = ((Integer.parseInt(value1)/2) * Integer.parseInt(value2))+ "";
        }
        return t1;
    }

    static String AreaCircle(String value1){
        t1 = (3.16*(2*(Double.valueOf(value1)*Double.valueOf(value1))))+"";
        return t1;
    }
}//114