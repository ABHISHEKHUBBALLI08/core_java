package com.abhi.overide4.internal;

public class ProfessorBinns extends Historian {
    @Override
    public void usePower() {
        System.out.println("Professor Binns lectures endlessly on wizard history.");
    }

    public void boreStudents() {
        System.out.println("Binns puts students to sleep with his monotone.");
    }
}
