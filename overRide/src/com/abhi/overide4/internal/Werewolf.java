package com.abhi.overide4.internal;

public class Werewolf {
    private String name;
    private String power;

    public Werewolf() {}

    public Werewolf(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in Werewolf");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Werewolf howls at the moon.");
    }
}
