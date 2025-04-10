package com.abhi.override.internal;

public class Rogue extends EnergyAbsorber {
    @Override
    public void usePower() {
        System.out.println("Rogue absorbs someone's powers and memories with a touch.");
    }

    public void mimicFlight() {
        System.out.println("Rogue temporarily gains the ability to fly.");
    }
}
