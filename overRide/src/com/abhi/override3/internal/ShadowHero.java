package com.abhi.override3.internal;

public class ShadowHero {
    private String name;
    private String power;

    public ShadowHero() {}

    public ShadowHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in ShadowHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Harnesses the power of darkness.");
    }
}
