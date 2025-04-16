package com.abhi.override.internal;

public class Xmen {
    private String name;
    private String power;
    public Xmen (){}
    public Xmen(String name,String power){
        this.name=name;
        this.power=power;
        System.out.println("arg constructor running in Xmen");
    }

    @Override
    public String toString() {
        System.out.println(" running in toString");
        return "name:"+this.name+" power: "+this.power;
    }

    public void mutant(){
        System.out.println(" xmen is a mutant");
    }
}
