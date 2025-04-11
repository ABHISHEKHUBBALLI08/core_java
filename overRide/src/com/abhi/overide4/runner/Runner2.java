package com.abhi.overide4.runner;

import com.abhi.overide4.external.HarryPotter1;
import com.abhi.overide4.internal.*;

public class Runner2 {
    public static void main(String[] args) {
        HarryPotter1 harryPotter1=new HarryPotter1();
        System.out.println("Running in Runner 2 in harryPotter");
        Wizard wizard=new HarryPotter();
        HarryPotter harryPotter=new HarryPotter();
        harryPotter1.harry(wizard);
        harryPotter1.harry(harryPotter);
        System.out.println("Calling HermioneGranger methods");
        Witch witch = new HermioneGranger();
        HermioneGranger hermione = new HermioneGranger();
        harryPotter1.hermione(witch);
        harryPotter1.hermione(hermione);
        System.out.println("Calling Voldemort methods");
        DarkLord darkLord = new Voldemort();
        Voldemort voldemort = new Voldemort();
        harryPotter1.voldemort(darkLord);
        harryPotter1.voldemort(voldemort);
        System.out.println("Calling Dumbledore methods");
        Headmaster headmaster = new Dumbledore();
        Dumbledore dumbledore = new Dumbledore();
        harryPotter1.dumbledore(headmaster);
        harryPotter1.dumbledore(dumbledore);
        System.out.println("Calling Snape methods");
        PotionMaster potionMaster = new Snape();
        Snape snape = new Snape();
        harryPotter1.snape(potionMaster);
        harryPotter1.snape(snape);
        System.out.println("Calling Lupin methods");
        Werewolf werewolf = new Lupin();
        Lupin lupin = new Lupin();
        harryPotter1.lupin(werewolf);
        harryPotter1.lupin(lupin);
        System.out.println("Calling SiriusBlack methods");
        Animagus animagus = new SiriusBlack();
        SiriusBlack siriusBlack = new SiriusBlack();
        harryPotter1.sirius(animagus);
        harryPotter1.sirius(siriusBlack);
        System.out.println("Calling Trelawney methods");
        Seer seer = new Trelawney();
        Trelawney trelawney = new Trelawney();
        harryPotter1.trelawney(seer);
        harryPotter1.trelawney(trelawney);
        System.out.println("Calling Filch methods");
        Caretaker caretaker = new Filch();
        Filch filch = new Filch();
        harryPotter1.filch(caretaker);
        harryPotter1.filch(filch);
        System.out.println("Calling Hagrid methods");
        Giant giant = new Hagrid();
        Hagrid hagrid = new Hagrid();
        harryPotter1.hagrid(giant);
        harryPotter1.hagrid(hagrid);
        System.out.println("Calling NearlyHeadlessNick methods");
        Ghost ghost = new NearlyHeadlessNick();
        NearlyHeadlessNick nick = new NearlyHeadlessNick();
        harryPotter1.nick(ghost);
        harryPotter1.nick(nick);
        System.out.println("Calling Dobby methods");
        Elf elf = new Dobby();
        Dobby dobby = new Dobby();
        harryPotter1.dobby(elf);
        harryPotter1.dobby(dobby);
        System.out.println("Calling Dobby methods");
        Elf elf1= new Dobby();
        Dobby dobby1 = new Dobby();
        harryPotter1.dobby(elf);
        harryPotter1.dobby(dobby);
        System.out.println("Calling Ginny Weasley methods");
        QuidditchPlayer player = new GinnyWeasley();
        GinnyWeasley ginny = new GinnyWeasley();
        harryPotter1.ginny(player);
        harryPotter1.ginny(ginny);
        System.out.println("Calling Tonks methods");
        Auror auror = new Tonks();
        Tonks tonks = new Tonks();
        harryPotter1.tonks(auror);
        harryPotter1.tonks(tonks);
        System.out.println("Calling Bellatrix methods");
        DeathEater deathEater = new Bellatrix();
        Bellatrix bellatrix = new Bellatrix();
        harryPotter1.bellatrix(deathEater);
        harryPotter1.bellatrix(bellatrix);
        System.out.println("Calling DracoMalfoy methods");
        Slytherin slytherin = new DracoMalfoy();
        DracoMalfoy dracoMalfoy = new DracoMalfoy();
        harryPotter1.draco(dracoMalfoy);
        harryPotter1.draco(slytherin);
        System.out.println("Calling NevilleLongbottom methods");
        Gryffindor gryffindor = new NevilleLongbottom();
        NevilleLongbottom neville = new NevilleLongbottom();
        harryPotter1.neville(neville);
        harryPotter1.neville(gryffindor);
        System.out.println("Calling LunaLovegood methods");
        Ravenclaw ravenclaw = new LunaLovegood();
        LunaLovegood luna = new LunaLovegood();
        harryPotter1.luna(luna);
        harryPotter1.luna(ravenclaw);
        System.out.println("Calling CedricDiggory methods");
        Hufflepuff hufflepuff = new CedricDiggory();
        CedricDiggory cedric = new CedricDiggory();
        harryPotter1.cedric(cedric);
        harryPotter1.cedric(hufflepuff);
        System.out.println("Calling Fudge methods");
        MinistryOfficial ministryOfficial = new Fudge();
        Fudge fudge = new Fudge();
        harryPotter1.fudge(fudge);
        harryPotter1.fudge(ministryOfficial);









    }
}
