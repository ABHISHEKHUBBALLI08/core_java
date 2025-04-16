package com.abhi.override3.internal;

public class Demigod {
    private String name;
    private String power;

    public Demigod() {}

    public Demigod(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Demigod");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Channels divine strength and powers.");
    }
}
