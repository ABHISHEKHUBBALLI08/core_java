package com.abhi.override.internal;

public class Forge extends WeatherMutant {
    @Override
    public void usePower() {
        System.out.println("Forge manipulates technology to affect the environment.");
    }

    public void inventWeapon() {
        System.out.println("Forge instantly builds a custom weapon using advanced tech.");
    }
}
