package com.abhi.override3.internal;

public class Detective {
    private String name;
    private String power;

    public Detective() {}

    public Detective(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Detective");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Highly skilled in investigation.");
    }
}
