package com.abhi.overide4.internal;

public class Caretaker {
    private String name;
    private String power;

    public Caretaker() {}

    public Caretaker(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Caretaker");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Caretaker watches over the school grounds.");
    }
}
