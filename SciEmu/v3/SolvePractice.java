package com.example.sciemu;

import java.util.ArrayList;

public class SolvePractice {
    private static int t = 0;
    static int Solution(int value1, int value2, String sign) {
        if(sign.equals("+")){ t = value1+value2; }
        if(sign.equals("-")){ t = value1-value2; }
        if(sign.equals("*")){ t = value1*value2; }
        return t;
    }
}//13