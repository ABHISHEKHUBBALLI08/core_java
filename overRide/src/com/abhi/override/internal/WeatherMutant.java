package com.abhi.override.internal;

public class WeatherMutant {
    private String name;
    private String power;

    public WeatherMutant() {}

    public WeatherMutant(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in WeatherMutant");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Interacting with atmospheric conditions.");
    }
}
