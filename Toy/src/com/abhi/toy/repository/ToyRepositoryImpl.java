package com.abhi.toy.repository;

import com.abhi.toy.dto.ToyDto;

public class ToyRepositoryImpl implements ToyRepository{
public ToyRepositoryImpl(){
    System.out.println("constructor in repository");
}
    @Override
    public boolean persist(ToyDto toyDto) {
        if(toyDto!=null){
            System.out.println("toyDto is not null");
        }else {
            System.out.println("toy is null");
        }
        System.out.println("repository running in toyRepository");
        return true;
    }

}
