package com.abhi.override.internal;

public class MagnetismMaster {
    private String name;
    private String power;

    public MagnetismMaster() {}

    public MagnetismMaster(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in MagnetismMaster");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Controlling magnetic fields.");
    }
}
