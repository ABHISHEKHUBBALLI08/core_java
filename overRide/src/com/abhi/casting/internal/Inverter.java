package com.abhi.casting.internal;

public class Inverter extends  Generator{
    public Inverter(){
        System.out.println("no arg constructor in Inverter");
    }
    @Override
    public void current(){
        System.out.println("current running in inverter");
    }
    public void backup(){
        System.out.println("backup running in inverter");
    }
}
