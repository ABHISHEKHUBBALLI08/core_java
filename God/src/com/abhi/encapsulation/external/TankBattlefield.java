package com.abhi.encapsulation.external;

import com.abhi.encapsulation.internal.Tank;

public class TankBattlefield {
    public void battlefieldDetails() {
        System.out.println(" tanks are deployed in battlefield");
        Tank tank = new Tank();
        tank.getTankId();
        tank.getModel();
        tank.getOrigin();
        tank.getFuelType();
        tank.getWeaponSystem();
    }
}
