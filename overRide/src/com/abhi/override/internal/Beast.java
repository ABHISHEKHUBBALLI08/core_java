package com.abhi.override.internal;

public class Beast extends BeastMutant {
    @Override
    public void usePower() {
        System.out.println("Beast demonstrates superhuman intellect and acrobatics.");
    }

    public void readInMidAir() {
        System.out.println("Beast flips mid-air while reading a science journal.");
    }
}
