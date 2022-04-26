package com.olgakami;

public class ShareDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) return false;
        else {
            int digita = a % 10;
            a /= 10;
            int digitb = b % 10;
            b /= 10;
            if (digita == digitb || digita == b || digitb == a || a == b) return true;
            else return false;
        }
    }


    public static boolean isValid(int number) {
        return number <= 1000 && number >= 10;
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
                int digita = a % 10;
                a /= 10;
                int digitb = b % 10;
                b /= 10;
                int digitc = c % 10;
                c /= 10;
                return digita == digitb || digitb == digitc || digita == digitc;
            } return false;
    }
}