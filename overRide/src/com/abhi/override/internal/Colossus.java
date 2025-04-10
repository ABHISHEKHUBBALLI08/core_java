package com.abhi.override.internal;

public class Colossus extends MetalSkinMutant {
    @Override
    public void usePower() {
        System.out.println("Colossus transforms into organic steel.");
    }

    public void punchGround() {
        System.out.println("Colossus slams the ground causing shockwaves.");
    }
}
