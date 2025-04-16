package com.abhi.override.internal;

public class Telepath {
    private String name;
    private String power;

    public Telepath() {}

    public Telepath(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Telepath");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Using telepathic abilities.");
    }
}
