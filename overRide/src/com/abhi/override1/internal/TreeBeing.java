package com.abhi.override1.internal;

public class TreeBeing {
    private String name;
    private String power;

    public TreeBeing() {}

    public TreeBeing(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in TreeBeing");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Controls tree-like limbs for combat.");
    }
}
