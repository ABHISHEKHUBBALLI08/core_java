package com.abhi.override1.internal;

public class ArmoredHero {
    private String name;
    private String power;

    public ArmoredHero() {}

    public ArmoredHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in ArmoredHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Wearing a suit of advanced armor.");
    }
}
