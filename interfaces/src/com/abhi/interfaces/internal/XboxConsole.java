package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.GameConsole;

public class XboxConsole implements GameConsole {

    @Override
    public void start() {
        System.out.println("Starting game on Xbox");
    }

    @Override
    public void pause() {
        System.out.println("Pausing game on Xbox");
    }

    @Override
    public void save() {
        System.out.println("Saving game on Xbox");
    }
}
