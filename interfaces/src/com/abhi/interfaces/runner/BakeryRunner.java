package com.abhi.interfaces.runner;

import com.abhi.interfaces.rules.FreshBakes;

public class BakeryRunner implements FreshBakes {
    @Override
    public void cake() {
        System.out.println("fresh bakes running in Bakery Runner");
    }
}
