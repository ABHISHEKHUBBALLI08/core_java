package com.abhi.override3.internal;

public class AntiHero {
    private String name;
    private String power;

    public AntiHero() {}

    public AntiHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in AntiHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Fights for justice using unorthodox methods.");
    }
}
