package com.abhi.overide4.internal;

public class MinistryOfficial {
    private String name;
    private String power;

    public MinistryOfficial() {}

    public MinistryOfficial(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in MinistryOfficial");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Ministry Official enforces magical laws.");
    }
}
