package com.abhi.override3.internal;

public class KillerFrost extends IceController {
    @Override
    public void usePower() {
        System.out.println("Killer Frost uses cryokinetic abilities.");
    }

    public void freezeEnemy() {
        System.out.println("Killer Frost freezes her enemy solid.");
    }
}
