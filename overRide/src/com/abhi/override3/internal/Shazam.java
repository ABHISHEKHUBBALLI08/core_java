package com.abhi.override3.internal;

public class Shazam extends Demigod {
    @Override
    public void usePower() {
        System.out.println("Shazam unleashes magical lightning.");
    }

    public void channelLightning() {
        System.out.println("Shazam channels lightning from the gods.");
    }
}
