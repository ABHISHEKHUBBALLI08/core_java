package com.abhi.override.internal;

public class PhoenixHost {
    private String name;
    private String power;

    public PhoenixHost() {}

    public PhoenixHost(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in PhoenixHost");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Harnessing the power of the Phoenix Force.");
    }
}
