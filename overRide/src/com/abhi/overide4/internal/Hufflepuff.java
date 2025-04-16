package com.abhi.overide4.internal;

public class Hufflepuff {
    private String name;
    private String power;

    public Hufflepuff() {}

    public Hufflepuff(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Hufflepuff");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Hufflepuff shows loyalty and patience.");
    }
}
