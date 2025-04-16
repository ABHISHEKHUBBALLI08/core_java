package com.abhi.override1.internal;

public class StealthAgent {
    private String name;
    private String power;

    public StealthAgent() {}

    public StealthAgent(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in StealthAgent");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Expert in espionage and stealth operations.");
    }
}
