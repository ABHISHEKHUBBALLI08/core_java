package com.abhi.override.internal;

public class MetalSkinMutant {
    private String name;
    private String power;

    public MetalSkinMutant() {}

    public MetalSkinMutant(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in MetalSkinMutant");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Skin turns into an impenetrable metal.");
    }
}
