package com.abhi.override1.internal;

public class Loki extends MagicHero {
    @Override
    public void usePower() {
        System.out.println("Loki uses sorcery and illusion to confuse enemies.");
    }

    public void createClone() {
        System.out.println("Loki creates multiple illusionary clones.");
    }
}
