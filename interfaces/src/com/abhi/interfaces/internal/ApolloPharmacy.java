package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.Pharmacy;

public class ApolloPharmacy implements Pharmacy {

    @Override
    public void dispenseMedicine() {
        System.out.println("dispenseMedicine running in Apollo Pharmacy");
    }
}
