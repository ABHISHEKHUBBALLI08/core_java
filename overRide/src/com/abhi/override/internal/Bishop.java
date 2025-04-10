package com.abhi.override.internal;

public class Bishop extends EnergyProjector {
    @Override
    public void usePower() {
        System.out.println("Bishop absorbs and redirects energy attacks.");
    }

    public void chargeRifle() {
        System.out.println("Bishop charges his energy rifle to full capacity.");
    }
}
