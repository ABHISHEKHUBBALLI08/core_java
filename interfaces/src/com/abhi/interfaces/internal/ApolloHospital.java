package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.Hospital;

public class ApolloHospital implements Hospital {

    @Override
    public void clean() {
        System.out.println("clean running in Apollo Hospital");
    }
}
