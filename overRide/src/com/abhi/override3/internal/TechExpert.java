package com.abhi.override3.internal;

public class TechExpert {
    private String name;
    private String power;

    public TechExpert() {}

    public TechExpert(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in TechExpert");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Utilizes high-tech enhancements.");
    }
}
