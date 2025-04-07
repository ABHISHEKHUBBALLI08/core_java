package com.abhi.god.internal;

public class Perfume {
    public  void brand(){
        System.out.println("brand running in Perfume");
    }
    private  void user(){
        System.out.println("user running in Perfume");
    }
    void cost(){
        user();
        System.out.println("cost running in Perfume");
    }
}
