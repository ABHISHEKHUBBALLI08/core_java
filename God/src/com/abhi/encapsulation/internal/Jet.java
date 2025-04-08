package com.abhi.encapsulation.internal;

public class Jet {
    private int jetId = 901;
    private String model = "F-22 Raptor";
    private String origin = "USA";
    private String fuelType = "Jet Fuel";
    private String missionType = "Combat";

    void setJetId(int jetId) {
        this.jetId = jetId;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    void setMissionType(String missionType) {
        this.missionType = missionType;
    }

    public void getJetId() {
        System.out.println(jetId);
    }

    public void getModel() {
        System.out.println(model);
    }

    public void getOrigin() {
        System.out.println(origin);
    }

    public void getFuelType() {
        System.out.println(fuelType);
    }

    public void getMissionType() {
        System.out.println(missionType);
    }
}
