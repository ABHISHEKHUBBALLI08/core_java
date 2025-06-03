package com.abhi.gadget.service;


import com.abhi.gadget.dto.GadgetDto;
import com.abhi.gadget.exceptions.GadgetNameMisMatch;
import com.abhi.gadget.exceptions.GadgetPrice;
import com.abhi.gadget.exceptions.GadgetQuantity;
import com.abhi.gadget.exceptions.IdNotFound;

public class ProductServiceImpl  implements ProductService{
    @Override
    public boolean save(GadgetDto gadget) {
        if (gadget.getProductId() <= 0) {
            throw new IdNotFound("Product ID must be a positive integer.");
        }

        if (gadget.getProductName() == null || gadget.getProductName().trim().isEmpty() || gadget.getProductName().length() < 3) {
            throw new GadgetNameMisMatch("Product name must be at least 3 characters long and not empty.");
        }

        if (gadget.getPrice() <= 0 || gadget.getPrice() > 10000) {
            throw new GadgetPrice("Price must be greater than 0 and less than or equal to 10,000.");
        }

        if (gadget.getQuantity() < 0 || gadget.getQuantity() > 1000) {
            throw new GadgetQuantity("Quantity must be between 0 and 1000.");
        }

        if (!isValidCategory(gadget.getCategory())) {
            throw new IllegalArgumentException("Invalid category. Allowed: Electronics, Clothing, Books, Home.");
        }

        System.out.println("Product is valid and ready to save.");
        return false;
    }



    private boolean isValidCategory(String category) {
        return category != null && (
                category.equalsIgnoreCase("Electronics") ||
                        category.equalsIgnoreCase("Clothing") ||
                        category.equalsIgnoreCase("Books") ||
                        category.equalsIgnoreCase("Home")
        );
    }
}
