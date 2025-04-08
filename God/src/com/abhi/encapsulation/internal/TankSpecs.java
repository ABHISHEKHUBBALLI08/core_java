package com.abhi.encapsulation.internal;

public class TankSpecs {
    public void specifications() {
        System.out.println(" tank has advanced weapon systems");
        Tank tank = new Tank();
        tank.setTankId(502);
        tank.setModel("Abrams");
        tank.setOrigin("USA");
        tank.setFuelType("Gas Turbine");
        tank.setWeaponSystem("Machine Gun");
        tank.getTankId();
        tank.getModel();
        tank.getOrigin();
        tank.getFuelType();
        tank.getWeaponSystem();
    }
}
