package com.abhi.features.runner;

import com.abhi.features.internal.ReverseString;

public class ReverseStringRunner {
    public static void main(String[] args) {
        ReverseString reverseString=new ReverseString() {
            @Override
            public void reverse(String name) {
                String rev="";
                for (int i=0;i<name.length();i++){
                    rev=name.charAt(i)+rev;
                }
                System.out.println(name);
                System.out.println(rev);
            }
        };
        reverseString.reverse("abhi");
    }
}
