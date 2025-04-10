package com.abhi.override3.internal;

public class Scarecrow extends FearMaster {
    @Override
    public void usePower() {
        System.out.println("Scarecrow uses fear gas to manipulate minds.");
    }

    public void spreadFearGas() {
        System.out.println("Scarecrow releases toxic fear gas.");
    }
}
