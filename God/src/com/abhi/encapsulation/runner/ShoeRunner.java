package com.abhi.encapsulation.runner;

import com.abhi.encapsulation.external.PumaShoe;
import com.abhi.encapsulation.internal.RedtapeShoe;

public class ShoeRunner {
    public static void main(String[] args) {
        RedtapeShoe redtapeShoe=new RedtapeShoe();
        redtapeShoe.shoeDetails();
        PumaShoe pumaShoe=new PumaShoe();
        pumaShoe.shoeDetails();
    }


}
