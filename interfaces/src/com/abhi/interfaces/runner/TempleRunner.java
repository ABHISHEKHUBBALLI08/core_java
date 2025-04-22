package com.abhi.interfaces.runner;

import com.abhi.interfaces.internal.*;
import com.abhi.interfaces.rules.*;

public class TempleRunner {
    public static void main(String[] args) {
        Temple temple = new ISKCONTemple();
        temple.ringBell();
        temple.offerPrayers();
        temple.donate();
        temple.attendAarti();
        temple.removeFootwear();
        ISKCONTemple iskcon = new ISKCONTemple();
        iskcon.ringBell();
        iskcon.offerPrayers();
        iskcon.donate();
        iskcon.attendAarti();
        iskcon.removeFootwear();
        System.out.println("======================================");


        Church church = new StMaryChurch();
        church.singHymns();
        church.lightCandles();
        church.pray();
        church.attendMass();
        church.giveDonation();
        StMaryChurch stMaryChurch = new StMaryChurch();
        stMaryChurch.singHymns();
        stMaryChurch.lightCandles();
        stMaryChurch.pray();
        stMaryChurch.attendMass();
        stMaryChurch.giveDonation();
        System.out.println("======================================");

        Mosque mosque = new JamiaMasjid();
        mosque.performWudu();
        mosque.offerNamaz();
        mosque.listenKhutbah();
        mosque.reciteQuran();
        mosque.giveZakat();
        JamiaMasjid jamiaMasjid = new JamiaMasjid();
        jamiaMasjid.performWudu();
        jamiaMasjid.offerNamaz();
        jamiaMasjid.listenKhutbah();
        jamiaMasjid.reciteQuran();
        jamiaMasjid.giveZakat();
        System.out.println("======================================");

        CommunityHall hall = new CityCommunityHall();
        hall.bookHall();
        hall.arrangeChairs();
        hall.setupStage();
        hall.hostEvent();
        hall.cleanHall();
        CityCommunityHall cityHall = new CityCommunityHall();
        cityHall.bookHall();
        cityHall.arrangeChairs();
        cityHall.setupStage();
        cityHall.hostEvent();
        cityHall.cleanHall();
        System.out.println("======================================");

        Library library = new CentralLibrary();
        library.issueBook();
        library.returnBook();
        library.readBook();
        library.payFine();
        library.getMembership();
        CentralLibrary centralLibrary = new CentralLibrary();
        centralLibrary.issueBook();
        centralLibrary.returnBook();
        centralLibrary.readBook();
        centralLibrary.payFine();
        centralLibrary.getMembership();
        System.out.println("======================================");
    }
}
