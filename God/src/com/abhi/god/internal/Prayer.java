package com.abhi.god.internal;

public class Prayer {
    public void timing(){
        System.out.println(" timing running in prayer");
        Church church=new Church();
        church.blessings();
        church.visit();
    }
}
