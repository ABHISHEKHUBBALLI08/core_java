package com.abhi.overide4.internal;

public class Snape extends PotionMaster {
    @Override
    public void usePower() {
        System.out.println("Snape brews a complex potion silently.");
    }

    public void brewPotion() {
        System.out.println("Snape brews the Draught of Living Death.");
    }
}
