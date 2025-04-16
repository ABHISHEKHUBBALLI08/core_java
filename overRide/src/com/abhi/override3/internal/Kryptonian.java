package com.abhi.override3.internal;

public class Kryptonian {
    private String name;
    private String power;

    public Kryptonian() {}

    public Kryptonian(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Kryptonian");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Displays incredible super strength.");
    }
}
