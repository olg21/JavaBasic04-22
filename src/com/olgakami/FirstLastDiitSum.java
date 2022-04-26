package com.olgakami;

public class FirstLastDiitSum {

    public static int sumFirstAndLastDigit(int number) {

        int sum = 0;

        if (number < 0) return -1;
        else if (number < 10) return number*2;
        else {// number = 123
            int lastDigit = number % 10; // lastDigit = 3
            sum += lastDigit; // sum = 3
            number /= 10; // 12

                while (number != 0) {
                // number 12
                int firstDigit = number % 10; // firstdigit= 2
                number /= 10; // number = 1
                if (number*10 < 10) sum += firstDigit;

            }

        } return sum;
    }
}
