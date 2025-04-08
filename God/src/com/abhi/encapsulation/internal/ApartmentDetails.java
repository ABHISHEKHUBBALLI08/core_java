package com.abhi.encapsulation.internal;

public class ApartmentDetails {
    public void displayApartmentInfo() {
        System.out.println(" apartment has all modern amenities");
        Apartment apartment = new Apartment();
        apartment.setApartmentId(1202);
        apartment.setName("SkyView Residency");
        apartment.setLocation("Gokul Road, Hubli");
        apartment.setType("3BHK");
        apartment.setOwner("Sushma Desai");
        apartment.getApartmentId();
        apartment.getName();
        apartment.getLocation();
        apartment.getType();
        apartment.getOwner();
    }
}
