package com.abhi.override3.internal;

public class GreenArrow extends Archer {
    @Override
    public void usePower() {
        System.out.println("Green Arrow uses trick arrows to fight crime.");
    }

    public void shootArrow() {
        System.out.println("Green Arrow shoots a grappling arrow.");
    }
}
