package com.abhi.override1.internal;

public class WakandanWarrior {
    private String name;
    private String power;

    public WakandanWarrior() {}

    public WakandanWarrior(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in WakandanWarrior");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Defends Wakanda using agility and tradition.");
    }
}
