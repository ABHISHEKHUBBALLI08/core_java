package com.abhi.override1.internal;

public class AndroidAvenger {
    private String name;
    private String power;

    public AndroidAvenger() {}

    public AndroidAvenger(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in AndroidAvenger");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:" + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Functions as a powerful android.");
    }
}
