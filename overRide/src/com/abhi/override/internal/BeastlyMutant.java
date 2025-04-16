package com.abhi.override.internal;

public class BeastlyMutant {
    private String name;
    private String power;

    public BeastlyMutant() {}

    public BeastlyMutant(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in BeastlyMutant");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Using enhanced strength and agility.");
    }
}
