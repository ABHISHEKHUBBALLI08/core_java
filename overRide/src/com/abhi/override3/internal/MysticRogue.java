package com.abhi.override3.internal;

public class MysticRogue {
    private String name;
    private String power;

    public MysticRogue() {}

    public MysticRogue(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in MysticRogue");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Uses forbidden magic for good or mischief.");
    }
}
