package com.abhi.overide4.internal;

public class PotionMaster {
    private String name;
    private String power;

    public PotionMaster() {}

    public PotionMaster(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in PotionMaster");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Potion Master prepares powerful potions.");
    }
}
