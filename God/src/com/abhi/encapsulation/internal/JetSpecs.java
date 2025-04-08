package com.abhi.encapsulation.internal;

public class JetSpecs {
    public void specification() {
        System.out.println(" jet is designed for high-speed missions");
        Jet jet = new Jet();
        jet.setJetId(902);
        jet.setModel("SU-30");
        jet.setOrigin("Russia");
        jet.setFuelType("Aviation Kerosene");
        jet.setMissionType("Reconnaissance");
        jet.getJetId();
        jet.getModel();
        jet.getOrigin();
        jet.getFuelType();
        jet.getMissionType();
    }
}
