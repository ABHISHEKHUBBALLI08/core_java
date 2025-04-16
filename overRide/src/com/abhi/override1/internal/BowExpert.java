package com.abhi.override1.internal;

public class BowExpert {
    private String name;
    private String power;

    public BowExpert() {}

    public BowExpert(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in BowExpert");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Uses precision archery in battle.");
    }
}
