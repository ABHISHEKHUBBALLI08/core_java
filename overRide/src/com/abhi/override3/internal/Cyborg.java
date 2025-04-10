package com.abhi.override3.internal;

public class Cyborg extends TechExpert {
    @Override
    public void usePower() {
        System.out.println("Cyborg uses his cybernetic weapons.");
    }

    public void fireCannon() {
        System.out.println("Cyborg fires a plasma cannon.");
    }
}
