package com.abhi.override.internal;

public class ShadowMutant {
    private String name;
    private String power;

    public ShadowMutant() {}

    public ShadowMutant(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in ShadowMutant");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Influencing probability in unpredictable ways.");
    }
}
