package com.abhi.override1.internal;

public class Hawkeye extends Sharpshooter {
    @Override
    public void usePower() {
        System.out.println("Hawkeye hits targets with deadly precision using his bow.");
    }

    public void fireArrow() {
        System.out.println("Hawkeye fires an explosive arrow.");
    }
}
