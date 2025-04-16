package com.abhi.override1.internal;

public class SuperSoldier {
    private String name;
    private String power;

    public SuperSoldier() {}

    public SuperSoldier(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in SuperSoldier");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Enhanced strength, speed, and endurance.");
    }
}
