package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.CommunityHall;

public class CityCommunityHall implements CommunityHall {

    @Override
    public void bookHall() {
        System.out.println("Booking City Community Hall");
    }

    @Override
    public void arrangeChairs() {
        System.out.println("Arranging chairs at City Community Hall");
    }

    @Override
    public void setupStage() {
        System.out.println("Setting up stage at City Community Hall");
    }

    @Override
    public void hostEvent() {
        System.out.println("Hosting event at City Community Hall");
    }

    @Override
    public void cleanHall() {
        System.out.println("Cleaning City Community Hall after event");
    }
}
