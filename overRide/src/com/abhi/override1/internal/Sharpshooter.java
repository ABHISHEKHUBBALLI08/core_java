package com.abhi.override1.internal;

public class Sharpshooter {
    private String name;
    private String power;

    public Sharpshooter() {}

    public Sharpshooter(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Sharpshooter");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Exceptional accuracy with ranged weapons.");
    }
}
