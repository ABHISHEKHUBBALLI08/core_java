package com.abhi.task;

public class WordCount {
    public static void main(String[] args) {
        String str = "I'm abhishek hubballi";
        System.out.println("string is ;"+str);
        int count=0;
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("number of words in a strinf are :"+(count+1));



    }
}

