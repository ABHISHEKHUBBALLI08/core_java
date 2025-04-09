package com.abhi.accuqization.external;

import com.abhi.accuqization.internal.Light;

public class Led extends Light {
    public void led() {
        System.out.println("running in LED");
        Led led = new Led();
        Light light = new Led();
    }
}
