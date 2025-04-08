package com.abhi.encapsulation.internal;

public class GarageService {
    public void repairDetails() {
        System.out.println(" garage provides multiple vehicle services");
        Garage garage = new Garage();
        garage.setGarageId(1002);
        garage.setName("Metro Ford");
        garage.setLocation("Hubli");
        garage.setServiceType("Car Repair & Diagnostics");
        garage.setOpenHours("10 AM - 7 PM");
        garage.getGarageId();
        garage.getName();
        garage.getLocation();
        garage.getServiceType();
        garage.getOpenHours();
    }
}
