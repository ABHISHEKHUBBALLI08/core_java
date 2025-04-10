package com.abhi.override1.internal;

public class Groot extends TreeBeing {
    @Override
    public void usePower() {
        System.out.println("Groot extends branches to defend friends.");
    }

    public void sayName() {
        System.out.println("I am Groot.");
    }
}
