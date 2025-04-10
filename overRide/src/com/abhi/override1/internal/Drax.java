package com.abhi.override1.internal;

public class Drax extends AlienFighter {
    @Override
    public void usePower() {
        System.out.println("Drax uses raw strength and blades to fight.");
    }

    public void takeRevenge() {
        System.out.println("Drax seeks vengeance for his family.");
    }
}
