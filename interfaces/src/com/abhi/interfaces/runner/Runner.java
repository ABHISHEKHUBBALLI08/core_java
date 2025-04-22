package com.abhi.interfaces.runner;

import com.abhi.interfaces.internal.*;
import com.abhi.interfaces.rules.*;

public class Runner {
    public static void main(String[] args) {
        Hospital hospital=new ApolloHospital();
        hospital.clean();
        ApolloHospital apolloHospital=new ApolloHospital();
        apolloHospital.clean();
        System.out.println("======================================");

        AmbulanceService ambulance = new RedCrossAmbulance();
        ambulance.respond();
        RedCrossAmbulance redCross = new RedCrossAmbulance();
        redCross.respond();
        System.out.println("======================================");

        Pharmacy pharmacy = new ApolloPharmacy();
        pharmacy.dispenseMedicine();
        ApolloPharmacy apollo = new ApolloPharmacy();
        apollo.dispenseMedicine();
        System.out.println("======================================");

        Clinic clinic = new CityClinic();
        clinic.consult();
        CityClinic city = new CityClinic();
        city.consult();
        System.out.println("======================================");

        BloodBank bloodBank = new LifelineBloodBank();
        bloodBank.donate();
        LifelineBloodBank lifeline = new LifelineBloodBank();
        lifeline.donate();
        System.out.println("======================================");


    }
}
