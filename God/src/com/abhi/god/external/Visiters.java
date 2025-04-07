package com.abhi.god.external;

import com.abhi.god.internal.Beach;

public class Visiters {
    public void info(){
        System.out.println("visiters running in Beach");
        Beach beach =new Beach();
        beach.visit();
    }
}
