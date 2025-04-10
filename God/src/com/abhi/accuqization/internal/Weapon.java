package com.abhi.accuqization.internal;

public class Weapon extends Tool {
    public void weapon() {
        System.out.println("running in Weapon");
        Weapon weapon = new Weapon();
        Tool tool = new Weapon();
    }
}
