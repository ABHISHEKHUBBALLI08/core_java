package com.abhi.objects.abstractt.runner;

import com.abhi.objects.abstractt.internal.*;

public class Runner {
    public static void main(String[] args) {
        Imagine imagine= new Imagine();
        imagine.imagination();
        Rectangle rectangle=new Rectangle();
        rectangle.shape();
        Art art=new Art();
        art.working();
        CementRoad cementRoad=new CementRoad();
        cementRoad.construction();
        IOT iot=new IOT();
        iot.working();
    }
}
