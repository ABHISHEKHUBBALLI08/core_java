package com.abhi.override1.internal;

public class CaptainAmerica1 extends ShieldHero {
    @Override
    public void usePower() {
        System.out.println("Captain America defends justice with his Vibranium shield.");
    }

    public void throwShield() {
        System.out.println("Captain America throws his shield with perfect aim.");
    }
}
