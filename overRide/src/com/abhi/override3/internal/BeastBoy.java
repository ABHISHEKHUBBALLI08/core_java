package com.abhi.override3.internal;

public class BeastBoy extends BeastHero {
    @Override
    public void usePower() {
        System.out.println("Beast Boy transforms into animals.");
    }

    public void transformAnimal() {
        System.out.println("Beast Boy becomes a tiger.");
    }
}
