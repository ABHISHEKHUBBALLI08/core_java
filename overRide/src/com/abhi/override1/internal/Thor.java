package com.abhi.override1.internal;

public class Thor extends Asgardian {
    @Override
    public void usePower() {
        System.out.println("Thor summons lightning with Mjölnir.");
    }

    public void callLightning() {
        System.out.println("Thor strikes enemies with a bolt of lightning.");
    }
}
