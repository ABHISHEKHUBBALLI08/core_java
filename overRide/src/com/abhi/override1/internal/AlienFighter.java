package com.abhi.override1.internal;

public class AlienFighter {
    private String name;
    private String power;

    public AlienFighter() {}

    public AlienFighter(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in AlienFighter");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Engages in physical combat with brute force.");
    }
}
