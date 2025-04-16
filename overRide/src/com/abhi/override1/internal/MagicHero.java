package com.abhi.override1.internal;

public class MagicHero {
    private String name;
    private String power;

    public MagicHero() {}

    public MagicHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in MagicHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Harnesses magical energy for deception and attack.");
    }
}
