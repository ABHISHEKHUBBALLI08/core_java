package com.abhi.god.internal;

public class Beach {
    public  void visit(){
        System.out.println("visit running in beach");
    }
    private  void swim(){
        System.out.println("swim running in beach");
    }
    void photos(){
        swim();
        System.out.println("photos running in beach");
    }

}
