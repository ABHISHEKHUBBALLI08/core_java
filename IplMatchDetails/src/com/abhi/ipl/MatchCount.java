package com.abhi.ipl;

public class MatchCount {
    public static void main(String[] args) {
        String match="RCB will win the match against CSK";
        System.out.println(match);
        String[] s1=match.split(" ");
        for(int i=0;i<s1.length;i++){
            System.out.print(s1[i].length()+" ");
        }
    }
}
