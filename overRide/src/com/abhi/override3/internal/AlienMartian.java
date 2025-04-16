package com.abhi.override3.internal;

public class AlienMartian {
    private String name;
    private String power;

    public AlienMartian() {}

    public AlienMartian(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in AlienMartian");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Alien with telepathy and shapeshifting.");
    }
}
