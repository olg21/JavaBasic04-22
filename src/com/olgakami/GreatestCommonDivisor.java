package com.olgakami;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisior(int first, int second){

        if (first >= 10 && second >= 10){
            int greatestDivider = 0;
            for (int i=first; i>0; i--){
                if (first%i== 0 && second%i==0){
                    greatestDivider = i;
                    break;
                }
            } return greatestDivider;
        }else return -1;
    }
}
