package com.abhi.override1.internal;

public class BlackWidow extends StealthAgent {
    @Override
    public void usePower() {
        System.out.println("Black Widow uses agility and martial arts to defeat enemies.");
    }

    public void useSting() {
        System.out.println("Black Widow activates her Widow’s Bite electric shock.");
    }
}
