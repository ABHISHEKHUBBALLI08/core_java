package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.AmbulanceService;

public class RedCrossAmbulance implements AmbulanceService {

    @Override
    public void respond() {
        System.out.println("respond running in RedCross Ambulance");
    }
}
