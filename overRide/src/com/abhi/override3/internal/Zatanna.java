package com.abhi.override3.internal;

public class Zatanna extends Magician {
    @Override
    public void usePower() {
        System.out.println("Zatanna casts spells speaking backward.");
    }

    public void castSpell() {
        System.out.println("Zatanna enchants objects with magic.");
    }
}
