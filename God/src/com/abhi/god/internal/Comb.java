package com.abhi.god.internal;

public class Comb {
    public  void hair(){
        System.out.println("hair running in Comb");
    }
    private  void style(){
        System.out.println("style running in Comb");
    }
    void features(){
        style();
        System.out.println("features running in Comb");
    }
}
