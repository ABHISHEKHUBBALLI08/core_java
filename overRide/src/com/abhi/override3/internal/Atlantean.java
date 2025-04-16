package com.abhi.override3.internal;

public class Atlantean {
    private String name;
    private String power;

    public Atlantean() {}

    public Atlantean(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Atlantean");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Rules the ocean and breathes underwater.");
    }
}
