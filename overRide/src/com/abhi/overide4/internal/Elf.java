package com.abhi.overide4.internal;

public class Elf {
    private String name;
    private String power;

    public Elf() {}

    public Elf(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Elf");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Elf uses house-elf magic.");
    }
}
