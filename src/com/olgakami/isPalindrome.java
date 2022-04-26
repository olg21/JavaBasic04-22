package com.olgakami;

public class isPalindrome {
    public static boolean isPalindrome1(int number) {

        int reverse= 0;
        System.out.println(number);
        int newNumber = number;
        while (newNumber != 0) { //number =11

            int lastDigit = newNumber % 10; // 0
            newNumber/=10; // 1
            reverse = reverse*10 + lastDigit;// 1
            System.out.println(reverse);
        }

        return number==reverse;
    }
}
