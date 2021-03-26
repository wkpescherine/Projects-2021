package com.example.sciemu_x2;

public class SolveCustom {
    private static String t1 = "12";

    static String customSolve(String customStringArg){
        String [] brokenString = customStringArg.split("");
        for(int count = 1; count <3; count ++ ){
            for(int a = 0; a < brokenString.length; a++) {
                if (brokenString[a].equals("*") && count == 1) {
                    brokenString[a-1] = (Integer.parseInt(brokenString[a-1])*Integer.parseInt(brokenString[a+1]))+"";
                    for(int b = a+3; b < brokenString.length; b++){
                        brokenString[b-3] = brokenString[b];
                    }
                }
            }
        }
        //t1 = brokenString[0];
        return t1;
    }
}//18
//sample formula
// 8+78*34-5