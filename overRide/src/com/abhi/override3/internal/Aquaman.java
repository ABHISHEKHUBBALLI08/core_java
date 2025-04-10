package com.abhi.override3.internal;

public class Aquaman extends Atlantean {
    @Override
    public void usePower() {
        System.out.println("Aquaman commands the seas with his trident.");
    }

    public void summonSeaCreatures() {
        System.out.println("Aquaman summons sea creatures for help.");
    }
}
