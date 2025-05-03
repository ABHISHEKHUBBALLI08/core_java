package com.abhi.features.runner;

import com.abhi.features.internal.SubstringCheck;

public class SubstringCheckRunner {
    public static void main(String[] args) {
        SubstringCheck substringCheck = new SubstringCheck() {
            String target = "check";

            public void check(String[] words) {
                for (int i = 0; i < words.length; i++) {
                    if (words[i].contains(target)) {
                        System.out.println(words[i]);
                    }
                }
            }
        };

        String[] words = {"check the name", "check his id", "hi"};
        substringCheck.check(words);
    }
}
