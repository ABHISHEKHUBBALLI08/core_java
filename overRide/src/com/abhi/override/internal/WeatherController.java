package com.abhi.override.internal;

public class WeatherController {
    private String name;
    private String power;

    public WeatherController() {}

    public WeatherController(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in WeatherController");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Manipulating atmospheric conditions.");
    }
}
