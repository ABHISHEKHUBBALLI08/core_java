package com.abhi.override.internal;

public class TimeManipulator {
    private String name;
    private String power;

    public TimeManipulator() {}

    public TimeManipulator(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in TimeManipulator");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Altering timelines and temporal flow.");
    }
}
