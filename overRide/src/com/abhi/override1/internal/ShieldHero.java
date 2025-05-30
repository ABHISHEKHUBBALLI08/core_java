package com.abhi.override1.internal;

public class ShieldHero {
    private String name;
    private String power;

    public ShieldHero() {}

    public ShieldHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in ShieldHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Fights with unbreakable shield.");
    }
}
