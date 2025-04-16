package com.abhi.overide4.internal;

public class Wizard {
    private String name;
    private String power;

    public Wizard() {}

    public Wizard(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Wizard");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Casts magical spells with a wand.");
    }
}
