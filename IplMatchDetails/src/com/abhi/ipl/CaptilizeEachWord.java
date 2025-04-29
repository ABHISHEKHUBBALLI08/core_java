package com.abhi.ipl;

import java.util.Locale;

public class CaptilizeEachWord {
    public static void main(String[] args) {
        String s1 = "this is a java class";
        String[] words = s1.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            }
        }
        String result = String.join(" ", words);
        System.out.println(result);
    }
}
