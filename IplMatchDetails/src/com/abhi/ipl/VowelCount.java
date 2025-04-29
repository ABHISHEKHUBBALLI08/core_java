package com.abhi.ipl;

public class VowelCount {
    public static void main(String[] args) {
         int count=0;

        String sentence="Today is my day , I will do best";
        sentence=sentence.replaceAll("\\s","");
        int a=sentence.length();

        for (int i=0;i<sentence.length();i++){

                if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u') {
                    count++;
                }
        }
        System.out.println("Number of vowels present in a sentence :"+count);
        System.out.println("Number of constants present in a sentence are : "+(a-count));


    }

}
