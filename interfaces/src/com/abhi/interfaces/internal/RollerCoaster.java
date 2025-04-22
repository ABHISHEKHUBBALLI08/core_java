package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.ThemeParkRide;

public class RollerCoaster implements ThemeParkRide {

    @Override
    public void start() {
        System.out.println("Roller coaster ride starting");
    }

    @Override
    public void stop() {
        System.out.println("Roller coaster ride stopping");
    }

    @Override
    public void maintenanceCheck() {
        System.out.println("Performing maintenance check on roller coaster");
    }
}
