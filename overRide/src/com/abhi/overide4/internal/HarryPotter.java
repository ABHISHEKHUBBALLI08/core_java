package com.abhi.overide4.internal;

public class HarryPotter extends Wizard {
    @Override
    public void usePower() {
        System.out.println("Harry uses Expelliarmus and other defensive spells.");
    }

    public void summonPatronus() {
        System.out.println("Harry summons a stag Patronus.");
    }
}
