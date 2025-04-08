package com.abhi.encapsulation.internal;

public class PostOffice {
    private int branchCode = 701;
    private String location = "Bangalore";
    private String postMaster = "Mr. Rao";
    private String serviceType = "Speed Post";
    private String openingHours = "9 AM - 5 PM";

    void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setPostMaster(String postMaster) {
        this.postMaster = postMaster;
    }

    void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public void getBranchCode() {
        System.out.println(branchCode);
    }

    public void getLocation() {
        System.out.println(location);
    }

    public void getPostMaster() {
        System.out.println(postMaster);
    }

    public void getServiceType() {
        System.out.println(serviceType);
    }

    public void getOpeningHours() {
        System.out.println(openingHours);
    }
}
