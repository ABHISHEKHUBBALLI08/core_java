package com.abhi.override.internal;

public class SilverSamurai extends SwordFighter {
    @Override
    public void usePower() {
        System.out.println("Silver Samurai uses a tachyon-charged katana.");
    }

    public void teleportWithArmor() {
        System.out.println("Silver Samurai teleports while armored.");
    }
}
