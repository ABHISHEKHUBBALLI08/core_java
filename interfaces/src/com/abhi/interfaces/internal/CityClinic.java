package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.Clinic;

public class CityClinic implements Clinic {

    @Override
    public void consult() {
        System.out.println("consult running in City Clinic");
    }
}
