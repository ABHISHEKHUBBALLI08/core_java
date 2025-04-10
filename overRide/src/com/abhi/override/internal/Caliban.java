package com.abhi.override.internal;

public class Caliban extends TrackerMutant {
    @Override
    public void usePower() {
        System.out.println("Caliban locates mutants across vast distances.");
    }

    public void detectFear() {
        System.out.println("Caliban senses fear and emotional states.");
    }
}
