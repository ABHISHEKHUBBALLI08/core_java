package com.abhi.overide4.internal;

public class GinnyWeasley extends QuidditchPlayer {
    @Override
    public void usePower() {
        System.out.println("Ginny Weasley scores as a Chaser.");
    }

    public void scoreGoal() {
        System.out.println("Ginny scores a brilliant Quidditch goal!");
    }
}
