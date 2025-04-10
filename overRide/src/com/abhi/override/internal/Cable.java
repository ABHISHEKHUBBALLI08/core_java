package com.abhi.override.internal;

public class Cable extends TimeManipulator {
    @Override
    public void usePower() {
        System.out.println("Cable travels back in time to prevent future wars.");
    }

    public void activateTechWeapon() {
        System.out.println("Cable activates his futuristic plasma rifle.");
    }
}
