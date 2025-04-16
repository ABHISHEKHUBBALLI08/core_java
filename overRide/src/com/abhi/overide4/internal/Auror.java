package com.abhi.overide4.internal;

public class Auror {
    private String name;
    private String power;

    public Auror() {}

    public Auror(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Auror");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Auror defends against dark magic.");
    }
}
