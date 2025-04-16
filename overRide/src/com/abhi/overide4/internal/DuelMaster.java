package com.abhi.overide4.internal;

public class DuelMaster {
    private String name;
    private String power;

    public DuelMaster() {}

    public DuelMaster(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in DuelMaster");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Duel Master excels in wizard duels.");
    }
}
