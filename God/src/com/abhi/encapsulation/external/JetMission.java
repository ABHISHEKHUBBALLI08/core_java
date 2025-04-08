package com.abhi.encapsulation.external;

import com.abhi.encapsulation.internal.Jet;

public class JetMission {
    public void missionInfo() {
        System.out.println(" jets are assigned strategic missions");
        Jet jet = new Jet();
        jet.getJetId();
        jet.getModel();
        jet.getOrigin();
        jet.getFuelType();
        jet.getMissionType();
    }
}
