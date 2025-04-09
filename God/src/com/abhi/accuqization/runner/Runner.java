package com.abhi.accuqization.runner;

import com.abhi.accuqization.external.Biscuit;
import com.abhi.accuqization.external.GoodDayBiscuit;
import com.abhi.accuqization.external.Tap;
import com.abhi.accuqization.internal.Academy;
import com.abhi.accuqization.internal.Snack;
import com.abhi.accuqization.external.Omlet;
import com.abhi.accuqization.internal.SideDish;
import com.abhi.accuqization.external.Actor;
import com.abhi.accuqization.internal.Person;
import com.abhi.accuqization.external.Revolver;
import com.abhi.accuqization.internal.Weapon;
import com.abhi.accuqization.external.Cactus;
import com.abhi.accuqization.internal.Plant;
import com.abhi.accuqization.external.Thread;
import com.abhi.accuqization.internal.Cotton;
import com.abhi.accuqization.external.Lock;
import com.abhi.accuqization.external.Led;
import com.abhi.accuqization.external.Sneaker;
import com.abhi.accuqization.internal.Shoe;
import com.abhi.accuqization.external.Sofa;
import com.abhi.accuqization.internal.Furniture;

public class Runner {
    public static void main(String[] args) {
        System.out.println(" Good day biscuit ");
        Snack snack=new Snack();
        snack.fastFood();
        Biscuit biscuit=new Biscuit();
        biscuit.cookies();
        GoodDayBiscuit goodDayBiscuit=new GoodDayBiscuit();
        goodDayBiscuit.Cookie();
        System.out.println("Tap academy organization ");
        Academy academy=new Academy();
        academy.institute();
        Tap tap=new Tap();
        tap.academy();
        System.out.println("Omlet is a sidedish used in dinner");
        SideDish sidedish = new SideDish();
        sidedish.sideDish();
        Omlet omlet = new Omlet();
        omlet.omlet();
        System.out.println("Actor person human");
        Person person = new Person();
        person.person();
        Actor actor = new Actor();
        actor.actor();
        System.out.println("Revolver weapon tool");
        Weapon weapon = new Weapon();
        weapon.weapon();
        Revolver revolver = new Revolver();
        revolver.revolver();
        System.out.println("Cactus plant thing");
        Plant plant = new Plant();
        plant.plant();
        Cactus cactus = new Cactus();
        cactus.cactus();
        System.out.println("Thread cotton material");
        Cotton cotton = new Cotton();
        cotton.cotton();
        Thread thread = new Thread();
        thread.thread();
        System.out.println("Lock security");
        Lock lock = new Lock();
        lock.lock();
        System.out.println("LED light");
        Led led = new Led();
        led.led();
        System.out.println("Sneaker shoe accessory");
        Shoe shoe = new Shoe();
        shoe.shoe();
        Sneaker sneaker = new Sneaker();
        sneaker.sneaker();
        System.out.println("Sofa furniture product");
        Furniture furniture = new Furniture();
        furniture.furniture();
        Sofa sofa = new Sofa();
        sofa.sofa();


    }
}
