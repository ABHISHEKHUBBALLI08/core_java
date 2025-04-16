package com.abhi.override1.internal;

public class WakandanHero {
    private String name;
    private String power;

    public WakandanHero() {}

    public WakandanHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in WakandanHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Utilizes advanced Vibranium technology.");
    }
}
