package com.abhi.override1.internal;

public class GeniusScientist {
    private String name;
    private String power;

    public GeniusScientist() {}

    public GeniusScientist(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in GeniusScientist");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Possesses a brilliant scientific mind.");
    }
}
