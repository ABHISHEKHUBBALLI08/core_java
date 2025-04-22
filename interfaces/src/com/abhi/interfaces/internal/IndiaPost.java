package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.PostOffice;

public class IndiaPost implements PostOffice {

    @Override
    public void acceptParcel() {
        System.out.println("Parcel accepted by India Post.");
    }

    @Override
    public void deliverParcel() {
        System.out.println("Parcel delivered by India Post.");
    }

    @Override
    public void trackParcel() {
        System.out.println("Tracking parcel with India Post.");
    }

    @Override
    public void buyStamp() {
        System.out.println("Buying stamp at India Post.");
    }

    @Override
    public void openSavingsAccount() {
        System.out.println("Opening savings account with India Post.");
    }

    @Override
    public void closeSavingsAccount() {
        System.out.println("Closing savings account with India Post.");
    }

    @Override
    public void applyForPostalServices() {
        System.out.println("Applying for postal services with India Post.");
    }

    @Override
    public void issuePostalOrder() {
        System.out.println("Issuing postal order by India Post.");
    }

    @Override
    public void checkPostageRates() {
        System.out.println("Checking postage rates at India Post.");
    }
}
