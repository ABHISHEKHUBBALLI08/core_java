package com.abhi.gadget.repository;

import com.abhi.gadget.dto.GadgetDto;

public class GadgetRepoImpl implements GadgetRepo{
    @Override
    public boolean Persist(GadgetDto gadget) {
        if(gadget!=null){
            System.out.println("gadget is not null");
        }else {
            System.out.println("gadget is null");
        }
        return true;
    }
}
