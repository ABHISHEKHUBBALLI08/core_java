package com.abhi.encapsulation.internal;

public class Apartment {
    private int apartmentId = 1201;
    private String name = "GreenHeights";
    private String location = "Hubli";
    private String type = "2BHK";
    private String owner = "Ramesh Patil";

    void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setType(String type) {
        this.type = type;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    public void getApartmentId() {
        System.out.println(apartmentId);
    }

    public void getName() {
        System.out.println(name);
    }

    public void getLocation() {
        System.out.println(location);
    }

    public void getType() {
        System.out.println(type);
    }

    public void getOwner() {
        System.out.println(owner);
    }
}
