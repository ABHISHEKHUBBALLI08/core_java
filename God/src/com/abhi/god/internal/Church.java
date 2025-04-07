package com.abhi.god.internal;

public class Church {
    public  void visit(){
        System.out.println("visit running in church");
    }
    private  void pray(){
        System.out.println("pray running in church");
    }
    void blessings(){
        pray();
        System.out.println("blessings running in church");
    }
}
