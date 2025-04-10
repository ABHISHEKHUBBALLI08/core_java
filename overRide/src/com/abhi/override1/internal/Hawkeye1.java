package com.abhi.override1.internal;

public class Hawkeye1 extends BowExpert {
    @Override
    public void usePower() {
        System.out.println("Hawkeye fires trick arrows with pinpoint accuracy.");
    }

    public void aimTarget() {
        System.out.println("Hawkeye locks onto his target.");
    }
}
