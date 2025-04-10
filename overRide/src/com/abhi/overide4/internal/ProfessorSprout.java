package com.abhi.overide4.internal;

public class ProfessorSprout extends Herbologist {
    @Override
    public void usePower() {
        System.out.println("Professor Sprout teaches Herbology at Hogwarts.");
    }

    public void growMandrakes() {
        System.out.println("Sprout grows Mandrakes to save petrified students.");
    }
}
