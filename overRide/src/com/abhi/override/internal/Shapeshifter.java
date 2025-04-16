package com.abhi.override.internal;

public class Shapeshifter {
    private String name;
    private String power;

    public Shapeshifter() {}

    public Shapeshifter(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Shapeshifter");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Changing physical appearance.");
    }
}
