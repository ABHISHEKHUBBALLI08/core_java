package com.abhi.override.internal;

public class TeleportingMutant {
    private String name;
    private String power;

    public TeleportingMutant() {}

    public TeleportingMutant(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in TeleportingMutant");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Teleporting to a short distance.");
    }
}
