package com.abhi.features.runner;

import com.abhi.features.internal.StringChecker;

public class StringCheckerRunner {
    public static void main(String[] args) {
        StringChecker stringChecker = (name) -> {
            String target = "ab";
            for (int i = 0; i < name.length; i++) {
                for (int j = 0; j < name[i].length(); j++) {
                    if (target.contains(String.valueOf(name[i].charAt(j)))) {
                        System.out.println(name[i]);
                        break;
                    }
                }
            }
        };
        String[] input = {"abhi", "hello", "ball", "bat"};
        stringChecker.checker(input);
    }
}
