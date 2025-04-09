package com.abhi.encapsulation.internal;

public class Mutants {
    private int id=10;
    private String name="abhishek";
    private String lastName="hubballi";
    private String mutantPower="wolverine";
    private String weapon="x-blade";

    void setId(int id){
        this.id=id;
    }
    void setName(String name){
        this.name=name;
    }
    void setLastName(String lastName){
        this.lastName=lastName;
    }
    void setMutantPower(String mutantPower){
        this.mutantPower=mutantPower;
    }
    void setWeapon(String weapon){
        this.weapon=weapon;
    }

    public void getId(){
        System.out.println(Id);
    }
    public void getName(){
        System.out.println(name);
    }
    public void getLastName(){
        System.out.println(lastName);
    }
    public void getMutantPower(){
        System.out.println(mutantPower);
    }
    public void getWeapon(){
        System.out.println(weapon);
    }




}
