package com.abhi.override.runner;

import com.abhi.override.internal.*;
import com.abhi.override.external.Xmen1;

public class Runner {
    public static void main(String[] args) {
        Xmen1 xmen = new Xmen1();
        System.out.println("Running in Runner2 for X-Men Universe");

        System.out.println("Calling Wolverine methods");
        Xmen base1 = new Wolverine();
        Wolverine sub1 = new Wolverine();
        xmen.wolverine(base1);
        xmen.wolverine(sub1);

        System.out.println("Calling CharlesXavier methods");
        Telepath base2 = new CharlesXavier();
        CharlesXavier sub2 = new CharlesXavier();
        xmen.charlesXavier(base2);
        xmen.charlesXavier(sub2);

        System.out.println("Calling JeanGrey methods");
        PhoenixHost base3 = new JeanGrey();
        JeanGrey sub3 = new JeanGrey();
        xmen.jeanGrey(base3);
        xmen.jeanGrey(sub3);

        System.out.println("Calling ErikLehnsherr methods");
        MagnetismMaster base4 = new ErikLehnsherr();
        ErikLehnsherr sub4 = new ErikLehnsherr();
        xmen.erikLehnsherr(base4);
        xmen.erikLehnsherr(sub4);

        System.out.println("Calling ScottSummers methods");
        OpticBlaster base5 = new ScottSummers();
        ScottSummers sub5 = new ScottSummers();
        xmen.scottSummers(base5);
        xmen.scottSummers(sub5);

        System.out.println("Calling StormMonroe methods");
        WeatherController base6 = new StormMonroe();
        StormMonroe sub6 = new StormMonroe();
        xmen.stormMonroe(base6);
        xmen.stormMonroe(sub6);

        System.out.println("Calling HankMcCoy methods");
        BeastlyMutant base7 = new HankMcCoy();
        HankMcCoy sub7 = new HankMcCoy();
        xmen.hankMcCoy(base7);
        xmen.hankMcCoy(sub7);

        System.out.println("Calling Mystique methods");
        Shapeshifter base8 = new Mystique();
        Mystique sub8 = new Mystique();
        xmen.mystique(base8);
        xmen.mystique(sub8);

        System.out.println("Calling Elixir methods");
        Healer base9 = new Elixir();
        Elixir sub9 = new Elixir();
        xmen.elixir(base9);
        xmen.elixir(sub9);

        System.out.println("Calling KittyPryde methods");
        Phaser base10 = new KittyPryde();
        KittyPryde sub10 = new KittyPryde();
        xmen.kittyPryde(base10);
        xmen.kittyPryde(sub10);

        System.out.println("Calling Nightcrawler methods");
        TeleportingMutant base11 = new Nightcrawler();
        Nightcrawler sub11 = new Nightcrawler();
        xmen.nightcrawler(base11);
        xmen.nightcrawler(sub11);

        System.out.println("Calling Rogue methods");
        EnergyAbsorber base12 = new Rogue();
        Rogue sub12 = new Rogue();
        xmen.rogue(base12);
        xmen.rogue(sub12);

        System.out.println("Calling Cable methods");
        TimeManipulator base13 = new Cable();
        Cable sub13 = new Cable();
        xmen.cable(base13);
        xmen.cable(sub13);

        System.out.println("Calling Colossus methods");
        MetalSkinMutant base14 = new Colossus();
        Colossus sub14 = new Colossus();
        xmen.colossus(base14);
        xmen.colossus(sub14);

        System.out.println("Calling EmmaFrost methods");
        PsychicMutant base15 = new EmmaFrost();
        EmmaFrost sub15 = new EmmaFrost();
        xmen.emmaFrost(base15);
        xmen.emmaFrost(sub15);

        System.out.println("Calling Bishop methods");
        EnergyProjector base16 = new Bishop();
        Bishop sub16 = new Bishop();
        xmen.bishop(base16);
        xmen.bishop(sub16);

        System.out.println("Calling Mastermind methods");
        Illusionist base17 = new Mastermind();
        Mastermind sub17 = new Mastermind();
        xmen.mastermind(base17);
        xmen.mastermind(sub17);

        System.out.println("Calling Forge methods");
        WeatherMutant base18 = new Forge();
        Forge sub18 = new Forge();
        xmen.forge(base18);
        xmen.forge(sub18);

        System.out.println("Calling Beast methods");
        BeastMutant base19 = new Beast();
        Beast sub19 = new Beast();
        xmen.beast(base19);
        xmen.beast(sub19);

        System.out.println("Calling Caliban methods");
        TrackerMutant base20 = new Caliban();
        Caliban sub20 = new Caliban();
        xmen.caliban(base20);
        xmen.caliban(sub20);

        System.out.println("Calling Havok methods");
        PlasmaMutant base21 = new Havok();
        Havok sub21 = new Havok();
        xmen.havok(base21);
        xmen.havok(sub21);

        System.out.println("Calling Domino methods");
        ShadowMutant base22 = new Domino();
        Domino sub22 = new Domino();
        xmen.domino(base22);
        xmen.domino(sub22);

        System.out.println("Calling Magik methods");
        MagicUser base23 = new Magik();
        Magik sub23 = new Magik();
        xmen.magik(base23);
        xmen.magik(sub23);

        System.out.println("Calling Quicksilver methods");
        SpeedMutant base24 = new Quicksilver();
        Quicksilver sub24 = new Quicksilver();
        xmen.quicksilver(base24);
        xmen.quicksilver(sub24);

        System.out.println("Calling SilverSamurai methods");
        SwordFighter base25 = new SilverSamurai();
        SilverSamurai sub25 = new SilverSamurai();
        xmen.silverSamurai(base25);
        xmen.silverSamurai(sub25);
    }
}
