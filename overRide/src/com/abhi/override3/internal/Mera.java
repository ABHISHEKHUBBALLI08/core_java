package com.abhi.override3.internal;

public class Mera extends AquaticHero {
    @Override
    public void usePower() {
        System.out.println("Mera uses hydrokinesis to shape water.");
    }

    public void controlWater() {
        System.out.println("Mera controls and shapes water offensively.");
    }
}
