package com.abhi.override3.internal;

public class RobotFighter {
    private String name;
    private String power;

    public RobotFighter() {}

    public RobotFighter(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in RobotFighter");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Engages in battles using robotic power.");
    }
}
