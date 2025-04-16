package com.abhi.override3.internal;

public class Magician {
    private String name;
    private String power;

    public Magician() {}

    public Magician(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Magician");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Performs magical feats using incantations.");
    }
}
