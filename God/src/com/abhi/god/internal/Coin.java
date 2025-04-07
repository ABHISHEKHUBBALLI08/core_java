package com.abhi.god.internal;

public class Coin {
    public  void face(){
        System.out.println("face running in coin");
    }
    private  void head(){
        System.out.println("head running in coin");
    }
    void tail(){
        head();
        System.out.println("tail running in coin");
    }
}
