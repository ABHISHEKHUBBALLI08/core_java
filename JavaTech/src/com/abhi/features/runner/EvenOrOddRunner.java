package com.abhi.features.runner;

import com.abhi.features.internal.EvenOrOdd;

public class EvenOrOddRunner {
    public static void main(String[] args) {
        EvenOrOdd evenOrOdd=new EvenOrOdd() {
            @Override
            public void check(int num) {
                if(num%2==0){
                    System.out.println("number is even ");
                }else {
                System.out.println("odd number");}
            }
        };
        EvenOrOdd evenOrOdd1=(num)-> {


                if(num%2==0){
                    System.out.println("number is even ");
                }else {
                    System.out.println("odd number");}

        };
        evenOrOdd1.check(21);
       evenOrOdd.check(10);

    }
}
