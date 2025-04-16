package com.abhi.overide4.internal;

public class Giant {
    private String name;
    private String power;

    public Giant() {}

    public Giant(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Giant");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Giant shows brute strength.");
    }
}
