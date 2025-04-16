package com.abhi.override1.internal;

public class SpaceWarrior {
    private String name;
    private String power;

    public SpaceWarrior() {}

    public SpaceWarrior(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in SpaceWarrior");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Fights galactic enemies with skill and gadgets.");
    }
}
