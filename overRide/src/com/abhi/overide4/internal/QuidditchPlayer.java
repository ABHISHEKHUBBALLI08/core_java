package com.abhi.overide4.internal;

public class QuidditchPlayer {
    private String name;
    private String power;

    public QuidditchPlayer() {}

    public QuidditchPlayer(String name, String power) {
        this.name = name;
        this.power = power;
        System.out.println("arg constructor running in QuidditchPlayer");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name: " + this.name + " power: " + this.power;
    }

    public void usePower() {
        System.out.println("Quidditch Player flies on a broom.");
    }
}
