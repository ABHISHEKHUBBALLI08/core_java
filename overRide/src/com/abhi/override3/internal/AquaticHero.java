package com.abhi.override3.internal;

public class AquaticHero {
    private String name;
    private String power;

    public AquaticHero() {}

    public AquaticHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in AquaticHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Controls water and moves freely underwater.");
    }
}
