package com.abhi.accuqization.internal;

public class Shoe extends Accessory {
    public void shoe() {
        System.out.println("running in Shoe");
        Shoe shoe = new Shoe();
        Accessory accessory = new Shoe();
    }
}
