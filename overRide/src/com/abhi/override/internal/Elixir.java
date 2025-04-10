package com.abhi.override.internal;

public class Elixir extends Healer {
    @Override
    public void usePower() {
        System.out.println("Elixir rapidly heals allies with golden skin glow.");
    }

    public void cureDisease() {
        System.out.println("Elixir cures a deadly virus instantly.");
    }
}
