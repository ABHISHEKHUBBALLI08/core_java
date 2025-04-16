package com.abhi.override1.internal;

public class Asgardian {
    private String name;
    private String power;

    public Asgardian() {}

    public Asgardian(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Asgardian");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Harnessing god-like strength.");
    }
}
