package com.abhi.abstractions.runner;

import com.abhi.abstractions.internal.Beverages;
import com.abhi.abstractions.internal.Tea;
import com.abhi.abstractions.internal.Coffee;

public class BeverageRunner {
    public static void main(String[] args) {
        Beverages tea = new Tea();
        Beverages coffee = new Coffee();

        BeverageUpdate update1 = new BeverageUpdate(tea);
        update1.beverageInfo();

        BeverageUpdate update2 = new BeverageUpdate(coffee);
        update2.beverageInfo();
    }
}
