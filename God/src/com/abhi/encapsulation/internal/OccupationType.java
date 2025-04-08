package com.abhi.encapsulation.internal;

public class OccupationType {
    public void professionDetails() {
        System.out.println(" occupation defines professional identity");
        Occupation occupation = new Occupation();
        occupation.setOccupationId(802);
        occupation.setTitle("Doctor");
        occupation.setField("Medicine");
        occupation.setLocation("Chennai");
        occupation.setExperience("10 years");
        occupation.getOccupationId();
        occupation.getTitle();
        occupation.getField();
        occupation.getLocation();
        occupation.getExperience();
    }
}
