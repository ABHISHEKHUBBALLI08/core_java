package com.abhi.override1.internal;

public class WarMachine extends TechPilot {
    @Override
    public void usePower() {
        System.out.println("War Machine deploys heavy firepower in battle.");
    }

    public void fireCannons() {
        System.out.println("War Machine fires shoulder-mounted cannons.");
    }
}
