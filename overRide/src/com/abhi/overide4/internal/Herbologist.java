package com.abhi.overide4.internal;

public class Herbologist {
    private String name;
    private String power;

    public Herbologist() {}

    public Herbologist(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Herbologist");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Herbologist cultivates magical plants.");
    }
}
