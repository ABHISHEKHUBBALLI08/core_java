package com.abhi.accuqization.external;

import com.abhi.accuqization.internal.Weapon;
import com.abhi.accuqization.internal.Tool;

public class Revolver extends Weapon {
    public void revolver() {
        System.out.println("running in Revolver");
        Revolver revolver = new Revolver();
        Weapon weapon = new Revolver();
        Tool tool = new Revolver();
    }
}
