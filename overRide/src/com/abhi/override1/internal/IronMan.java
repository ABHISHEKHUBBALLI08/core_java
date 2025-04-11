package com.abhi.override1.internal;

public class IronMan extends ArmoredHero {
    @Override
    public void usePower() {

        System.out.println("Iron Man uses his suit’s repulsor beams and flight systems.");
    }

    public void launchMissiles()
    {
        System.out.println("Iron Man launches mini missiles from his suit.");
    }
}
