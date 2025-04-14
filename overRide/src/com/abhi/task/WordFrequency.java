package com.abhi.task;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "rdj is ironman and rdj is doctor doom too";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String wordToFind = words[i];
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(wordToFind)) {
                    count++;
                }
            }

        }
    }
}


