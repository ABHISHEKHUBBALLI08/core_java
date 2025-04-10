package com.abhi.overide4.internal;

public class HermioneGranger extends Witch {
    @Override
    public void usePower() {
        System.out.println("Hermione Granger casts a complex spell!");
    }

    public void useTimeTurner() {
        System.out.println("Hermione Granger uses the Time Turner!");
    }
}
