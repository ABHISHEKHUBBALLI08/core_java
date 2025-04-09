package com.abhi.accuqization.external;

import com.abhi.accuqization.internal.Plant;
import com.abhi.accuqization.internal.Thing;

public class Cactus extends Plant {
    public void cactus() {
        System.out.println("running in Cactus");
        Cactus cactus = new Cactus();
        Plant plant = new Cactus();
        Thing thing = new Cactus();
    }
}
