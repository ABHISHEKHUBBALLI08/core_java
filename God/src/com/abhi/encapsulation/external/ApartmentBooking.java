package com.abhi.encapsulation.external;

import com.abhi.encapsulation.internal.Apartment;

public class ApartmentBooking {
    public void bookApartment() {
        System.out.println(" apartments are available for booking");
        Apartment apartment = new Apartment();
        apartment.getApartmentId();
        apartment.getName();
        apartment.getLocation();
        apartment.getType();
        apartment.getOwner();
    }
}
