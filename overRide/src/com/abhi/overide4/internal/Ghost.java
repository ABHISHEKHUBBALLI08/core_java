package com.abhi.overide4.internal;

public class Ghost {
    private String name;
    private String power;

    public Ghost() {}

    public Ghost(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Ghost");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Ghost drifts silently through walls.");
    }
}
