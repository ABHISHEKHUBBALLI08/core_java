package com.abhi.override1.internal;

public class SpyAgent {
    private String name;
    private String power;

    public SpyAgent() {}

    public SpyAgent(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in SpyAgent");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Executes stealth operations with precision.");
    }
}
