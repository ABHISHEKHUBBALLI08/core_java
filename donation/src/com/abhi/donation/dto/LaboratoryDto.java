package com.abhi.donation.dto;

public class LaboratoryDto {
    private String name;
    private String phnumber;
    private String id;
    private String incharge;
    private String location;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhnumber(String phnumber) {
        this.phnumber = phnumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIncharge(String incharge) {
        this.incharge = incharge;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getPhnumber() {
        return phnumber;
    }

    public String getId() {
        return id;
    }

    public String getIncharge() {
        return incharge;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "LaboratoryDto{" +
                "name='" + name + '\'' +
                ", phnumber='" + phnumber + '\'' +
                ", id='" + id + '\'' +
                ", incharge='" + incharge + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
