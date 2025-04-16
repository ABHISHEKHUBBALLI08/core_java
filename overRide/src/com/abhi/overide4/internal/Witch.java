package com.abhi.overide4.internal;

public class Witch {
    private String name;
    private String power;

    public Witch() {}

    public Witch(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Witch");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Witch casts a basic charm.");
    }
}
