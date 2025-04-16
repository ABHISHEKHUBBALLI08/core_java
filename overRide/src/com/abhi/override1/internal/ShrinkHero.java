package com.abhi.override1.internal;

public class ShrinkHero {
    private String name;
    private String power;

    public ShrinkHero() {}

    public ShrinkHero(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in ShrinkHero");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Can shrink to a tiny size using Pym particles.");
    }
}
