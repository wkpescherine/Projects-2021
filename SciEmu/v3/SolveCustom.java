package com.example.sciemu;

import java.util.ArrayList;

public class SolveCustom {
    private static String t1 = "";

    static String customSolve2(String customStringArg){
        String [] breakString = customStringArg.split("");
        String [] valueBreakString = customStringArg.split("[*+-/]");
        ArrayList<String> opString = new ArrayList<String>();
        ArrayList <String> valueString = new ArrayList<String>();
        for(int a = 0; a< breakString.length; a++){
            if(breakString[a].equals("*") || breakString[a].equals("/") || breakString[a].equals("+") || breakString[a].equals("-")){
                opString.add(breakString[a]);
            }
        }

        for(int a = 0; a< valueBreakString.length; a++){
            valueString.add(valueBreakString[a]);
        }

        for(int aa = 0; aa < opString.size();){
            if(opString.get(aa).equals("*")){
                String newIndex = (Integer.parseInt(valueString.get(aa))*Integer.parseInt(valueString.get(aa+1))) +"";
                valueString.set( valueString.indexOf(valueString.get(aa)) , newIndex);
                valueString.remove(aa+1 );
                opString.remove(aa);
            }else{
                aa += 1;
            }
        }

        for(int aa = 0; aa < opString.size();){
            if(opString.get(aa).equals("+")){
                String newIndex = (Integer.parseInt(valueString.get(aa))+Integer.parseInt(valueString.get(aa+1))) +"";
                valueString.set( valueString.indexOf(valueString.get(aa)) , newIndex);
                valueString.remove(aa+1 );
                opString.remove(aa);
            }else{
                aa += 1;
            }
        }

        for(int aa = 0; aa < opString.size();){
            if(opString.get(aa).equals("-")){
                String newIndex = (Integer.parseInt(valueString.get(aa))-Integer.parseInt(valueString.get(aa+1))) +"";
                valueString.set( valueString.indexOf(valueString.get(aa)) , newIndex);
                valueString.remove(aa+1 );
                opString.remove(aa);
            }else{
                aa += 1;
            }
        }

        t1 = valueString.get(0);
        return t1;
    }
}//59