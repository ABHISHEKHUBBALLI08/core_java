package com.abhi.gadget.service;


import com.abhi.gadget.dto.GadgetDto;
import com.abhi.gadget.exceptions.GadgetNameMisMatch;
import com.abhi.gadget.exceptions.GadgetPrice;
import com.abhi.gadget.exceptions.GadgetQuantity;
import com.abhi.gadget.exceptions.IdNotFound;
import com.abhi.gadget.repository.GadgetRepo;
import com.abhi.gadget.repository.GadgetRepoImpl;

public class ProductServiceImpl  implements ProductService{
    @Override
    public boolean save(GadgetDto gadget) {

        if (gadget.getProductId() <= 0) {
            throw new IdNotFound("Product ID must be a positive integer.");
        }else{
            System.out.println("crt ID");
        }

        if (gadget.getProductName() == null || gadget.getProductName().trim().isEmpty() || gadget.getProductName().length() < 3) {
            throw new GadgetNameMisMatch("Product name must be at least 3 characters long and not empty.");
        }else{
            System.out.println("crt productname");
        }

        if (gadget.getPrice() <= 0 || gadget.getPrice() > 10000) {
            throw new GadgetPrice("Price must be greater than 0 and less than or equal to 10,000.");
        }else{
            System.out.println("crt price");
        }

        if (gadget.getQuantity() < 0 || gadget.getQuantity() > 1000) {
            throw new GadgetQuantity("Quantity must be between 0 and 1000.");
        }else{
            System.out.println("crt quantity");
        }

        if (!isValidCategory(gadget.getCategory())) {
            throw new IllegalArgumentException("Invalid category. Allowed: Electronics, Clothing, Books.");
        }
        else{
            System.out.println("crt category");
        }
        GadgetRepo gadget1=new GadgetRepoImpl();
        boolean saved =gadget1.Persist(gadget);
        return saved;
    }



    private boolean isValidCategory(String category) {
        return category != null && (
                category.equalsIgnoreCase("Electronics") ||
                        category.equalsIgnoreCase("Clothing") ||
                        category.equalsIgnoreCase("Books")
        );
    }
}
