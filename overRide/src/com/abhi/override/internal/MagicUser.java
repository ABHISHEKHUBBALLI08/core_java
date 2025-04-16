package com.abhi.override.internal;

public class MagicUser {
    private String name;
    private String power;

    public MagicUser() {}

    public MagicUser(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in MagicUser");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Harnessing mystical energy.");
    }
}
