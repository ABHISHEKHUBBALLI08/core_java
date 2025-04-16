package com.abhi.override3.internal;

public class BeastHero {
    private String name;
    private String power;

    public BeastHero() {}

    public BeastHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in BeastHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Can take the form of various beasts.");
    }
}
