package com.abhi.override3.internal;

public class Archer {
    private String name;
    private String power;

    public Archer() {}

    public Archer(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Archer");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Master of archery and precision.");
    }
}
