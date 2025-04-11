package com.abhi.override3.runner;

import com.abhi.override3.internal.*;
import com.abhi.override3.external.DC1;

public class Runner2 {
    public static void main(String[] args) {
        DC1 dc = new DC1();
        System.out.println("Running in Runner 2 for DC Universe");

        System.out.println("Calling Superman methods");
        Kryptonian hero1 = new Superman();
        Superman superman = new Superman();
        dc.superman(hero1);
        dc.superman(superman);

        System.out.println("Calling Batman methods");
        DarkKnight hero2 = new Batman();
        Batman batman = new Batman();
        dc.batman(hero2);
        dc.batman(batman);

        System.out.println("Calling WonderWoman methods");
        Amazonian hero3 = new WonderWoman();
        WonderWoman diana = new WonderWoman();
        dc.wonderWoman(hero3);
        dc.wonderWoman(diana);

        System.out.println("Calling Flash methods");
        Speedster hero4 = new Flash();
        Flash flash = new Flash();
        dc.flash(hero4);
        dc.flash(flash);

        System.out.println("Calling Aquaman methods");
        Atlantean hero5 = new Aquaman();
        Aquaman aquaman = new Aquaman();
        dc.aquaman(hero5);
        dc.aquaman(aquaman);

        System.out.println("Calling GreenArrow methods");
        Archer hero6 = new GreenArrow();
        GreenArrow queen = new GreenArrow();
        dc.greenArrow(hero6);
        dc.greenArrow(queen);

        System.out.println("Calling MartianManhunter methods");
        AlienMartian hero7 = new MartianManhunter();
        MartianManhunter jonn = new MartianManhunter();
        dc.martianManhunter(hero7);
        dc.martianManhunter(jonn);

        System.out.println("Calling Cyborg methods");
        TechExpert hero8 = new Cyborg();
        Cyborg cyborg = new Cyborg();
        dc.cyborg(hero8);
        dc.cyborg(cyborg);

        System.out.println("Calling GreenLantern methods");
        LanternWielder hero9 = new GreenLantern();
        GreenLantern hal = new GreenLantern();
        dc.greenLantern(hero9);
        dc.greenLantern(hal);

        System.out.println("Calling ReneeMontoya methods");
        Detective hero10 = new ReneeMontoya();
        ReneeMontoya renee = new ReneeMontoya();
        dc.reneeMontoya(hero10);
        dc.reneeMontoya(renee);

        System.out.println("Calling Zatanna methods");
        Magician hero11 = new Zatanna();
        Zatanna zatanna = new Zatanna();
        dc.zatanna(hero11);
        dc.zatanna(zatanna);

        System.out.println("Calling BeastBoy methods");
        BeastHero hero12 = new BeastBoy();
        BeastBoy beastBoy = new BeastBoy();
        dc.beastBoy(hero12);
        dc.beastBoy(beastBoy);

        System.out.println("Calling Raven methods");
        ShadowHero hero13 = new Raven();
        Raven raven = new Raven();
        dc.raven(hero13);
        dc.raven(raven);

        System.out.println("Calling Artemis methods");
        Archerette hero14 = new Artemis();
        Artemis mia = new Artemis();
        dc.artemis(hero14);
        dc.artemis(mia);

        System.out.println("Calling Joker methods");
        Trickster hero15 = new Joker();
        Joker joker = new Joker();
        dc.joker(hero15);
        dc.joker(joker);

        System.out.println("Calling KillerFrost methods");
        IceController hero16 = new KillerFrost();
        KillerFrost frost = new KillerFrost();
        dc.killerFrost(hero16);
        dc.killerFrost(frost);

        System.out.println("Calling Maxima methods");
        TelekineticHero hero17 = new Maxima();
        Maxima maxima = new Maxima();
        dc.maxima(hero17);
        dc.maxima(maxima);

        System.out.println("Calling RedTornado methods");
        RobotFighter hero18 = new RedTornado();
        RedTornado red = new RedTornado();
        dc.redTornado(hero18);
        dc.redTornado(red);

        System.out.println("Calling RedHood methods");
        AntiHero hero19 = new RedHood();
        RedHood redHood = new RedHood();
        dc.redHood(hero19);
        dc.redHood(redHood);

        System.out.println("Calling Firestorm methods");
        ElementalHero hero20 = new Firestorm();
        Firestorm fire = new Firestorm();
        dc.firestorm(hero20);
        dc.firestorm(fire);

        System.out.println("Calling Scarecrow methods");
        FearMaster hero21 = new Scarecrow();
        Scarecrow scare = new Scarecrow();
        dc.scarecrow(hero21);
        dc.scarecrow(scare);

        System.out.println("Calling Deadshot methods");
        Gunner hero22 = new Deadshot();
        Deadshot floyd = new Deadshot();
        dc.deadshot(hero22);
        dc.deadshot(floyd);

        System.out.println("Calling Shazam methods");
        Demigod hero23 = new Shazam();
        Shazam billy = new Shazam();
        dc.shazam(hero23);
        dc.shazam(billy);

        System.out.println("Calling Mera methods");
        AquaticHero hero24 = new Mera();
        Mera mera = new Mera();
        dc.mera(hero24);
        dc.mera(mera);

        System.out.println("Calling Constantine methods");
        MysticRogue hero25 = new Constantine();
        Constantine john = new Constantine();
        dc.constantine(hero25);
        dc.constantine(john);
    }
}
