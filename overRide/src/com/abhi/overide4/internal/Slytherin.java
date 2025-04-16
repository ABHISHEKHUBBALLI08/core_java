package com.abhi.overide4.internal;

public class Slytherin {
    private String name;
    private String power;

    public Slytherin() {}

    public Slytherin(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Slytherin");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Slytherin uses ambition and cunning.");
    }
}
