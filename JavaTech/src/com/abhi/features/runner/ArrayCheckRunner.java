package com.abhi.features.runner;

import com.abhi.features.internal.ArrayCheck;

public class ArrayCheckRunner {
    public static void main(String[] args) {
        ArrayCheck arrayCheck=(numbers)->{
            for (int i=0;i<numbers.length;i++){
                if(numbers[i]>=10){
                    System.out.println(numbers[i]);
                }
            }
        };
        int[] numbers={10,12,15,1,23,5,9};
        arrayCheck.check(numbers);
    }
}
