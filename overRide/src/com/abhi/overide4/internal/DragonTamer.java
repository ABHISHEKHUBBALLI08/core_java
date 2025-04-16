package com.abhi.overide4.internal;

public class DragonTamer {
    private String name;
    private String power;

    public DragonTamer() {}

    public DragonTamer(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in DragonTamer");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Dragon Tamer controls fierce dragons.");
    }
}
