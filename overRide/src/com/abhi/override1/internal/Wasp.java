package com.abhi.override1.internal;

public class Wasp extends InsectHero {
    @Override
    public void usePower() {
        System.out.println("Wasp shrinks and flies using her wings.");
    }

    public void stingAttack() {
        System.out.println("Wasp delivers an electric sting attack.");
    }
}
