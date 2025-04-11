package com.abhi.override1.runner;

import com.abhi.override1.internal.*;
import com.abhi.override1.external.MarvelUniverse1;

public class Runner2 {
    public static void main(String[] args) {
        MarvelUniverse1 marvel = new MarvelUniverse1();
        System.out.println("Running in Runner 3 for Marvel Universe");

        System.out.println("Calling CaptainAmerica methods");
        SuperSoldier soldier = new CaptainAmerica();
        CaptainAmerica cap = new CaptainAmerica();
        marvel.captainAmerica(soldier);
        marvel.captainAmerica(cap);

        System.out.println("Calling IronMan methods");
        ArmoredHero armored = new IronMan();
        IronMan iron = new IronMan();
        marvel.ironMan(armored);
        marvel.ironMan(iron);

        System.out.println("Calling Thor methods");
        Asgardian god = new Thor();
        Thor thor = new Thor();
        marvel.thor(god);
        marvel.thor(thor);

        System.out.println("Calling Hulk methods");
        GeniusScientist genius = new Hulk();
        Hulk hulk = new Hulk();
        marvel.hulk(genius);
        marvel.hulk(hulk);

        System.out.println("Calling DoctorStrange methods");
        MysticMaster mystic = new DoctorStrange();
        DoctorStrange strange = new DoctorStrange();
        marvel.doctorStrange(mystic);
        marvel.doctorStrange(strange);

        System.out.println("Calling BlackWidow methods");
        StealthAgent agent = new BlackWidow();
        BlackWidow widow = new BlackWidow();
        marvel.blackWidow(agent);
        marvel.blackWidow(widow);

        System.out.println("Calling Hawkeye methods");
        Sharpshooter shooter = new Hawkeye();
        Hawkeye hawk = new Hawkeye();
        marvel.hawkeye(shooter);
        marvel.hawkeye(hawk);

        System.out.println("Calling BlackPanther methods");
        WakandanHero pantherHero = new BlackPanther();
        BlackPanther panther = new BlackPanther();
        marvel.blackPanther(pantherHero);
        marvel.blackPanther(panther);

        System.out.println("Calling SpiderMan methods");
        SpiderHero spider = new SpiderMan();
        SpiderMan spidey = new SpiderMan();
        marvel.spiderMan(spider);
        marvel.spiderMan(spidey);

        System.out.println("Calling AntMan methods");
        ShrinkHero shrink = new AntMan();
        AntMan ant = new AntMan();
        marvel.antMan(shrink);
        marvel.antMan(ant);

        System.out.println("Calling CaptainAmerica1 methods");
        ShieldHero shield = new CaptainAmerica1();
        CaptainAmerica1 cap1 = new CaptainAmerica1();
        marvel.captainAmerica1(shield);
        marvel.captainAmerica1(cap1);

        System.out.println("Calling Vision methods");
        AndroidAvenger android = new Vision();
        Vision vision = new Vision();
        marvel.vision(android);
        marvel.vision(vision);

        System.out.println("Calling ScarletWitch methods");
        WitchHero witch = new ScarletWitch();
        ScarletWitch wanda = new ScarletWitch();
        marvel.scarletWitch(witch);
        marvel.scarletWitch(wanda);

        System.out.println("Calling Wasp methods");
        InsectHero waspHero = new Wasp();
        Wasp wasp = new Wasp();
        marvel.wasp(waspHero);
        marvel.wasp(wasp);

        System.out.println("Calling WarMachine methods");
        TechPilot pilot = new WarMachine();
        WarMachine rhodey = new WarMachine();
        marvel.warMachine(pilot);
        marvel.warMachine(rhodey);

        System.out.println("Calling Loki methods");
        MagicHero magic = new Loki();
        Loki loki = new Loki();
        marvel.loki(magic);
        marvel.loki(loki);

        System.out.println("Calling StarLord methods");
        SpaceWarrior starHero = new StarLord();
        StarLord star = new StarLord();
        marvel.starLord(starHero);
        marvel.starLord(star);

        System.out.println("Calling Drax methods");
        AlienFighter draxHero = new Drax();
        Drax drax = new Drax();
        marvel.drax(draxHero);
        marvel.drax(drax);

        System.out.println("Calling RocketRaccoon methods");
        RocketHero rocketHero = new RocketRaccoon();
        RocketRaccoon rocket = new RocketRaccoon();
        marvel.rocketRaccoon(rocketHero);
        marvel.rocketRaccoon(rocket);

        System.out.println("Calling Groot methods");
        TreeBeing tree = new Groot();
        Groot groot = new Groot();
        marvel.groot(tree);
        marvel.groot(groot);

        System.out.println("Calling BlackPanther1 methods");
        WakandanWarrior warrior = new BlackPanther1();
        BlackPanther1 panther1 = new BlackPanther1();
        marvel.blackPanther1(warrior);
        marvel.blackPanther1(panther1);

        System.out.println("Calling BlackWidow1 methods");
        SpyAgent spy = new BlackWidow1();
        BlackWidow1 widow1 = new BlackWidow1();
        marvel.blackWidow1(spy);
        marvel.blackWidow1(widow1);

        System.out.println("Calling Hawkeye1 methods");
        BowExpert bow = new Hawkeye1();
        Hawkeye1 hawkeye1 = new Hawkeye1();
        marvel.hawkeye1(bow);
        marvel.hawkeye1(hawkeye1);

        System.out.println("Calling Shuri methods");
        GeniusKid geniusKid = new Shuri();
        Shuri shuri = new Shuri();
        marvel.shuri(geniusKid);
        marvel.shuri(shuri);

        System.out.println("Calling CaptainAmerica3 methods");
        ShieldMaster1 shield1 = new CaptainAmerica3();
        CaptainAmerica3 cap3 = new CaptainAmerica3();
        marvel.captainAmerica3(shield1);
        marvel.captainAmerica3(cap3);
    }
}
