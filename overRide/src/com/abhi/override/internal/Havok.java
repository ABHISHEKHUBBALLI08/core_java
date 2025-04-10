package com.abhi.override.internal;

public class Havok extends PlasmaMutant {
    @Override
    public void usePower() {
        System.out.println("Havok unleashes a focused blast of plasma from his chest.");
    }

    public void energyBurst() {
        System.out.println("Havok emits a circular wave of explosive plasma.");
    }
}
