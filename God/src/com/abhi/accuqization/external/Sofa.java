package com.abhi.accuqization.external;

import com.abhi.accuqization.internal.Furniture;
import com.abhi.accuqization.internal.Product;

public class Sofa extends Furniture {
    public void sofa() {
        System.out.println("running in Sofa");
        Sofa sofa = new Sofa();
        Furniture furniture = new Sofa();
        Product product = new Sofa();
    }
}
