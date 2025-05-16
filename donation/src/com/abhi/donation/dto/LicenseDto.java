package com.abhi.donation.dto;

public class LicenseDto {
    private String licenseType;
    private String phone;
    private String licenseId;
    private String personName;
    private String personLocation;

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setPersonLocation(String personLocation) {
        this.personLocation = personLocation;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public String getPhone() {
        return phone;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonLocation() {
        return personLocation;
    }

    @Override
    public String toString() {
        return "LicenseDto{" +
                "licenseType='" + licenseType + '\'' +
                ", phone='" + phone + '\'' +
                ", licenseId='" + licenseId + '\'' +
                ", personName='" + personName + '\'' +
                ", personLocation='" + personLocation + '\'' +
                '}';
    }
}
