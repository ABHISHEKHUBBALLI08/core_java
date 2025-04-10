package com.abhi.override3.internal;

public class Firestorm extends ElementalHero {
    @Override
    public void usePower() {
        System.out.println("Firestorm fuses atoms to create energy.");
    }

    public void atomicBlast() {
        System.out.println("Firestorm releases a massive atomic blast.");
    }
}
