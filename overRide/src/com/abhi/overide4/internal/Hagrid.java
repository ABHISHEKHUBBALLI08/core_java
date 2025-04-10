package com.abhi.overide4.internal;

public class Hagrid extends Giant {
    @Override
    public void usePower() {
        System.out.println("Hagrid gently handles magical creatures.");
    }

    public void tameCreatures() {
        System.out.println("Hagrid tames a dangerous beast.");
    }
}
