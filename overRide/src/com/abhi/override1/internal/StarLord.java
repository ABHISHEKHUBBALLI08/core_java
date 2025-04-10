package com.abhi.override1.internal;

public class StarLord extends SpaceWarrior {
    @Override
    public void usePower() {
        System.out.println("Star-Lord uses jet boots and quad blasters.");
    }

    public void playMusic() {
        System.out.println("Star-Lord plays his Walkman before a fight.");
    }
}
