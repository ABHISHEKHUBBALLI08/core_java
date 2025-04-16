package com.abhi.override1.internal;

public class TechPilot {
    private String name;
    private String power;

    public TechPilot() {}

    public TechPilot(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in TechPilot");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Operates high-tech combat machinery.");
    }
}
