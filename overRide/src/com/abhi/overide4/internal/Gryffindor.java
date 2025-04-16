package com.abhi.overide4.internal;

public class Gryffindor {
    private String name;
    private String power;

    public Gryffindor() {}

    public Gryffindor(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Gryffindor");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Gryffindor shows courage and strength.");
    }
}
