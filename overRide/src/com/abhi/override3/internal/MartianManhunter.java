package com.abhi.override3.internal;

public class MartianManhunter extends AlienMartian {
    @Override
    public void usePower() {
        System.out.println("Martian Manhunter uses telepathy and intangibility.");
    }

    public void shapeShift() {
        System.out.println("Martian Manhunter transforms into another form.");
    }
}
