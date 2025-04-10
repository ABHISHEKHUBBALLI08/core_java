package com.abhi.override3.internal;

public class GreenLantern extends LanternWielder {
    @Override
    public void usePower() {
        System.out.println("Green Lantern creates constructs with willpower.");
    }

    public void createConstructs() {
        System.out.println("Green Lantern forms a shield with the ring.");
    }
}
