package com.abhi.god.internal;

public class Drone {
    public  void fly(){
        System.out.println("fly running in drone");
    }
    private  void range(){
        System.out.println("range running in drone");
    }
    void features(){
        range();
        System.out.println("features running in drone");
    }
}
