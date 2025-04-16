package com.abhi.override3.internal;

public class IceController {
    private String name;
    private String power;

    public IceController() {}

    public IceController(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in IceController");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Controls and manipulates ice and cold.");
    }
}
