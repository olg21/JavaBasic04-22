package com.olgakami;

public class Main {

    public static void main(String[] args) {


        System.out.println("Largest prime number is: "
                + LargestPrime.getLargestPrime(16));
        System.out.println("Largest prime number is: "
                + LargestPrime.getLargestPrime(1));
        System.out.println("Largest prime number is: "
                + LargestPrime.getLargestPrime(45));
        System.out.println("Largest prime number is: "
                + LargestPrime.getLargestPrime(7));
        System.out.println("Largest prime number is: "
                + LargestPrime.getLargestPrime(0));
        System.out.println("Largest prime number is: "
                + LargestPrime.getLargestPrime(217));
        System.out.println("Largest prime number is: "
                + LargestPrime.getLargestPrime(21));










        System.out.println("---------");

        System.out.println("Is working?..: " +
                FlourPackProblem.canPack(2,10,18));// true
        System.out.println("Is working?..: " +
                FlourPackProblem.canPack(2,2,12));// true
        System.out.println("Is working?..: " +
                FlourPackProblem.canPack(1,0,4));// false
        System.out.println("Is working?..: " +
                FlourPackProblem.canPack(2,1,5));// true
        System.out.println("Is working?..: " +
                FlourPackProblem.canPack(1,0,5)); // true
        System.out.println("Is working?..: " +
                FlourPackProblem.canPack(0,5,4)); //true
        System.out.println("Is working?..: " +
                FlourPackProblem.canPack(2,2,11)); // true
        System.out.println("Is working?..: " +
                FlourPackProblem.canPack(5,3,24)); //false

        System.out.println("-----------");
        System.out.println("Is it perfect?..:"+
                PerfectNumber.isPerfectNumber(0));

        System.out.println("greatest common dividers is: " +
                GreatestCommonDivisor.getGreatestCommonDivisior(9,18));
        System.out.println("Shared Digit to: " +
                ShareDigit.hasSameLastDigit(22,23,34));
        System.out.println("Even sum is: " +
                EvenDigitSum.getEvenDigitSum(123456789));

        System.out.println("sum of first and last number is " +
                FirstLastDiitSum.sumFirstAndLastDigit(5));

        System.out.println(isPalindrome.isPalindrome1(-1111));


    }


}