package com.abhi.override.internal;

public class SwordFighter {
    private String name;
    private String power;

    public SwordFighter() {}

    public SwordFighter(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in SwordFighter");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Skilled in sword combat.");
    }
}
