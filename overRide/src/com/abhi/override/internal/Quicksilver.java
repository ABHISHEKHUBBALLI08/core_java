package com.abhi.override.internal;

public class Quicksilver extends SpeedMutant {
    @Override
    public void usePower() {
        System.out.println("Quicksilver runs faster than the eye can see.");
    }

    public void slowTimeEffect() {
        System.out.println("Everything appears in slow motion to Quicksilver.");
    }
}
