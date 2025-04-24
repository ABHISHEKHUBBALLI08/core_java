package com.abhi.abstractions.internal;

public class TextBook implements Book {

    @Override
    public void info() {
        System.out.println("This is a textbook used for academic learning.");
    }
}
