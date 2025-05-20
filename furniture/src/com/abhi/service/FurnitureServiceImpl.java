package com.abhi.service;

import com.abhi.dto.FurnitureDto;

public class FurnitureServiceImpl  implements Service{
    @Override
    public boolean save(FurnitureDto furnitureDto) {
        if(furnitureDto!= null){
            System.out.println("furniture is not null");
            String brand1=furnitureDto.getBrand();
            if(brand1!=null && brand1.length()>2 && brand1.length()<21){
                System.out.println("valid brand name");
            }else{
                System.err.println("in-valid brand name");
                return false;

            }
            String material1=furnitureDto.getMaterial();
            if(material1!=null && !material1.isEmpty() ){
                System.out.println("valid entry of material ");
            }
            else{
                System.err.println("enter the material type");
                return false;
            }
        }
        else {
            System.err.println("furniture is null");
            return false;

        }
        System.out.println("saved successfully");
        return true;
    }
}
