package com.abhi.override3.internal;

public class Raven extends ShadowHero {
    @Override
    public void usePower() {
        System.out.println("Raven taps into her dark energy.");
    }

    public void useDarkness() {
        System.out.println("Raven casts a shadow burst.");
    }
}
