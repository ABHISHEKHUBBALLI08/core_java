package com.abhi.override.internal;

public class Domino extends ShadowMutant {
    @Override
    public void usePower() {
        System.out.println("Domino alters luck to survive impossible odds.");
    }

    public void takeRisk() {
        System.out.println("Domino takes a risky move and everything works out.");
    }
}
