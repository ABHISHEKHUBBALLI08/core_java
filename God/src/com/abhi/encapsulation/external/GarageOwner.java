package com.abhi.encapsulation.external;

import com.abhi.encapsulation.internal.Garage;

public class GarageOwner {
    public void ownerInfo() {
        System.out.println(" garage is operated by skilled professionals");
        Garage garage = new Garage();
        garage.getGarageId();
        garage.getName();
        garage.getLocation();
        garage.getServiceType();
        garage.getOpenHours();
    }
}
