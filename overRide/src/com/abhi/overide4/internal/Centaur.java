package com.abhi.overide4.internal;

public class Centaur {
    private String name;
    private String power;

    public Centaur() {}

    public Centaur(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Centaur");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Centaur reads celestial movements.");
    }
}
