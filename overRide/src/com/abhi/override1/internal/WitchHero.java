package com.abhi.override1.internal;

public class WitchHero {
    private String name;
    private String power;

    public WitchHero() {}

    public WitchHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in WitchHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Uses magical powers for protection and attack.");
    }
}
