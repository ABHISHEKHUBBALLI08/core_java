package com.abhi.features.runner;

import com.abhi.features.internal.StringLength;

public class StringLengthRunner {
    public static void main(String[] args) {
        StringLength s = (words) -> {
            int len = 5;
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > len) {
                    System.out.println(words[i]);
                }
            }
        };

        String[] input = {"abhi", "feature", "java", "functional", "test"};
        s.check(input);
    }
}
