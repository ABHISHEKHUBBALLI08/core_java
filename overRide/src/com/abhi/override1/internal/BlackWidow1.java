package com.abhi.override1.internal;

public class BlackWidow1 extends SpyAgent {
    @Override
    public void usePower() {
        System.out.println("Black Widow uses agility and gadgets in combat.");
    }

    public void performTakedown() {
        System.out.println("Black Widow performs a signature takedown move.");
    }
}
