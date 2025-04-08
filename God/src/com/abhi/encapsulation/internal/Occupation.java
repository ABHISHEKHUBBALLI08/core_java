package com.abhi.encapsulation.internal;

public class Occupation {
    private int occupationId = 801;
    private String title = "Engineer";
    private String field = "Software";
    private String location = "Hyderabad";
    private String experience = "5 years";

    void setOccupationId(int occupationId) {
        this.occupationId = occupationId;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setField(String field) {
        this.field = field;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setExperience(String experience) {
        this.experience = experience;
    }

    public void getOccupationId() {
        System.out.println(occupationId);
    }

    public void getTitle() {
        System.out.println(title);
    }

    public void getField() {
        System.out.println(field);
    }

    public void getLocation() {
        System.out.println(location);
    }

    public void getExperience() {
        System.out.println(experience);
    }
}
