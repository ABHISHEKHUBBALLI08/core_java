package com.abhi.donation.dto;

public class FeedbackDto {
    private String type;
    private String phnumber;
    private String id;
    private String name;
    private String location;

    public void setType(String type) {
        this.type = type;
    }

    public void setPhnumber(String phnumber) {
        this.phnumber = phnumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public String getPhnumber() {
        return phnumber;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "FeedbackDto{" +
                "type='" + type + '\'' +
                ", phnumber='" + phnumber + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
