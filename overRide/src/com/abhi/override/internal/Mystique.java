package com.abhi.override.internal;

public class Mystique extends Shapeshifter {
    @Override
    public void usePower() {
        System.out.println("Mystique morphs into an exact copy of her target.");
    }

    public void stealthAttack() {
        System.out.println("Mystique launches a surprise attack in disguise.");
    }
}
