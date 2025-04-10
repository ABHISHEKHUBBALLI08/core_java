package com.abhi.overide4.internal;

public class Filch extends Caretaker {
    @Override
    public void usePower() {
        System.out.println("Filch patrols the corridors with Mrs. Norris.");
    }

    public void cleanCastle() {
        System.out.println("Filch cleans the castle angrily.");
    }
}
