package com.abhi.gadget.runner;

import com.abhi.gadget.exceptions.GadgetNameMisMatch;
import com.abhi.gadget.exceptions.GadgetPrice;
import com.abhi.gadget.exceptions.GadgetQuantity;
import com.abhi.gadget.exceptions.IdNotFound;

public class GadgetDetails {
    public static void main(String[] args) {
        int id=1234;
        String gadgetName="anyWhereDoor";
        int gadegtPrice=2000;
        int gadgetQuantity=1;
        if (id < 0) {
            throw new IdNotFound("not a valid id");
        }else{
            System.out.println("valid id");
        }
        if(gadgetName==null  || gadgetName=="" ||gadgetName.length()<3){
            throw  new GadgetNameMisMatch("in valid gadget name");
        }else{
            System.out.println("valid gadget name");
        }

        if(gadegtPrice<0 && gadegtPrice>10000 ){
            throw  new GadgetPrice("in valid price for a gadget");
        }else{
            System.out.println("valid gadget price ");
        }
        if(gadgetQuantity<0 && gadgetQuantity>1000 ){
            throw  new GadgetQuantity("in valid price for a gadget");
        }else{
            System.out.println("valid gadget price ");
        }

    }
}
