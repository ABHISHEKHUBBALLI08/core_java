package com.abhi.overide4.internal;

public class Headmaster {
    private String name;
    private String power;

    public Headmaster() {}

    public Headmaster(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Headmaster");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Headmaster maintains order at Hogwarts.");
    }
}
