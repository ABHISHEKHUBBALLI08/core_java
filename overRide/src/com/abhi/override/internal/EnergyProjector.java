package com.abhi.override.internal;

public class EnergyProjector {
    private String name;
    private String power;

    public EnergyProjector() {}

    public EnergyProjector(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in EnergyProjector");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Releasing stored energy as a blast.");
    }
}
