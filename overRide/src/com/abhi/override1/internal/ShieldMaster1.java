package com.abhi.override1.internal;

public class ShieldMaster1 {
    private String name;
    private String power;

    public ShieldMaster1() {}

    public ShieldMaster1(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in ShieldMaster1");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Fights with a strong sense of justice and defense.");
    }
}
