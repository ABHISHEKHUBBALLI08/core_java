package com.abhi.override.internal;

public class TrackerMutant {
    private String name;
    private String power;

    public TrackerMutant() {}

    public TrackerMutant(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in TrackerMutant");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Sensing mutant presence from afar.");
    }
}
