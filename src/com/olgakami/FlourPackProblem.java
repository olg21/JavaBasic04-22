package com.olgakami;

public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int sum = (bigCount * 5) + smallCount; // sum= 12
        int rest = goal; // rest=11
        if (bigCount < 0 || smallCount < 0 || goal < 0 || sum < goal) return false;

        else {
            if (bigCount == 0){
                for (int b =1; b<= smallCount;b++) {
                    if (rest >= 1) rest -= 1;
                }
            } else {
                for (int a = 1; a <= bigCount; a++) {// big= 5
                    if (rest >= 5) rest -= 5;
                    if (rest < 5 || (a==bigCount)) {
                        for (int b = 1; b <= smallCount; b++) {
                            if (rest >= 1) rest -= 1;

                        } break;
                    }
                }
            }
        }

        return rest==0;
    }


}
