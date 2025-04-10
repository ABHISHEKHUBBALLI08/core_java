package com.abhi.override.internal;

public class Magik extends MagicUser {
    @Override
    public void usePower() {
        System.out.println("Magik uses dark magic and teleports through Limbo.");
    }

    public void summonSoulSword() {
        System.out.println("Magik summons her Soul Sword for battle.");
    }
}
