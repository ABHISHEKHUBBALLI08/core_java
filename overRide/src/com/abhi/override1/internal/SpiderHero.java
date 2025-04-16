package com.abhi.override1.internal;

public class SpiderHero {
    private String name;
    private String power;

    public SpiderHero() {}

    public SpiderHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in SpiderHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Possesses spider-like agility and reflexes.");
    }
}
