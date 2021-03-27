package com.example.sciemu_x2;

public class SolveCustom {
    private static String t1 = "";

    static String customSolve2(String customStringArg){
        String parseString = customStringArg;
        String [] brokenString = customStringArg.split("*");
        for(int count = 1; count <3; count ++ ){
            for(int a = 0; a < parseString.length(); a++) {
                char aChar = parseString.charAt(a);
                if (aChar == "*" && count == 1) {
                    brokenString[a-1] = (Integer.parseInt(brokenString[a-1])*Integer.parseInt(brokenString[a+1]))+"";
                    for(int b = a+2; b < brokenString.length; b++){
                        //1*2*3*4
                        //2*3*4
                        //6*4
                        //24
                        brokenString[b-2] = brokenString[b];
                        brokenString[b] = "";
                    }
                    a = 0;
                }
            }
        }
        //t1 = brokenString[0];
        return t1;
    }

    /*static String customSolve(String customStringArg){
        String parseString = customStringArg;
        String [] brokenString = customStringArg.split("*");
        for(int count = 1; count <3; count ++ ){
            for(int a = 0; a < brokenString.length; a++) {
                if (brokenString[a].equals("*") && count == 1) {
                    brokenString[a-1] = (Integer.parseInt(brokenString[a-1])*Integer.parseInt(brokenString[a+1]))+"";
                    for(int b = a+2; b < brokenString.length; b++){
                        //1*2*3*4
                        //2*3*4
                        //6*4
                        //24
                        brokenString[b-2] = brokenString[b];
                        brokenString[b] = "";
                    }
                }
            }
        }
        for(int c = 0; c< brokenString.length;c++){
            t1 += brokenString[c];
        }
        //t1 = brokenString[0];
        return t1;
    }*/
}//29
//sample formula
//1*2*3*4