package com.abhi.overide4.internal;

public class Animagus {
    private String name;
    private String power;

    public Animagus() {}

    public Animagus(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Animagus");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Animagus can change form.");
    }
}
