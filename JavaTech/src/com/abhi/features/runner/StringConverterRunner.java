package com.abhi.features.runner;

import com.abhi.features.internal.StringConverter;

public class StringConverterRunner {
    public static void main(String[] args) {
        StringConverter converter = (word) -> word.toUpperCase();
        StringConverter converter1 = (word) -> word.toLowerCase();
        StringConverter converter2 = (word) -> ">>" + word;

        String[] names = {"abhi", "lambda", "java"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(converter.convert(names[i]));
            System.out.println(converter1.convert(names[i]));
            System.out.println(converter2.convert(names[i]));
        }
    }
}
