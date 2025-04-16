package com.abhi.override3.internal;

public class TelekineticHero {
    private String name;
    private String power;

    public TelekineticHero() {}

    public TelekineticHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in TelekineticHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Moves objects with the power of the mind.");
    }
}
