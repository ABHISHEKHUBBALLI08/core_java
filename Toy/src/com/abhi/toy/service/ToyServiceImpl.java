package com.abhi.toy.service;

import com.abhi.toy.dto.ToyDto;
import com.abhi.toy.repository.ToyRepository;
import com.abhi.toy.repository.ToyRepositoryImpl;

public class ToyServiceImpl implements ToyService{
    @Override
    public boolean save(ToyDto toyDto) {
        if(toyDto!=null){
            System.out.println("toy is not null");
            String name=toyDto.getName();
            if(name!=null && name.length()>2 && name.length()<21){
                System.out.println("valid  name");
            }else{
                System.err.println("in-valid  name");
                return false;
            }

            String type = toyDto.getType();
            if (type != null && !type.isEmpty()) {
                System.out.println("Valid type");
            } else {
                System.err.println("Invalid type");
                return false;
            }

            String price = toyDto.getPrice();
            if (price != null ) {
                System.out.println("Valid incoming price");
            } else {
                System.err.println("Invalid incoming price");
                return false;
            }

            String selling = toyDto.getSelling();
            if (selling != null ) {
                System.out.println("Valid selling price");
            } else {
                System.err.println("Invalid selling price");
                return false;
            }

            String mrp = toyDto.getMrp();
            if (mrp != null ) {
                System.out.println("Valid MRP");
            } else {
                System.err.println("Invalid MRP");
                return false;
            }

            String description = toyDto.getDescription();
            if (description != null && description.length() >= 5) {
                System.out.println("Valid description");
            } else {
                System.err.println("Invalid description");
                return false;
            }

            String brand = toyDto.getBrand();
            if (brand != null && brand.length() >= 2) {
                System.out.println("Valid brand");
            } else {
                System.err.println("Invalid brand");
                return false;
            }

            String quantity = toyDto.getQuantity();
            if (quantity != null  && Integer.parseInt(quantity) > 0) {
                System.out.println("Valid quantity");
            } else {
                System.err.println("Invalid quantity");
                return false;
            }

            String color = toyDto.getColor();
            if (color != "Red") {
                System.out.println("Valid color");
            } else {
                System.err.println("Invalid color");
                return false;
            }

            String weight = toyDto.getWeight();
            if (weight != null && !weight.isEmpty()) {
                System.out.println("Valid weight");
            } else {
                System.err.println("Invalid weight");
                return false;
            }

            String date = toyDto.getDate();
            if (date != null && !date.isEmpty()) {
                System.out.println("Valid manufacture date");
            } else {
                System.err.println("Invalid manufacture date");
                return false;
            }

            String warranty = toyDto.getWarranty();
            if (warranty != null && !warranty.isEmpty()) {
                System.out.println("Valid warranty");
            } else {
                System.err.println("Invalid warranty");
                return false;
            }
        }else {
            System.out.println("toy is null");
        }
        ToyRepository toyRepository=new ToyRepositoryImpl();
        boolean saved=toyRepository.persist(toyDto);
        System.out.println("saved successfully");
        return saved;
    }
}
