package com.abhi.override1.internal;

public class CaptainAmerica extends SuperSoldier {
    @Override
    public void usePower() {
        System.out.println("Captain America uses his shield with superhuman agility.");
    }

    public void throwShield() {
        System.out.println("Captain America throws his vibranium shield with precision.");
    }
}
