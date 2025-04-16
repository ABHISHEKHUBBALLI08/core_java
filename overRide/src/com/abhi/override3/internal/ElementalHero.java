package com.abhi.override3.internal;

public class ElementalHero {
    private String name;
    private String power;

    public ElementalHero() {}

    public ElementalHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in ElementalHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Manipulates elemental forces for attack.");
    }
}
