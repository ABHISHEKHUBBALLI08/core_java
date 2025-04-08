package com.abhi.encapsulation.internal;

public class Garage {
    private int garageId = 1001;
    private String name = "Raam Hyundai Service";
    private String location = "Hubli";
    private String serviceType = "Car Maintenance";
    private String openHours = "9 AM - 6 PM";

    void setGarageId(int garageId) {
        this.garageId = garageId;
    }

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    void setOpenHours(String openHours) {
        this.openHours = openHours;
    }

    public void getGarageId() {
        System.out.println(garageId);
    }

    public void getName() {
        System.out.println(name);
    }

    public void getLocation() {
        System.out.println(location);
    }

    public void getServiceType() {
        System.out.println(serviceType);
    }

    public void getOpenHours() {
        System.out.println(openHours);
    }
}
