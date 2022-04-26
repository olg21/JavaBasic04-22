package com.olgakami;

public class LargestPrime {
    public static int getLargestPrime(int number){

        if (number <=1) return -1;

        int prime=-1;

        for (int i=number; i> 1; i--){

            if (number%i==0) {
                boolean isPrime= true;
                for (int a=(int) Math.sqrt(i); a>1 ;a--){
                    if (i%a==0){
                        isPrime=false;
                        break;
                    }
                    }
                if (isPrime){
                    prime = i;
                    break;
                }
                }



            }

        return prime;
        }
        }

