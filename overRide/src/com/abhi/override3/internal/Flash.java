package com.abhi.override3.internal;

public class Flash extends Speedster {
    @Override
    public void usePower() {
        System.out.println("Flash runs faster than light.");
    }

    public void timeTravel() {
        System.out.println("Flash vibrates through time.");
    }
}
