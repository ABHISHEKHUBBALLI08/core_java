package com.abhi.god.internal;

public class Card {
    public  void type(){
        System.out.println("type running in card");
    }
    private  void uses(){
        System.out.println("uses running in card");
    }
    void event(){
        uses();
        System.out.println("cost running in card");
    }
}
