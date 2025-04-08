package com.abhi.encapsulation.internal;

public class Tank {
    private int tankId = 501;
    private String model = "T-90";
    private String origin = "Russia";
    private String fuelType = "Diesel";
    private String weaponSystem = "Cannon";

    void setTankId(int tankId) {
        this.tankId = tankId;
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

    void setWeaponSystem(String weaponSystem) {
        this.weaponSystem = weaponSystem;
    }

    public void getTankId() {
        System.out.println(tankId);
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

    public void getWeaponSystem() {
        System.out.println(weaponSystem);
    }
}
