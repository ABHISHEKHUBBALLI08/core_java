package com.abhi.override3.internal;

public class Deadshot extends Gunner {
    @Override
    public void usePower() {
        System.out.println("Deadshot never misses a target.");
    }

    public void perfectAim() {
        System.out.println("Deadshot takes the perfect shot.");
    }
}
