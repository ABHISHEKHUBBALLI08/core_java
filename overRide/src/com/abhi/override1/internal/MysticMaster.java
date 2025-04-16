package com.abhi.override1.internal;

public class MysticMaster {
    private String name;
    private String power;

    public MysticMaster() {}

    public MysticMaster(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in MysticMaster");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Uses mystical arts for defense and healing.");
    }
}
