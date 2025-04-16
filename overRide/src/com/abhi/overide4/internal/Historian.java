package com.abhi.overide4.internal;

public class Historian {
    private String name;
    private String power;

    public Historian() {}

    public Historian(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Historian");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Historian preserves magical history.");
    }
}
