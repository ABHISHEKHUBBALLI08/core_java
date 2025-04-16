package com.abhi.overide4.internal;

public class Ravenclaw {
    private String name;
    private String power;

    public Ravenclaw() {}

    public Ravenclaw(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Ravenclaw");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Ravenclaw uses intelligence and logic.");
    }
}
