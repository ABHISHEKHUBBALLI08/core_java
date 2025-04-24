package com.abhi.abstractions.runner;

import com.abhi.abstractions.internal.Beverages;

public class BeverageUpdate {
    private Beverages beverages;

    public BeverageUpdate(Beverages beverages) {
        this.beverages = beverages;
        System.out.println("Beverage instance created...");
    }

    public void beverageInfo() {
        if (this.beverages != null) {
            this.beverages.info();
        } else {
            System.out.println("Beverage is null");
        }
    }
}
