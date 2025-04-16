package com.abhi.overide4.internal;

public class DarkLord {
    private String name;
    private String power;

    public DarkLord() {}

    public DarkLord(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in DarkLord");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Dark Lord radiates dark magic.");
    }
}
