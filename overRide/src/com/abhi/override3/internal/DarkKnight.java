package com.abhi.override3.internal;

public class DarkKnight {
    private String name;
    private String power;

    public DarkKnight() {}

    public DarkKnight(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in DarkKnight");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }
    public void usePower() {
        System.out.println("Uses gadgets and martial arts to fight crime.");
    }
}
