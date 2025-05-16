package com.abhi.donation.dto;

public class DonationDto {
    private String name;
    private String phnumber;
    private String amount;
    private String location;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhnumber(String phnumber) {
        this.phnumber = phnumber;
    }

    public void setAmount(String amount) {
        this.amount = amount;
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

    public String getAmount() {
        return amount;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "DonationDto{" +
                "name='" + name + '\'' +
                ", phnumber='" + phnumber + '\'' +
                ", amount='" + amount + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
