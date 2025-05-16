package com.abhi.donation.dto;

public class FirDto {
    private String name;
    private String phnumber;
    private String fir;
    private String police;
    private String location;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhnumber(String phnumber) {
        this.phnumber = phnumber;
    }

    public void setFir(String fir) {
        this.fir = fir;
    }

    public void setPolice(String police) {
        this.police = police;
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

    public String getFir() {
        return fir;
    }

    public String getPolice() {
        return police;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "FirDto{" +
                "name='" + name + '\'' +
                ", phnumber='" + phnumber + '\'' +
                ", fir='" + fir + '\'' +
                ", police='" + police + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
