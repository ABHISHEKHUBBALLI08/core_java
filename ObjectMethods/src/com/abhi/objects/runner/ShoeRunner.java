package com.abhi.objects.runner;

import com.abhi.objects.internal.*;

public class ShoeRunner {
    public static void main(String[] args) {
        Nike nike=new Nike("Nike",1964,"shoe","sportswear");
        System.out.println(nike);
        Nike nike2=new Nike("Ni",1964,"shoe","sportswear");
        Nike nike3=new Nike("Nike",1964,"shoe","sportswear");
        boolean result=nike.equals(nike2);
        System.out.println(result);
        boolean result2=nike.equals(nike3);
        System.out.println(result2);

        Puma puma = new Puma("Puma", 1948, "shoe", "sportswear");
        System.out.println(puma);
        Puma puma2 = new Puma("Pu", 1948, "shoe", "sportswear");
        Puma puma3 = new Puma("Puma", 1948, "shoe", "sportswear");
        result = puma.equals(puma2);
        System.out.println(result);
        result2 = puma.equals(puma3);
        System.out.println(result2);
        System.out.println("=========================");

        Adidas adidas = new Adidas("Adidas", 1949, "shoe", "sportswear");
        System.out.println(adidas);
        Adidas adidas2 = new Adidas("Adi", 1949, "shoe", "sportswear");
        Adidas adidas3 = new Adidas("Adidas", 1949, "shoe", "sportswear");
        result = adidas.equals(adidas2);
        System.out.println(result);
        result2 = adidas.equals(adidas3);
        System.out.println(result2);
        System.out.println("=========================");

        Reebok reebok = new Reebok("Reebok", 1958, "shoe", "sportswear");
        System.out.println(reebok);
        Reebok reebok2 = new Reebok("Ree", 1958, "shoe", "sportswear");
        Reebok reebok3 = new Reebok("Reebok", 1958, "shoe", "sportswear");
        result = reebok.equals(reebok2);
        System.out.println(result);
        result2 = reebok.equals(reebok3);
        System.out.println(result2);
        System.out.println("=========================");

        NewBalance newBalance = new NewBalance("NewBalance", 1906, "shoe", "sportswear");
        System.out.println(newBalance);
        NewBalance newBalance2 = new NewBalance("New", 1906, "shoe", "sportswear");
        NewBalance newBalance3 = new NewBalance("NewBalance", 1906, "shoe", "sportswear");
        result = newBalance.equals(newBalance2);
        System.out.println(result);
        result2 = newBalance.equals(newBalance3);
        System.out.println(result2);
        System.out.println("=========================");

        UnderArmour underArmour = new UnderArmour("UnderArmour", 1996, "shoe", "sportswear");
        System.out.println(underArmour);
        UnderArmour underArmour2 = new UnderArmour("Under", 1996, "shoe", "sportswear");
        UnderArmour underArmour3 = new UnderArmour("UnderArmour", 1996, "shoe", "sportswear");
        result = underArmour.equals(underArmour2);
        System.out.println(result);
        result2 = underArmour.equals(underArmour3);
        System.out.println(result2);
        System.out.println("=========================");

        Asics asics = new Asics("Asics", 1949, "shoe", "sportswear");
        System.out.println(asics);
        Asics asics2 = new Asics("A", 1949, "shoe", "sportswear");
        Asics asics3 = new Asics("Asics", 1949, "shoe", "sportswear");
        result = asics.equals(asics2);
        System.out.println(result);
        result2 = asics.equals(asics3);
        System.out.println(result2);
        System.out.println("=========================");

        Mizuno mizuno = new Mizuno("Mizuno", 1906, "shoe", "sportswear");
        System.out.println(mizuno);
        Mizuno mizuno2 = new Mizuno("Mi", 1906, "shoe", "sportswear");
        Mizuno mizuno3 = new Mizuno("Mizuno", 1906, "shoe", "sportswear");
        result = mizuno.equals(mizuno2);
        System.out.println(result);
        result2 = mizuno.equals(mizuno3);
        System.out.println(result2);
        System.out.println("=========================");

        Merrell merrell = new Merrell("Merrell", 1981, "shoe", "outdoor");
        System.out.println(merrell);
        Merrell merrell2 = new Merrell("Me", 1981, "shoe", "outdoor");
        Merrell merrell3 = new Merrell("Merrell", 1981, "shoe", "outdoor");
        result = merrell.equals(merrell2);
        System.out.println(result);
        result2 = merrell.equals(merrell3);
        System.out.println(result2);
        System.out.println("=========================");

        LaSportiva laSportiva = new LaSportiva("LaSportiva", 1928, "shoe", "mountain");
        System.out.println(laSportiva);
        LaSportiva laSportiva2 = new LaSportiva("La", 1928, "shoe", "mountain");
        LaSportiva laSportiva3 = new LaSportiva("LaSportiva", 1928, "shoe", "mountain");
        result = laSportiva.equals(laSportiva2);
        System.out.println(result);
        result2 = laSportiva.equals(laSportiva3);
        System.out.println(result2);
        System.out.println("=========================");

        Altra altra = new Altra("Altra", 2009, "shoe", "trail");
        System.out.println(altra);
        Altra altra2 = new Altra("Al", 2009, "shoe", "trail");
        Altra altra3 = new Altra("Altra", 2009, "shoe", "trail");
        result = altra.equals(altra2);
        System.out.println(result);
        result2 = altra.equals(altra3);
        System.out.println(result2);
        System.out.println("=========================");

        NorthFace northFace = new NorthFace("NorthFace", 1966, "gear", "outdoor");
        System.out.println(northFace);
        NorthFace northFace2 = new NorthFace("No", 1966, "gear", "outdoor");
        NorthFace northFace3 = new NorthFace("NorthFace", 1966, "gear", "outdoor");
        result = northFace.equals(northFace2);
        System.out.println(result);
        result2 = northFace.equals(northFace3);
        System.out.println(result2);
        System.out.println("=========================");

        Timberland timberland = new Timberland("Timberland", 1973, "shoe", "outdoor");
        System.out.println(timberland);
        Timberland timberland2 = new Timberland("Tim", 1973, "shoe", "outdoor");
        Timberland timberland3 = new Timberland("Timberland", 1973, "shoe", "outdoor");
        result = timberland.equals(timberland2);
        System.out.println(result);
        result2 = timberland.equals(timberland3);
        System.out.println(result2);
        System.out.println("=========================");

        Salomon salomon = new Salomon("Salomon", 1947, "shoe", "outdoor");
        System.out.println(salomon);
        Salomon salomon2 = new Salomon("Sa", 1947, "shoe", "outdoor");
        Salomon salomon3 = new Salomon("Salomon", 1947, "shoe", "outdoor");
        result = salomon.equals(salomon2);
        System.out.println(result);
        result2 = salomon.equals(salomon3);
        System.out.println(result2);
        System.out.println("=========================");

        Saucony saucony = new Saucony("Saucony", 1898, "shoe", "running");
        System.out.println(saucony);
        Saucony saucony2 = new Saucony("Sau", 1898, "shoe", "running");
        Saucony saucony3 = new Saucony("Saucony", 1898, "shoe", "running");
        result = saucony.equals(saucony2);
        System.out.println(result);
        result2 = saucony.equals(saucony3);
        System.out.println(result2);
        System.out.println("=========================");

        Skechers skechers = new Skechers("Skechers", 1992, "shoe", "casual");
        System.out.println(skechers);
        Skechers skechers2 = new Skechers("Sk", 1992, "shoe", "casual");
        Skechers skechers3 = new Skechers("Skechers", 1992, "shoe", "casual");
        result = skechers.equals(skechers2);
        System.out.println(result);
        result2 = skechers.equals(skechers3);
        System.out.println(result2);
        System.out.println("=========================");

        Vans vans = new Vans("Vans", 1966, "shoe", "skate");
        System.out.println(vans);
        Vans vans2 = new Vans("Va", 1966, "shoe", "skate");
        Vans vans3 = new Vans("Vans", 1966, "shoe", "skate");
        result = vans.equals(vans2);
        System.out.println(result);
        result2 = vans.equals(vans3);
        System.out.println(result2);
        System.out.println("=========================");

        Brooks brooks = new Brooks("Brooks", 1914, "shoe", "running");
        System.out.println(brooks);
        Brooks brooks2 = new Brooks("Br", 1914, "shoe", "running");
        Brooks brooks3 = new Brooks("Brooks", 1914, "shoe", "running");
        result = brooks.equals(brooks2);
        System.out.println(result);
        result2 = brooks.equals(brooks3);
        System.out.println(result2);
        System.out.println("=========================");

        Fila fila = new Fila("Fila", 1911, "shoe", "sportswear");
        System.out.println(fila);
        Fila fila2 = new Fila("Fi", 1911, "shoe", "sportswear");
        Fila fila3 = new Fila("Fila", 1911, "shoe", "sportswear");
        result = fila.equals(fila2);
        System.out.println(result);
        result2 = fila.equals(fila3);
        System.out.println(result2);
        System.out.println("=========================");

        HokaOneOne hoka = new HokaOneOne("HokaOneOne", 2009, "shoe", "running");
        System.out.println(hoka);
        HokaOneOne hoka2 = new HokaOneOne("Ho", 2009, "shoe", "running");
        HokaOneOne hoka3 = new HokaOneOne("HokaOneOne", 2009, "shoe", "running");
        result = hoka.equals(hoka2);
        System.out.println(result);
        result2 = hoka.equals(hoka3);
        System.out.println(result2);
        System.out.println("=========================");

        Jordan jordan = new Jordan("Jordan", 1984, "shoe", "basketball");
        System.out.println(jordan);
        Jordan jordan2 = new Jordan("Jo", 1984, "shoe", "basketball");
        Jordan jordan3 = new Jordan("Jordan", 1984, "shoe", "basketball");
        result = jordan.equals(jordan2);
        System.out.println(result);
        result2 = jordan.equals(jordan3);
        System.out.println(result2);
        System.out.println("=========================");

        OnRunning on = new OnRunning("OnRunning", 2010, "shoe", "performance");
        System.out.println(on);
        OnRunning on2 = new OnRunning("On", 2010, "shoe", "performance");
        OnRunning on3 = new OnRunning("OnRunning", 2010, "shoe", "performance");
        result = on.equals(on2);
        System.out.println(result);
        result2 = on.equals(on3);
        System.out.println(result2);
        System.out.println("=========================");

        Converse converse = new Converse("Converse", 1908, "shoe", "casual");
        System.out.println(converse);
        Converse converse2 = new Converse("Co", 1908, "shoe", "casual");
        Converse converse3 = new Converse("Converse", 1908, "shoe", "casual");
        result = converse.equals(converse2);
        System.out.println(result);
        result2 = converse.equals(converse3);
        System.out.println(result2);
        System.out.println("=========================");

        DCShoes dcShoes = new DCShoes("DCShoes", 1994, "shoe", "skate");
        System.out.println(dcShoes);
        DCShoes dcShoes2 = new DCShoes("DC", 1994, "shoe", "skate");
        DCShoes dcShoes3 = new DCShoes("DCShoes", 1994, "shoe", "skate");
        result = dcShoes.equals(dcShoes2);
        System.out.println(result);
        result2 = dcShoes.equals(dcShoes3);
        System.out.println(result2);
        System.out.println("=========================");

        Columbia columbia = new Columbia("Columbia", 1938, "gear", "outdoor");
        System.out.println(columbia);
        Columbia columbia2 = new Columbia("Co", 1938, "gear", "outdoor");
        Columbia columbia3 = new Columbia("Columbia", 1938, "gear", "outdoor");
        result = columbia.equals(columbia2);
        System.out.println(result);
        result2 = columbia.equals(columbia3);
        System.out.println(result2);
        System.out.println("=========================");


    }
}
