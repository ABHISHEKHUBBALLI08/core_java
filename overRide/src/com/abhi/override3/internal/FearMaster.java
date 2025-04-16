package com.abhi.override3.internal;

public class FearMaster {
    private String name;
    private String power;

    public FearMaster() {}

    public FearMaster(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in FearMaster");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Instills fear into enemies to control them.");
    }
}
