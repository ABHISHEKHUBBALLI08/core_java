package com.abhi.god.internal;

public class Customer {
    public void info(){
        System.out.println("info running in customer");
        Powder powder=new Powder();
        powder.brand();
        powder.cost();

    }
}
