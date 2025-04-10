package com.abhi.override.internal;

public class KittyPryde extends Phaser {
    @Override
    public void usePower() {
        System.out.println("Kitty Pryde walks through walls effortlessly.");
    }

    public void phaseOthers() {
        System.out.println("Kitty takes someone with her through a wall.");
    }
}
