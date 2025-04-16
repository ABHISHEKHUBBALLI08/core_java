package com.abhi.override1.internal;

public class GeniusKid {
    private String name;
    private String power;

    public GeniusKid() {}

    public GeniusKid(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in GeniusKid");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Invents futuristic technology at a young age.");
    }
}
