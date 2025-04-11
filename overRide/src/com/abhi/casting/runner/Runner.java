package com.abhi.casting.runner;

import com.abhi.casting.internal.Generator;
import com.abhi.casting.internal.Inverter;

public class Runner {
    public static void main(String[] args) {
        System.out.println(" running in RUNNER");
        Generator generator=new Generator();
        generator.current();
        Generator generator1=new Inverter();
        Inverter inverter =(Inverter) generator1;
        inverter.current();
        inverter.backup();
        Inverter inverter1=new Inverter();
        inverter1.current();
        inverter1.backup();
    }
}
