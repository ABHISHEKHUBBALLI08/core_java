package com.abhi.override3.internal;

public class Joker extends Trickster {
    @Override
    public void usePower() {
        System.out.println("Joker spreads madness and terror.");
    }

    public void causeChaos() {
        System.out.println("Joker unleashes laughing gas in Gotham.");
    }
}
