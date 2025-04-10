package com.abhi.overide4.internal;

public class Lupin extends Werewolf {
    @Override
    public void usePower() {
        System.out.println("Lupin controls his transformation.");
    }

    public void transformAtFullMoon() {
        System.out.println("Lupin transforms into a werewolf at full moon.");
    }
}
