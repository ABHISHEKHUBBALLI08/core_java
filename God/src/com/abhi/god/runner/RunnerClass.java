package com.abhi.god.runner;

import com.abhi.god.external.*;
import com.abhi.god.internal.*;

public class RunnerClass {
    public static void main(String[] args) {
        Ngo ngo=new Ngo();
        ngo.authority();
        Turst turst=new Turst();
        turst.head();
        System.out.println("========TEMPLE=========");
        Water water = new Water();
        water.properties();
        Visiters visiters=new Visiters();
        visiters.info();
        System.out.println("=========BEACH========");
        Prayer prayer=new Prayer();
        prayer.timing();
        Father father=new Father();
        father.info();
        System.out.println("=========CHURCH========");
        Toss toss=new Toss();
        toss.headOrTail();
        Betting betting=new Betting();
        betting.money();
        System.out.println("=========COIN========");
        Dimensions dimensions=new Dimensions();
        dimensions.info();
        CreaterDetails createrDetails=new CreaterDetails();
        createrDetails.credentials();
        System.out.println("=========DRONE========");
        Price price=new Price();
        price.cost();
        User user=new User();
        user.info();
        System.out.println("=========COMB========");
        Customer customer=new Customer();
        customer.info();
        Value value=new Value();
        value.price();
        System.out.println("=========POWDER========");
        Brands brands=new Brands();
        brands.brandName();
        AlcoholContent alcoholContent=new AlcoholContent();
        alcoholContent.content();
        System.out.println("=========PERFUME========");
        TypeOfCard typeOfCard=new TypeOfCard();
        typeOfCard.Type();
        CardHolder carsHolder=new CardHolder();
        carsHolder.info();
        System.out.println("=========CARD========");
        Usage usage =new Usage();
        usage.info();
        SizeOfShell sizeOfShell= new SizeOfShell();
        sizeOfShell.info();
        System.out.println("=========SHELL========");
        Trees trees=new Trees();
        trees.info();
        Animal animal=new Animal();
        animal.info();
        System.out.println("=========FOREST========");

    }

}
