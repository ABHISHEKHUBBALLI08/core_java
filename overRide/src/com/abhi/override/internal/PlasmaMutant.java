package com.abhi.override.internal;

public class PlasmaMutant {
    private String name;
    private String power;

    public PlasmaMutant() {}

    public PlasmaMutant(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in PlasmaMutant");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Releasing unstable energy.");
    }
}
