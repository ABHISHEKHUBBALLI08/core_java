package com.abhi.god.external;

import com.abhi.god.internal.Church;

public class Father {
    public  void info(){
        System.out.println("info running in father");
        Church church =new Church();
        church.visit();
    }
}
