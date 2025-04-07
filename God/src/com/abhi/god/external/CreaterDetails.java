package com.abhi.god.external;

import com.abhi.god.internal.Drone;

public class CreaterDetails {
    public void credentials(){
        System.out.println("credentials running in createrdetails");
        Drone drone=new Drone();
        drone.fly();
    }
}
