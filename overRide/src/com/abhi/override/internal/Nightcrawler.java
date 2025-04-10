package com.abhi.override.internal;

public class Nightcrawler extends TeleportingMutant {
    @Override
    public void usePower() {
        System.out.println("Nightcrawler teleports in a puff of blue smoke.");
    }

    public void shadowStrike() {
        System.out.println("Nightcrawler teleports behind the enemy and strikes.");
    }
}
