package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.Restaurant;

public class DominosRestaurant implements Restaurant {

    @Override
    public void takeOrder() {
        System.out.println("Taking order at Dominos Restaurant.");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving food at Dominos Restaurant.");
    }

    @Override
    public void processPayment() {
        System.out.println("Processing payment at Dominos Restaurant.");
    }

    @Override
    public void prepareDish() {
        System.out.println("Preparing dish at Dominos Restaurant.");
    }

    @Override
    public void cleanTable() {
        System.out.println("Cleaning table at Dominos Restaurant.");
    }

    @Override
    public void refillDrinks() {
        System.out.println("Refilling drinks at Dominos Restaurant.");
    }

    @Override
    public void greetCustomer() {
        System.out.println("Greeting customer at Dominos Restaurant.");
    }

    @Override
    public void giveBill() {
        System.out.println("Giving bill at Dominos Restaurant.");
    }

    @Override
    public void reserveTable() {
        System.out.println("Reserving table at Dominos Restaurant.");
    }
}
