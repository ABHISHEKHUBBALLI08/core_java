package com.abhi.override.internal;

public class StormMonroe extends WeatherController {
    @Override
    public void usePower() {
        System.out.println("Storm Monroe creates a devastating thunderstorm.");
    }

    public void callRain() {
        System.out.println("Storm summons heavy rainfall over the battlefield.");
    }
}
