package com.abhi.accuqization.internal;

public class SideDish extends Dish {
    public void sideDish() {
        System.out.println("running in SideDish");
        SideDish sidedish = new SideDish();
        Dish dish = new SideDish();
    }
}
