package com.abhi.override3.internal;

public class Amazonian {
    private String name;
    private String power;

    public Amazonian() {}

    public Amazonian(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Amazonian");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Possesses superhuman strength and agility.");
    }
}
