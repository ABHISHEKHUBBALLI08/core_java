package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.BloodBank;

public class LifelineBloodBank implements BloodBank {

    @Override
    public void donate() {
        System.out.println("donate running in Lifeline Blood Bank");
    }
}
