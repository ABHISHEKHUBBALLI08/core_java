package com.abhi.override3.internal;

public class Gunner {
    private String name;
    private String power;

    public Gunner() {}

    public Gunner(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Gunner");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Expert in ranged weapons and marksmanship.");
    }
}
