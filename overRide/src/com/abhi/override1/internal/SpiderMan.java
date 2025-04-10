package com.abhi.override1.internal;

public class SpiderMan extends SpiderHero {
    @Override
    public void usePower() {
        System.out.println("Spider-Man swings across the city and sticks to walls.");
    }

    public void webShoot() {
        System.out.println("Spider-Man shoots web from his web-shooters.");
    }
}
