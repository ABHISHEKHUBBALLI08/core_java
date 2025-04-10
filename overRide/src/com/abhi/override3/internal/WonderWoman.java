package com.abhi.override3.internal;

public class WonderWoman extends Amazonian {
    @Override
    public void usePower() {
        System.out.println("Wonder Woman wields her shield and Lasso of Truth.");
    }

    public void useLasso() {
        System.out.println("Wonder Woman uses the Lasso of Truth.");
    }
}
