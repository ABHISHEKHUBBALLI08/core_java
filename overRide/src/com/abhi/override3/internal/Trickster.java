package com.abhi.override3.internal;

public class Trickster {
    private String name;
    private String power;

    public Trickster() {}

    public Trickster(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Trickster");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Creates chaos through deception and mind games.");
    }
}
