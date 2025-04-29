package com.abhi.ipl;

public class ReplaceVowel {
    public static void main(String[] args) {
        String sentence = "Today is my day";
        System.out.println(sentence);
        String s1 = sentence.replaceAll("//s", "");
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a') {
                s1 = s1.replace('a', 'b');
            } else if (s1.charAt(i) == 'e') {
                s1 = s1.replace('e', 'f');
            } else if (s1.charAt(i) == 'i') {
                s1 = s1.replace('i', 'j');
            } else if (s1.charAt(i) == 'o') {
                s1 = s1.replace('o', 'p');
            } else if (s1.charAt(i) == 'u') {
                s1 =
                        s1.replace('u', 'v');
            }

        }
        System.out.println(s1);
    }
}
