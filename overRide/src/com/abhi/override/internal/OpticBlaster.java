package com.abhi.override.internal;

public class OpticBlaster {
    private String name;
    private String power;

    public OpticBlaster() {}

    public OpticBlaster(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in OpticBlaster");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Firing energy from eyes.");
    }
}
