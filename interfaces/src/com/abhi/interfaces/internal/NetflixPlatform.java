package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.StreamingPlatform;

public class NetflixPlatform implements StreamingPlatform {

    @Override
    public void play() {
        System.out.println("Playing content on Netflix");
    }

    @Override
    public void pause() {
        System.out.println("Pausing content on Netflix");
    }

    @Override
    public void browse() {
        System.out.println("Browsing shows on Netflix");
    }
}
