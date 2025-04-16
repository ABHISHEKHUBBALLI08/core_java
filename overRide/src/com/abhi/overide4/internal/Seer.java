package com.abhi.overide4.internal;

public class Seer {
    private String name;
    private String power;

    public Seer() {}

    public Seer(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Seer");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Seer sees glimpses of the future.");
    }
}
