package com.abhi.override.internal;

public class EnergyAbsorber {
    private String name;
    private String power;

    public EnergyAbsorber() {}

    public EnergyAbsorber(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in EnergyAbsorber");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Absorbing powers through physical contact.");
    }
}
