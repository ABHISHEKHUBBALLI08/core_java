package com.abhi.task;

public class TargetWord {
    public static void main(String[] args) {
        String name="I'm Abhishek hubballi";
        String target="Abhishek";
        String[] words=name.split(" ");
        for (String word : words) {
            if (word.equals(target)) {
                System.out.println(" target is present");
                break;
            }
            else{
                System.out.println("target not present");
            }
        }

    }
}
