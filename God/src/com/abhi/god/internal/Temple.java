package com.abhi.god.internal;

public class Temple {
    public  void visit(){
        System.out.println("visit running in temple");
    }
    private  void sweet(){
        System.out.println("parsad running in temple");
    }
    void pooja(){
        sweet();
        System.out.println("pooja running in temple");
    }
}
