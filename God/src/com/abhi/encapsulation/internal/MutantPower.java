package com.abhi.encapsulation.internal;

public class MutantPower {
    public void mutations(){
        System.out.println(" mutations brings power to mutants");
        Mutants mutants=new Mutants();
        mutants.setMutantPower("Deadpool");
        mutants.setId(11);
        mutants.setName("wade");
        mutants.setLastName("john");
        mutants.setWeapon("sword");
        mutants.getMutantPower();
        mutants.getId();
        mutants.getLastName();
        mutants.getName();
        mutants.getWeapon();


    }
}
