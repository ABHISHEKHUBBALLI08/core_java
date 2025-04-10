package com.abhi.override1.internal;

public class AntMan extends ShrinkHero {
    @Override
    public void usePower() {
        System.out.println("Ant-Man shrinks and grows at will during combat.");
    }

    public void rideAnt() {
        System.out.println("Ant-Man rides a flying ant for transport.");
    }
}
