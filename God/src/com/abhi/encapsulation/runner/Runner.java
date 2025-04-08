package com.abhi.encapsulation.runner;

import com.abhi.encapsulation.external.KeyChainHolder;
import com.abhi.encapsulation.external.MutantsSchool;
import com.abhi.encapsulation.internal.KeyDetails;
import com.abhi.encapsulation.internal.MutantPower;
import com.abhi.encapsulation.internal.TankSpecs;
import com.abhi.encapsulation.external.TankBattlefield;
import com.abhi.encapsulation.internal.BadgeDetails;
import com.abhi.encapsulation.external.BadgeHolder;
import com.abhi.encapsulation.internal.PostService;
import com.abhi.encapsulation.external.PostDelivery;
import com.abhi.encapsulation.internal.OccupationType;
import com.abhi.encapsulation.external.OccupationSurvey;
import com.abhi.encapsulation.internal.JetSpecs;
import com.abhi.encapsulation.external.JetMission;
import com.abhi.encapsulation.internal.GarageService;
import com.abhi.encapsulation.external.GarageOwner;
import com.abhi.encapsulation.external.GymMembership;
import com.abhi.encapsulation.internal.GymTraining;
import com.abhi.encapsulation.internal.ApartmentDetails;
import com.abhi.encapsulation.external.ApartmentBooking;

public class Runner {
    public static void main(String[] args) {
        System.out.println(" ===========runner class for mutants");
        MutantsSchool mutantsSchool=new MutantsSchool();
        mutantsSchool.charlesXavier();
        MutantPower mutantPower=new MutantPower();
        mutantPower.mutations();
        System.out.println("=========== runner class for keychain");
        KeyChainHolder keyChainHolder = new KeyChainHolder();
        keyChainHolder.holderDetails();
        KeyDetails keyDetails = new KeyDetails();
        keyDetails.keyInfo();
        System.out.println("============ runner class for tank");
        TankBattlefield tankBattlefield = new TankBattlefield();
        tankBattlefield.battlefieldDetails();
        TankSpecs tankSpecs = new TankSpecs();
        tankSpecs.specifications();
        System.out.println("====== ====== runner class for badge");
        BadgeHolder badgeHolder = new BadgeHolder();
        badgeHolder.holderInfo();
        BadgeDetails badgeDetails = new BadgeDetails();
        badgeDetails.displayDetails();
        System.out.println("===============runner class for post office");
        PostDelivery postDelivery = new PostDelivery();
        postDelivery.deliveryStatus();
        PostService postService = new PostService();
        postService.services();
        System.out.println("==============runner class for occupation");
        OccupationSurvey occupationSurvey = new OccupationSurvey();
        occupationSurvey.surveyResults();
        OccupationType occupationType = new OccupationType();
        occupationType.professionDetails();
        System.out.println("==============runner class for jet");
        JetMission jetMission = new JetMission();
        jetMission.missionInfo();
        JetSpecs jetSpecs = new JetSpecs();
        jetSpecs.specification();
        System.out.println(" ============runner class for garage");
        GarageOwner garageOwner = new GarageOwner();
        garageOwner.ownerInfo();
        GarageService garageService = new GarageService();
        garageService.repairDetails();
        System.out.println(" =============runner class for gym");
        GymMembership gymMembership = new GymMembership();
        gymMembership.membershipDetails();
        GymTraining gymTraining = new GymTraining();
        gymTraining.trainingDetails();
        System.out.println(" =============runner class for apartment");
        ApartmentBooking apartmentBooking = new ApartmentBooking();
        apartmentBooking.bookApartment();
        ApartmentDetails apartmentDetails = new ApartmentDetails();
        apartmentDetails.displayApartmentInfo();

    }
}
