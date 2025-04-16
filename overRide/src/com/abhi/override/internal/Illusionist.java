package com.abhi.override.internal;

public class Illusionist {
    private String name;
    private String power;

    public Illusionist() {}

    public Illusionist(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Illusionist");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Casting simple visual illusions.");
    }
}
