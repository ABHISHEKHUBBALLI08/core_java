package com.abhi.overide4.runner;

import com.abhi.overide4.internal.*;

public class Runner {
    public static void main(String[] args) {
        Wizard wizard1 = new Wizard();
        wizard1.usePower();
        Wizard harryAsWizard = new HarryPotter();
        harryAsWizard.usePower();
        HarryPotter harry = new HarryPotter();
        harry.usePower();
        harry.summonPatronus();
        System.out.println("=====================");

        Witch witch1 = new Witch();
        witch1.usePower();
        Witch hermioneAsWitch = new HermioneGranger();
        hermioneAsWitch.usePower();
        HermioneGranger hermione = new HermioneGranger();
        hermione.usePower();
        hermione.useTimeTurner();
        System.out.println("=====================");

        DarkLord dark1 = new DarkLord();
        dark1.usePower();
        DarkLord voldemortAsDark = new Voldemort();
        voldemortAsDark.usePower();
        Voldemort voldemort = new Voldemort();
        voldemort.usePower();
        voldemort.castAvadaKedavra();
        System.out.println("=====================");

        Headmaster head1 = new Headmaster();
        head1.usePower();
        Headmaster dumbAsHead = new Dumbledore();
        dumbAsHead.usePower();
        Dumbledore dumb = new Dumbledore();
        dumb.usePower();
        dumb.useElderWand();
        System.out.println("=====================");

        PotionMaster pot1 = new PotionMaster();
        pot1.usePower();
        PotionMaster snapeAsPot = new Snape();
        snapeAsPot.usePower();
        Snape snape = new Snape();
        snape.usePower();
        snape.brewPotion();
        System.out.println("=====================");

        Werewolf hero6 = new Werewolf();
        hero6.usePower();
        Werewolf remusAsHero = new Lupin();
        remusAsHero.usePower();
        Lupin remus = new Lupin();
        remus.usePower();
        remus.transformAtFullMoon();
        System.out.println("=====================");

        Animagus hero7 = new Animagus();
        hero7.usePower();
        Animagus siriusAsHero = new SiriusBlack();
        siriusAsHero.usePower();
        SiriusBlack sirius = new SiriusBlack();
        sirius.usePower();
        sirius.transformToDog();
        System.out.println("=====================");

        Seer hero8 = new Seer();
        hero8.usePower();
        Seer trelawneyAsHero = new Seer();
        trelawneyAsHero.usePower();
        Trelawney trelawney = new Trelawney();
        trelawney.usePower();
        trelawney.predictFuture();
        System.out.println("=====================");

        Caretaker hero9 = new Caretaker();
        hero9.usePower();
        Caretaker filchAsHero = new Filch();
        filchAsHero.usePower();
        Filch filch = new Filch();
        filch.usePower();
        filch.cleanCastle();
        System.out.println("=====================");

        Giant hero10 = new Giant();
        hero10.usePower();
        Giant hagridAsHero = new Hagrid();
        hagridAsHero.usePower();
        Hagrid hagrid = new Hagrid();
        hagrid.usePower();
        hagrid.tameCreatures();
        System.out.println("=====================");

        Ghost ghost1 = new Ghost();
        ghost1.usePower();
        Ghost nearlyHeadlessNickAsGhost = new NearlyHeadlessNick();
        nearlyHeadlessNickAsGhost.usePower();
        NearlyHeadlessNick nick = new NearlyHeadlessNick();
        nick.usePower();
        nick.hauntHogwarts();
        System.out.println("=====================");

        Elf elf1 = new Elf();
        elf1.usePower();
        Elf dobbyAsElf = new Dobby();
        dobbyAsElf.usePower();
        Dobby dobby = new Dobby();
        dobby.usePower();
        dobby.protectHarry();
        System.out.println("=====================");

        QuidditchPlayer player1 = new QuidditchPlayer();
        player1.usePower();
        QuidditchPlayer ginnyAsPlayer = new GinnyWeasley();
        ginnyAsPlayer.usePower();
        GinnyWeasley ginny = new GinnyWeasley();
        ginny.usePower();
        ginny.scoreGoal();
        System.out.println("=====================");

        Auror auror1 = new Auror();
        auror1.usePower();
        Auror tonksAsAuror = new Tonks();
        tonksAsAuror.usePower();
        Tonks tonks = new Tonks();
        tonks.usePower();
        tonks.shapeShift();
        System.out.println("=====================");

        DeathEater eater1 = new DeathEater();
        eater1.usePower();
        DeathEater bellatrixAsEater = new Bellatrix();
        bellatrixAsEater.usePower();
        Bellatrix bellatrix = new Bellatrix();
        bellatrix.usePower();
        bellatrix.duel();
        System.out.println("=====================");

        Slytherin slyth1 = new Slytherin();
        slyth1.usePower();
        Slytherin dracoAsSlyth = new DracoMalfoy();
        dracoAsSlyth.usePower();
        DracoMalfoy draco = new DracoMalfoy();
        draco.usePower();
        draco.castSerpent();
        System.out.println("=====================");

        Gryffindor gryf1 = new Gryffindor();
        gryf1.usePower();
        Gryffindor nevilleAsGryf = new NevilleLongbottom();
        nevilleAsGryf.usePower();
        NevilleLongbottom neville = new NevilleLongbottom();
        neville.usePower();
        neville.killNagini();
        System.out.println("=====================");

        Ravenclaw raven1 = new Ravenclaw();
        raven1.usePower();
        Ravenclaw lunaAsRaven = new LunaLovegood();
        lunaAsRaven.usePower();
        LunaLovegood luna = new LunaLovegood();
        luna.usePower();
        luna.talkToCreatures();
        System.out.println("=====================");

        Hufflepuff puff1 = new Hufflepuff();
        puff1.usePower();
        Hufflepuff cedricAsPuff = new CedricDiggory();
        cedricAsPuff.usePower();
        CedricDiggory cedric = new CedricDiggory();
        cedric.usePower();
        cedric.duelFair();
        System.out.println("=====================");

        MinistryOfficial official1 = new MinistryOfficial();
        official1.usePower();
        MinistryOfficial fudgeAsOfficial = new Fudge();
        fudgeAsOfficial.usePower();
        Fudge fudge = new Fudge();
        fudge.usePower();
        fudge.issueDecree();
        System.out.println("=====================");

        DragonTamer tamer1 = new DragonTamer();
        tamer1.usePower();
        DragonTamer charlieAsTamer = new CharlieWeasley();
        charlieAsTamer.usePower();
        CharlieWeasley charlie = new CharlieWeasley();
        charlie.usePower();
        charlie.tameDragon();
        System.out.println("=====================");

        Herbologist herb1 = new Herbologist();
        herb1.usePower();
        Herbologist sproutAsHerb = new ProfessorSprout();
        sproutAsHerb.usePower();
        ProfessorSprout sprout = new ProfessorSprout();
        sprout.usePower();
        sprout.growMandrakes();
        System.out.println("=====================");

        Historian hist1 = new Historian();
        hist1.usePower();
        Historian binsAsHist = new ProfessorBinns();
        binsAsHist.usePower();
        ProfessorBinns bins = new ProfessorBinns();
        bins.usePower();
        bins.boreStudents();
        System.out.println("=====================");

        Centaur cent1 = new Centaur();
        cent1.usePower();
        Centaur firenzeAsCent = new Firenze();
        firenzeAsCent.usePower();
        Firenze firenze = new Firenze();
        firenze.usePower();
        firenze.readStars();
        System.out.println("=====================");

        DuelMaster duel1 = new DuelMaster();
        duel1.usePower();
        DuelMaster lockhartAsDuel = new GilderoyLockhart();
        lockhartAsDuel.usePower();
        GilderoyLockhart lockhart = new GilderoyLockhart();
        lockhart.usePower();
        lockhart.eraseMemory();
        System.out.println("=====================");
    }
}
