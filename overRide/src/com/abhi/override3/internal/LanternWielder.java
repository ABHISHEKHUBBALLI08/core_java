package com.abhi.override3.internal;

public class LanternWielder {
    private String name;
    private String power;

    public LanternWielder() {}

    public LanternWielder(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in LanternWielder");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Uses a power ring fueled by willpower.");
    }
}
