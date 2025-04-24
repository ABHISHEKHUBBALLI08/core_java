package com.abhi.abstractions.internal;

public class School implements Education {

    @Override
    public void info() {
        System.out.println("This is a school providing primary and secondary education.");
    }
}
