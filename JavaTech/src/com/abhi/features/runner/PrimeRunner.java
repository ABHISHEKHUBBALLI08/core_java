package com.abhi.features.runner;

import com.abhi.features.internal.PrimeOrNot;

public class PrimeRunner {
    public static void main(String[] args) {
        PrimeOrNot primeOrNot=(number)->{
            if(number<2){
                return false;
            }
            for(int i=2;i<number;i++){
                if(number%i==0) {
                    return false;
                }
            }
            return true;
        };
        boolean a= primeOrNot.isPrime(11);
        if(a==true){
            System.out.println("number is prime");
        }else {
            System.out.println("not a prime number");
        }

    }
}
