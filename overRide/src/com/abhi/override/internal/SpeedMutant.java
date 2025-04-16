package com.abhi.override.internal;

public class SpeedMutant {
    private String name;
    private String power;

    public SpeedMutant() {}

    public SpeedMutant(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in SpeedMutant");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Moving at enhanced speed.");
    }
}
