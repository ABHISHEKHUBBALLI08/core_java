package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.Church;

public class StMaryChurch implements Church {

    @Override
    public void singHymns() {
        System.out.println("Singing hymns at St. Mary Church");
    }

    @Override
    public void lightCandles() {
        System.out.println("Lighting candles at St. Mary Church");
    }

    @Override
    public void pray() {
        System.out.println("Praying at St. Mary Church");
    }

    @Override
    public void attendMass() {
        System.out.println("Attending mass at St. Mary Church");
    }

    @Override
    public void giveDonation() {
        System.out.println("Giving donation at St. Mary Church");
    }
}
