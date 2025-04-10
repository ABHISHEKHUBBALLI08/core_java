package com.abhi.override1.internal;

public class RocketRaccoon extends RocketHero {
    @Override
    public void usePower() {
        System.out.println("Rocket uses high-tech blasters and sharp wit.");
    }

    public void fixMachine() {
        System.out.println("Rocket repairs tech mid-battle.");
    }
}
