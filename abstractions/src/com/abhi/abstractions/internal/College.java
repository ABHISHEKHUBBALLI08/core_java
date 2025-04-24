package com.abhi.abstractions.internal;

public class College implements Education {

    @Override
    public void info() {
        System.out.println("This is a college providing higher education.");
    }
}
