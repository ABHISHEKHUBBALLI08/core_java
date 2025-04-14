package com.abhi.task;

public class CharFrequency {
    public static void main(String[] args) {
        String word="RobertDowneyJunior";
        for (int i=0;i<word.length();i++){
            int count=0;
            for(int j=0;j<word.length();j++){
                if(word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            System.out.println("character "+word.charAt(i)+" appears: "+count+" times");
        }

    }
}
