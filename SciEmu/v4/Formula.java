package com.example.sciemu;

public class Formula {
    private static String t1;

    public String Basic (String value1, String value2, String value3, String sign){
        if (value1.equals("")) {
            if(sign.equals("add")){
                t1 = (Double.valueOf(value3) - Double.valueOf(value2)) + "";
            } else if(sign.equals("subtract")){
                t1 = (Double.valueOf(value3) + Double.valueOf(value2)) + "";
            } else if(sign.equals("divide")){
                t1 = (Double.valueOf(value3) * Double.valueOf(value2)) + "";
            } else if(sign.equals("multiply")){
                t1 = (Double.valueOf(value3))/(Double.valueOf(value2))+"";
            }
        }
        if (value2.equals("")) {
            if(sign.equals("add")){
                t1 = (Double.valueOf(value3) - Double.valueOf(value1)) + "";
            } else if(sign.equals("subtract")){
                t1 = (Double.valueOf(value1) - Double.valueOf(value3)) + "";
            } else if(sign.equals("divide")){
                t1 = (Double.valueOf(value1) / Double.valueOf(value3)) + "";
            } else if(sign.equals("multiply")){
                t1 = (Double.valueOf(value3))/(Double.valueOf(value1))+"";
            }
        }
        if (value3.equals("")) {
            if(sign.equals("add")){
                t1 = (Double.valueOf(value1) + Double.valueOf(value2)) + "";
            } else if(sign.equals("subtract")){
                t1 = (Double.valueOf(value1) - Double.valueOf(value2)) + "";
            } else if(sign.equals("divide")){
                t1 = (Double.valueOf(value1) / Double.valueOf(value2)) + "";
            } else if(sign.equals("multiply")){
                t1 = (Double.valueOf(value1))*(Double.valueOf(value2))+"";
            }
        }
        checkDecimal(t1);
        return t1;
    }

    public String Area (String value1, String value2, String value3, String value4, String area){
        if(value1.equals("")){
            if(area.equals("square")){
                t1 = ((Double.valueOf(value4))/ (Double.valueOf(value2))) + "";
            } else if(area.equals("cube")){
                t1 = (Double.valueOf(value4)/(Double.valueOf(value2)*Double.valueOf(value3)))+ "";
            } else if(area.equals("triangle")){
                t1 = ((Double.valueOf(value4)/Double.valueOf(value2))*2)+"";
            }
        }
        if(value2.equals("")){
            if(area.equals("square")){
                t1 = ((Double.valueOf(value4))/ (Double.valueOf(value1))) + "";
            } else if(area.equals("cube")){
                t1 = (Double.valueOf(value4)/Double.valueOf(value1)*Double.valueOf(value3))+ "";
            } else if(area.equals("triangle")) {
                t1 = ((Double.valueOf(value4) / (Double.valueOf(value2) / 2))) + "";
            } else if(area.equals("circle")){
                t1 = (3.16*(Double.valueOf(value1)*Double.valueOf(value1)))+"";
            }
        }
        if(value3.equals("")){
            if(area.equals("cube")){
                t1 = (Double.valueOf(value4)/(Double.valueOf(value1)*Double.valueOf(value2)))+"";
            }
        }
        if(value4.equals("")) {
            if (area.equals("square")) {
                t1 = ((Double.valueOf(value1)) * (Double.valueOf(value2))) + "";
            } else if (area.equals("cube")) {
                t1 = (Double.valueOf(value1)) * (Double.valueOf(value2)) * (Double.valueOf(value3)) + "";
            } else if (area.equals("triangle")) {
                t1 = ((Double.valueOf(value2) * (Double.valueOf(value1) / 2))) + "";
            }
        }
        checkDecimal(t1);
        return t1;
    }

    static String Power(String value1, String value2){
        t1 = (Math.pow(Double.valueOf(value1),Integer.parseInt(value2)))+"";
        checkDecimal(t1);
        return t1;
    }

    static String SCTSolve(String value1, String mathType){
        if(mathType.equals("sin")){
            t1 =(Math.sin(Math.toRadians(Double.valueOf(value1))))+"";
        }
        if(mathType.equals("cos")){
            t1 =(Math.cos(Math.toRadians(Double.valueOf(value1))))+"";
        }
        if(mathType.equals("tan")){
            t1 =(Math.tan(Math.toRadians(Double.valueOf(value1))))+"";
        }
        return t1;
    }

    static String Pythagorean(String value1, String value2, String value3){
        if(value1.equals("")){
            t1 = (Math.pow(Double.valueOf(value3),2)-Math.pow(Double.valueOf(value1),2))+"";
        }
        if(value2.equals("")){
            t1 = (Math.pow(Double.valueOf(value3),2)-Math.pow(Double.valueOf(value1),2))+"";
        }
        if(value3.equals("")){
            t1 = (Math.pow(Double.valueOf(value1),2)+Math.pow(Double.valueOf(value2),2))+"";
        }
        checkDecimal(t1);
        return t1;
    }

    static String LinearVelocity(String value1, String value2, String value3){
        t1 =((Math.abs(Double.valueOf(value1) - Double.valueOf(value2)))/Double.valueOf(value3))+"";
        checkDecimal(t1);
        return t1;
    }

    static String AngularAcceleration(String value1, String value2, String value3, String value4){
        if(value1.equals("")){
            t1 = ((Double.valueOf(value3)-Double.valueOf(value4))-Double.valueOf(value2))+"";
        }
        if(value2.equals("")){
            t1 = ((Double.valueOf(value3)*Double.valueOf(value4))-Double.valueOf(value1))+"";
        }
        if(value3.equals("")){
            t1 = ((Double.valueOf(value2)-Double.valueOf(value1))/Double.valueOf(value4))+"";
        }
        if(value4.equals("")){
            t1 = ((Double.valueOf(value2)-Double.valueOf(value1))/Double.valueOf(value3))+"";
        }
        checkDecimal(t1);
        return t1;
    }

    public static void checkDecimal(String valueCheck){
        double doubleCheck = Double.valueOf(valueCheck);
        int intCheck = (int)Math.round(doubleCheck);
        if(doubleCheck == intCheck){
            t1 = intCheck+"";
        }
    }
}//146