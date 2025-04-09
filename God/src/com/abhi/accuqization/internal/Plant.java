package com.abhi.accuqization.internal;

public class Plant extends Thing {
    public void plant() {
        System.out.println("running in Plant");
        Plant plant = new Plant();
        Thing thing = new Plant();
    }
}
