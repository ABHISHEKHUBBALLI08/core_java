package com.abhi.overide4.internal;

public class GilderoyLockhart extends DuelMaster {
    @Override
    public void usePower() {
        System.out.println("Gilderoy Lockhart takes credit for others’ achievements.");
    }

    public void eraseMemory() {
        System.out.println("Lockhart tries to erase memories with a faulty charm.");
    }
}
