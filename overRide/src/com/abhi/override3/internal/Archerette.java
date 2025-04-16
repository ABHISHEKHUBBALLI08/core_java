package com.abhi.override3.internal;

public class Archerette {
    private String name;
    private String power;

    public Archerette() {}

    public Archerette(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Archerette");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Expert markswoman with a bow.");
    }
}
