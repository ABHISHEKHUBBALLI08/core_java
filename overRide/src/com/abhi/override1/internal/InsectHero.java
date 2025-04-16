package com.abhi.override1.internal;

public class InsectHero {
    private String name;
    private String power;

    public InsectHero() {}

    public InsectHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in InsectHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Has the ability to shrink in size.");
    }
}
