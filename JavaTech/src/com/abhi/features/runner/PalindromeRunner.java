package com.abhi.features.runner;

import com.abhi.features.internal.PalindromeCheck;

public class PalindromeRunner {
    public static void main(String[] args) {
        PalindromeCheck palindromeCheck=(name)->{
            String rev="";
            for (int i=0;i<name.length();i++){
                rev=name.charAt(i)+rev;
            }
            if(name.equals(rev)){
                return true;
            }
            return false;

        };
        boolean s1=palindromeCheck.check("GADA");
        if(s1==true){
            System.out.println("string is plaindrome" );
        }
        else {
            System.out.println("string is not a plaindrome");
        }
    }
}
