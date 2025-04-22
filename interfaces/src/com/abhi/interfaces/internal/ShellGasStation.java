package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.GasStation;

public class ShellGasStation implements GasStation {

    @Override
    public void refuelCar() {
        System.out.println("Refueling car at Shell Gas Station.");
    }

    @Override
    public void checkOilLevel() {
        System.out.println("Checking oil level at Shell Gas Station.");
    }

    @Override
    public void cleanWindshield() {
        System.out.println("Cleaning windshield at Shell Gas Station.");
    }

    @Override
    public void checkTirePressure() {
        System.out.println("Checking tire pressure at Shell Gas Station.");
    }

    @Override
    public void provideCarWash() {
        System.out.println("Providing car wash at Shell Gas Station.");
    }

    @Override
    public void checkFuelPrices() {
        System.out.println("Checking fuel prices at Shell Gas Station.");
    }

    @Override
    public void offerDiscount() {
        System.out.println("Offering discount at Shell Gas Station.");
    }

    @Override
    public void registerLoyaltyCard() {
        System.out.println("Registering loyalty card at Shell Gas Station.");
    }

    @Override
    public void issueReceipt() {
        System.out.println("Issuing receipt at Shell Gas Station.");
    }
}
