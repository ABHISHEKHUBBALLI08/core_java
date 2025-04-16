package com.abhi.override3.internal;

public class Speedster {
    private String name;
    private String power;

    public Speedster() {}

    public Speedster(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Speedster");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Can move at incredible speeds.");
    }
}
