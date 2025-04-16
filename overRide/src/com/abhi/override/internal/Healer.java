package com.abhi.override.internal;

public class Healer {
    private String name;
    private String power;

    public Healer() {}

    public Healer(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Healer");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Performing biological regeneration.");
    }
}
