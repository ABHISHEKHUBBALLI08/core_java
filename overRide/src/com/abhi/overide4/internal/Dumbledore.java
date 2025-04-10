package com.abhi.overide4.internal;

public class Dumbledore extends Headmaster {
    @Override
    public void usePower() {
        System.out.println("Dumbledore casts powerful spells with wisdom.");
    }

    public void useElderWand() {
        System.out.println("Dumbledore wields the Elder Wand!");
    }
}
