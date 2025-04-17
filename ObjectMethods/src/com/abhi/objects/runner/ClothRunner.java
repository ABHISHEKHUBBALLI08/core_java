package com.abhi.objects.runner;

import com.abhi.objects.external.*;


public class ClothRunner {
    public static void main(String[] args) {
        Zara zara=new Zara();
        zara.setBrandName("Zara");zara.setFoundYr(1950);zara.setBrandType("cloth");zara.setCategory("fashion");
        System.out.println(zara);
        Zara zara1=new Zara();
        zara1.setBrandName("Zra");zara.setFoundYr(1950);zara.setBrandType("cloth");zara.setCategory("fashion");
        Zara zara2=new Zara();
        zara2.setBrandName("Zara");zara.setFoundYr(1950);zara.setBrandType("cloth");zara.setCategory("fashion");
        boolean result=zara.equals(zara1);
        System.out.println(result);
        boolean result1=zara.equals(zara2);
        System.out.println(result1);


        HM hm = new HM();
        hm.setBrandName("H&M");hm.setFoundYr(1947);hm.setBrandType("cloth");hm.setCategory("fashion");
        System.out.println(hm);
        HM hm1 = new HM();
        hm1.setBrandName("H&M");hm1.setFoundYr(1947);hm1.setBrandType("cloth");hm1.setCategory("fashion");
        HM hm2 = new HM();
        hm2.setBrandName("H&M");hm2.setFoundYr(1947);hm2.setBrandType("cloth");hm2.setCategory("fashion");
        boolean resultHM = hm.equals(hm1);
        System.out.println(resultHM);
        boolean result1HM = hm.equals(hm2);
        System.out.println(result1HM);

        Uniqlo uniqlo = new Uniqlo();
        uniqlo.setBrandName("Uniqlo");uniqlo.setFoundYr(1949);uniqlo.setBrandType("cloth");uniqlo.setCategory("fashion");
        System.out.println(uniqlo);
        Uniqlo uniqlo1 = new Uniqlo();
        uniqlo1.setBrandName("Uniqlo");uniqlo1.setFoundYr(1949);uniqlo1.setBrandType("cloth");uniqlo1.setCategory("fashion");
        Uniqlo uniqlo2 = new Uniqlo();
        uniqlo2.setBrandName("Uniqlo");uniqlo2.setFoundYr(1949);uniqlo2.setBrandType("cloth");uniqlo2.setCategory("fashion");
        boolean resultUniqlo = uniqlo.equals(uniqlo1);
        System.out.println(resultUniqlo);
        boolean result1Uniqlo = uniqlo.equals(uniqlo2);
        System.out.println(result1Uniqlo);


        Levis levis = new Levis();
        levis.setBrandName("Levi's");levis.setFoundYr(1850);levis.setBrandType("cloth");levis.setCategory("fashion");
        System.out.println(levis);
        Levis levis1 = new Levis();
        levis1.setBrandName("Levi's");levis1.setFoundYr(1850);levis1.setBrandType("cloth");levis1.setCategory("fashion");
        Levis levis2 = new Levis();
        levis2.setBrandName("Levi's");levis2.setFoundYr(1850);levis2.setBrandType("cloth");levis2.setCategory("fashion");
        boolean resultLevis = levis.equals(levis1);
        System.out.println(resultLevis);
        boolean result1Levis = levis.equals(levis2);
        System.out.println(result1Levis);

        Forever21 forever21 = new Forever21();
        forever21.setBrandName("Forever 21");forever21.setFoundYr(1984);forever21.setBrandType("cloth");forever21.setCategory("fashion");
        System.out.println(forever21);
        Forever21 forever21_1 = new Forever21();
        forever21_1.setBrandName("Forever 21");forever21_1.setFoundYr(1984);forever21_1.setBrandType("cloth");forever21_1.setCategory("fashion");
        Forever21 forever21_2 = new Forever21();
        forever21_2.setBrandName("Forever 21");forever21_2.setFoundYr(1984);forever21_2.setBrandType("cloth");forever21_2.setCategory("fashion");
        boolean resultForever21 = forever21.equals(forever21_1);
        System.out.println(resultForever21);
        boolean result1Forever21 = forever21.equals(forever21_2);
        System.out.println(result1Forever21);

        Gap gap = new Gap();
        gap.setBrandName("Gap");gap.setFoundYr(1969);gap.setBrandType("cloth");gap.setCategory("fashion");
        System.out.println(gap);
        Gap gap1 = new Gap();
        gap1.setBrandName("Gap");gap1.setFoundYr(1969);gap1.setBrandType("cloth");gap1.setCategory("fashion");
        Gap gap2 = new Gap();
        gap2.setBrandName("Gap");gap2.setFoundYr(1969);gap2.setBrandType("cloth");gap2.setCategory("fashion");
        boolean resultGap = gap.equals(gap1);
        System.out.println(resultGap);
        boolean result1Gap = gap.equals(gap2);
        System.out.println(result1Gap);

        AmericanEagle americanEagleOutfitters = new AmericanEagle();
        americanEagleOutfitters.setBrandName("American Eagle Outfitters");americanEagleOutfitters.setFoundYr(1977);americanEagleOutfitters.setBrandType("cloth");americanEagleOutfitters.setCategory("fashion");
        System.out.println(americanEagleOutfitters);
        AmericanEagle americanEagleOutfitters1 = new AmericanEagle();
        americanEagleOutfitters1.setBrandName("American Eagle Outfitters");americanEagleOutfitters1.setFoundYr(1977);americanEagleOutfitters1.setBrandType("cloth");americanEagleOutfitters1.setCategory("fashion");
        AmericanEagle americanEagleOutfitters2 = new AmericanEagle();
        americanEagleOutfitters2.setBrandName("American Eagle Outfitters");americanEagleOutfitters2.setFoundYr(1977);americanEagleOutfitters2.setBrandType("cloth");americanEagleOutfitters2.setCategory("fashion");
        boolean resultAmericanEagleOutfitters = americanEagleOutfitters.equals(americanEagleOutfitters1);
        System.out.println(resultAmericanEagleOutfitters);
        boolean result1AmericanEagleOutfitters = americanEagleOutfitters.equals(americanEagleOutfitters2);
        System.out.println(result1AmericanEagleOutfitters);

        Abercrombie abercrombieAndFitch = new Abercrombie();
        abercrombieAndFitch.setBrandName("Abercrombie & Fitch");abercrombieAndFitch.setFoundYr(1892);abercrombieAndFitch.setBrandType("cloth");abercrombieAndFitch.setCategory("fashion");
        System.out.println(abercrombieAndFitch);
        Abercrombie abercrombieAndFitch1 = new Abercrombie();
        abercrombieAndFitch1.setBrandName("Abercrombie & Fitch");abercrombieAndFitch1.setFoundYr(1892);abercrombieAndFitch1.setBrandType("cloth");abercrombieAndFitch1.setCategory("fashion");
        Abercrombie abercrombieAndFitch2 = new Abercrombie();
        abercrombieAndFitch2.setBrandName("Abercrombie & Fitch");abercrombieAndFitch2.setFoundYr(1892);abercrombieAndFitch2.setBrandType("cloth");abercrombieAndFitch2.setCategory("fashion");
        boolean resultAbercrombieAndFitch = abercrombieAndFitch.equals(abercrombieAndFitch1);
        System.out.println(resultAbercrombieAndFitch);
        boolean result1AbercrombieAndFitch = abercrombieAndFitch.equals(abercrombieAndFitch2);
        System.out.println(result1AbercrombieAndFitch);

        Hollister hollister = new Hollister();
        hollister.setBrandName("Hollister");hollister.setFoundYr(2000);hollister.setBrandType("cloth");hollister.setCategory("fashion");
        System.out.println(hollister);
        Hollister hollister1 = new Hollister();
        hollister1.setBrandName("Hollister");hollister1.setFoundYr(2000);hollister1.setBrandType("cloth");hollister1.setCategory("fashion");
        Hollister hollister2 = new Hollister();
        hollister2.setBrandName("Hollister");hollister2.setFoundYr(2000);hollister2.setBrandType("cloth");hollister2.setCategory("fashion");
        boolean resultHollister = hollister.equals(hollister1);
        System.out.println(resultHollister);
        boolean result1Hollister = hollister.equals(hollister2);
        System.out.println(result1Hollister);

        BananaRepublic bananaRepublic = new BananaRepublic();
        bananaRepublic.setBrandName("Banana Republic");bananaRepublic.setFoundYr(1978);bananaRepublic.setBrandType("cloth");bananaRepublic.setCategory("fashion");
        System.out.println(bananaRepublic);
        BananaRepublic bananaRepublic1 = new BananaRepublic();
        bananaRepublic1.setBrandName("Banana Republic");bananaRepublic1.setFoundYr(1978);bananaRepublic1.setBrandType("cloth");bananaRepublic1.setCategory("fashion");
        BananaRepublic bananaRepublic2 = new BananaRepublic();
        bananaRepublic2.setBrandName("Banana Republic");bananaRepublic2.setFoundYr(1978);bananaRepublic2.setBrandType("cloth");bananaRepublic2.setCategory("fashion");
        boolean resultBananaRepublic = bananaRepublic.equals(bananaRepublic1);
        System.out.println(resultBananaRepublic);
        boolean result1BananaRepublic = bananaRepublic.equals(bananaRepublic2);
        System.out.println(result1BananaRepublic);

        OldNavy oldNavy = new OldNavy();
        oldNavy.setBrandName("Old Navy");oldNavy.setFoundYr(1994);oldNavy.setBrandType("cloth");oldNavy.setCategory("fashion");
        System.out.println(oldNavy);
        OldNavy oldNavy1 = new OldNavy();
        oldNavy1.setBrandName("Old Navy");oldNavy1.setFoundYr(1994);oldNavy1.setBrandType("cloth");oldNavy1.setCategory("fashion");
        OldNavy oldNavy2 = new OldNavy();
        oldNavy2.setBrandName("Old Navy");oldNavy2.setFoundYr(1994);oldNavy2.setBrandType("cloth");oldNavy2.setCategory("fashion");
        boolean resultOldNavy = oldNavy.equals(oldNavy1);
        System.out.println(resultOldNavy);
        boolean result1OldNavy = oldNavy.equals(oldNavy2);
        System.out.println(result1OldNavy);

        Topshop topshop = new Topshop();
        topshop.setBrandName("Topshop");topshop.setFoundYr(1964);topshop.setBrandType("cloth");topshop.setCategory("fashion");
        System.out.println(topshop);
        Topshop topshop1 = new Topshop();
        topshop1.setBrandName("Topshop");topshop1.setFoundYr(1964);topshop1.setBrandType("cloth");topshop1.setCategory("fashion");
        Topshop topshop2 = new Topshop();
        topshop2.setBrandName("Topshop");topshop2.setFoundYr(1964);topshop2.setBrandType("cloth");topshop2.setCategory("fashion");
        boolean resultTopshop = topshop.equals(topshop1);
        System.out.println(resultTopshop);
        boolean result1Topshop = topshop.equals(topshop2);
        System.out.println(result1Topshop);

        Mango mango = new Mango();
        mango.setBrandName("Mango");mango.setFoundYr(1984);mango.setBrandType("cloth");mango.setCategory("fashion");
        System.out.println(mango);
        Mango mango1 = new Mango();
        mango1.setBrandName("Mango");mango1.setFoundYr(1984);mango1.setBrandType("cloth");mango1.setCategory("fashion");
        Mango mango2 = new Mango();
        mango2.setBrandName("Mango");mango2.setFoundYr(1984);mango2.setBrandType("cloth");mango2.setCategory("fashion");
        boolean resultMango = mango.equals(mango1);
        System.out.println(resultMango);
        boolean result1Mango = mango.equals(mango2);
        System.out.println(result1Mango);

        Shein shein = new Shein();
        shein.setBrandName("Shein");shein.setFoundYr(2008);shein.setBrandType("cloth");shein.setCategory("fashion");
        System.out.println(shein);
        Shein shein1 = new Shein();
        shein1.setBrandName("Shein");shein1.setFoundYr(2008);shein1.setBrandType("cloth");shein1.setCategory("fashion");
        Shein shein2 = new Shein();
        shein2.setBrandName("Shein");shein2.setFoundYr(2008);shein2.setBrandType("cloth");shein2.setCategory("fashion");
        boolean resultShein = shein.equals(shein1);
        System.out.println(resultShein);
        boolean result1Shein = shein.equals(shein2);
        System.out.println(result1Shein);

        ASOS asos = new ASOS();
        asos.setBrandName("ASOS");asos.setFoundYr(2000);asos.setBrandType("cloth");asos.setCategory("fashion");
        System.out.println(asos);
        ASOS asos1 = new ASOS();
        asos1.setBrandName("ASOS");asos1.setFoundYr(2000);asos1.setBrandType("cloth");asos1.setCategory("fashion");
        ASOS asos2 = new ASOS();
        asos2.setBrandName("ASOS");asos2.setFoundYr(2000);asos2.setBrandType("cloth");asos2.setCategory("fashion");
        boolean resultASOS = asos.equals(asos1);
        System.out.println(resultASOS);
        boolean result1ASOS = asos.equals(asos2);
        System.out.println(result1ASOS);

        Boohoo boohoo = new Boohoo();
        boohoo.setBrandName("Boohoo");boohoo.setFoundYr(2006);boohoo.setBrandType("cloth");boohoo.setCategory("fashion");
        System.out.println(boohoo);
        Boohoo boohoo1 = new Boohoo();
        boohoo1.setBrandName("Boohoo");boohoo1.setFoundYr(2006);boohoo1.setBrandType("cloth");boohoo1.setCategory("fashion");
        Boohoo boohoo2 = new Boohoo();
        boohoo2.setBrandName("Boohoo");boohoo2.setFoundYr(2006);boohoo2.setBrandType("cloth");boohoo2.setCategory("fashion");
        boolean resultBoohoo = boohoo.equals(boohoo1);
        System.out.println(resultBoohoo);
        boolean result1Boohoo = boohoo.equals(boohoo2);
        System.out.println(result1Boohoo);

        PrettyLittleThing prettyLittleThing = new PrettyLittleThing();
        prettyLittleThing.setBrandName("PrettyLittleThing");prettyLittleThing.setFoundYr(2012);prettyLittleThing.setBrandType("cloth");prettyLittleThing.setCategory("fashion");
        System.out.println(prettyLittleThing);
        PrettyLittleThing prettyLittleThing1 = new PrettyLittleThing();
        prettyLittleThing1.setBrandName("PrettyLittleThing");prettyLittleThing1.setFoundYr(2012);prettyLittleThing1.setBrandType("cloth");prettyLittleThing1.setCategory("fashion");
        PrettyLittleThing prettyLittleThing2 = new PrettyLittleThing();
        prettyLittleThing2.setBrandName("PrettyLittleThing");prettyLittleThing2.setFoundYr(2012);prettyLittleThing2.setBrandType("cloth");prettyLittleThing2.setCategory("fashion");
        boolean resultPrettyLittleThing = prettyLittleThing.equals(prettyLittleThing1);
        System.out.println(resultPrettyLittleThing);
        boolean result1PrettyLittleThing = prettyLittleThing.equals(prettyLittleThing2);
        System.out.println(result1PrettyLittleThing);

        UrbanOutfitters urbanOutfitters = new UrbanOutfitters();
        urbanOutfitters.setBrandName("Urban Outfitters");urbanOutfitters.setFoundYr(1970);urbanOutfitters.setBrandType("cloth");urbanOutfitters.setCategory("fashion");
        System.out.println(urbanOutfitters);
        UrbanOutfitters urbanOutfitters1 = new UrbanOutfitters();
        urbanOutfitters1.setBrandName("Urban Outfitters");urbanOutfitters1.setFoundYr(1970);urbanOutfitters1.setBrandType("cloth");urbanOutfitters1.setCategory("fashion");
        UrbanOutfitters urbanOutfitters2 = new UrbanOutfitters();
        urbanOutfitters2.setBrandName("Urban Outfitters");urbanOutfitters2.setFoundYr(1970);urbanOutfitters2.setBrandType("cloth");urbanOutfitters2.setCategory("fashion");
        boolean resultUrbanOutfitters = urbanOutfitters.equals(urbanOutfitters1);
        System.out.println(resultUrbanOutfitters);
        boolean result1UrbanOutfitters = urbanOutfitters.equals(urbanOutfitters2);
        System.out.println(result1UrbanOutfitters);

        BrandyMelville brandyMelville = new BrandyMelville();
        brandyMelville.setBrandName("Brandy Melville");brandyMelville.setFoundYr(2009);brandyMelville.setBrandType("cloth");brandyMelville.setCategory("fashion");
        System.out.println(brandyMelville);
        BrandyMelville brandyMelville1 = new BrandyMelville();
        brandyMelville1.setBrandName("Brandy Melville");brandyMelville1.setFoundYr(2009);brandyMelville1.setBrandType("cloth");brandyMelville1.setCategory("fashion");
        BrandyMelville brandyMelville2 = new BrandyMelville();
        brandyMelville2.setBrandName("Brandy Melville");brandyMelville2.setFoundYr(2009);brandyMelville2.setBrandType("cloth");brandyMelville2.setCategory("fashion");
        boolean resultBrandyMelville = brandyMelville.equals(brandyMelville1);
        System.out.println(resultBrandyMelville);
        boolean result1BrandyMelville = brandyMelville.equals(brandyMelville2);
        System.out.println(result1BrandyMelville);

        Missguided missguided = new Missguided();
        missguided.setBrandName("Missguided");missguided.setFoundYr(2009);missguided.setBrandType("cloth");missguided.setCategory("fashion");
        System.out.println(missguided);
        Missguided missguided1 = new Missguided();
        missguided1.setBrandName("Missguided");missguided1.setFoundYr(2009);missguided1.setBrandType("cloth");missguided1.setCategory("fashion");
        Missguided missguided2 = new Missguided();
        missguided2.setBrandName("Missguided");missguided2.setFoundYr(2009);missguided2.setBrandType("cloth");missguided2.setCategory("fashion");
        boolean resultMissguided = missguided.equals(missguided1);
        System.out.println(resultMissguided);
        boolean result1Missguided = missguided.equals(missguided2);
        System.out.println(result1Missguided);

        FashionNova fashionNova = new FashionNova();
        fashionNova.setBrandName("Fashion Nova");fashionNova.setFoundYr(2006);fashionNova.setBrandType("cloth");fashionNova.setCategory("fashion");
        System.out.println(fashionNova);
        FashionNova fashionNova1 = new FashionNova();
        fashionNova1.setBrandName("Fashion Nova");fashionNova1.setFoundYr(2006);fashionNova1.setBrandType("cloth");fashionNova1.setCategory("fashion");
        FashionNova fashionNova2 = new FashionNova();
        fashionNova2.setBrandName("Fashion Nova");fashionNova2.setFoundYr(2006);fashionNova2.setBrandType("cloth");fashionNova2.setCategory("fashion");
        boolean resultFashionNova = fashionNova.equals(fashionNova1);
        System.out.println(resultFashionNova);
        boolean result1FashionNova = fashionNova.equals(fashionNova2);
        System.out.println(result1FashionNova);

        RiverIsland riverIsland = new RiverIsland();
        riverIsland.setBrandName("River Island");riverIsland.setFoundYr(1948);riverIsland.setBrandType("cloth");riverIsland.setCategory("fashion");
        System.out.println(riverIsland);
        RiverIsland riverIsland1 = new RiverIsland();
        riverIsland1.setBrandName("River Island");riverIsland1.setFoundYr(1948);riverIsland1.setBrandType("cloth");riverIsland1.setCategory("fashion");
        RiverIsland riverIsland2 = new RiverIsland();
        riverIsland2.setBrandName("River Island");riverIsland2.setFoundYr(1948);riverIsland2.setBrandType("cloth");riverIsland2.setCategory("fashion");
        boolean resultRiverIsland = riverIsland.equals(riverIsland1);
        System.out.println(resultRiverIsland);
        boolean result1RiverIsland = riverIsland.equals(riverIsland2);
        System.out.println(result1RiverIsland);

        COS cos = new COS();
        cos.setBrandName("COS");cos.setFoundYr(2007);cos.setBrandType("cloth");cos.setCategory("fashion");
        System.out.println(cos);
        COS cos1 = new COS();
        cos1.setBrandName("COS");cos1.setFoundYr(2007);cos1.setBrandType("cloth");cos1.setCategory("fashion");
        COS cos2 = new COS();
        cos2.setBrandName("COS");cos2.setFoundYr(2007);cos2.setBrandType("cloth");cos2.setCategory("fashion");
        boolean resultCOS = cos.equals(cos1);
        System.out.println(resultCOS);
        boolean result1COS = cos.equals(cos2);
        System.out.println(result1COS);

        MassimoDutti massimoDutti = new MassimoDutti();
        massimoDutti.setBrandName("Massimo Dutti");massimoDutti.setFoundYr(1985);massimoDutti.setBrandType("cloth");massimoDutti.setCategory("fashion");
        System.out.println(massimoDutti);
        MassimoDutti massimoDutti1 = new MassimoDutti();
        massimoDutti1.setBrandName("Massimo Dutti");massimoDutti1.setFoundYr(1985);massimoDutti1.setBrandType("cloth");massimoDutti1.setCategory("fashion");
        MassimoDutti massimoDutti2 = new MassimoDutti();
        massimoDutti2.setBrandName("Massimo Dutti");massimoDutti2.setFoundYr(1985);massimoDutti2.setBrandType("cloth");massimoDutti2.setCategory("fashion");
        boolean resultMassimoDutti = massimoDutti.equals(massimoDutti1);
        System.out.println(resultMassimoDutti);
        boolean result1MassimoDutti = massimoDutti.equals(massimoDutti2);
        System.out.println(result1MassimoDutti);

        MarksAndSpencer marksAndSpencer = new MarksAndSpencer();
        marksAndSpencer.setBrandName("Marks & Spencer");marksAndSpencer.setFoundYr(1884);marksAndSpencer.setBrandType("cloth");marksAndSpencer.setCategory("fashion");
        System.out.println(marksAndSpencer);
        MarksAndSpencer marksAndSpencer1 = new MarksAndSpencer();
        marksAndSpencer1.setBrandName("Marks & Spencer");marksAndSpencer1.setFoundYr(1884);marksAndSpencer1.setBrandType("cloth");marksAndSpencer1.setCategory("fashion");
        MarksAndSpencer marksAndSpencer2 = new MarksAndSpencer();
        marksAndSpencer2.setBrandName("Marks & Spencer");marksAndSpencer2.setFoundYr(1884);marksAndSpencer2.setBrandType("cloth");marksAndSpencer2.setCategory("fashion");
        boolean resultMarksAndSpencer = marksAndSpencer.equals(marksAndSpencer1);
        System.out.println(resultMarksAndSpencer);
        boolean result1MarksAndSpencer = marksAndSpencer.equals(marksAndSpencer2);
        System.out.println(result1MarksAndSpencer);


    }
}
