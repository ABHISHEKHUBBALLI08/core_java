package com.abhi.override3.internal;

public class Batman extends DarkKnight {
    @Override
    public void usePower() {
        System.out.println("Batman uses advanced gadgets and intellect.");
    }

    public void vanish() {
        System.out.println("Batman disappears into the shadows.");
    }
}
