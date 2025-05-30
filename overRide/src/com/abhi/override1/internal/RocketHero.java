package com.abhi.override1.internal;

public class RocketHero {
    private String name;
    private String power;

    public RocketHero() {}

    public RocketHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in RocketHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Specializes in building and firing weapons.");
    }
}
