package com.abhi.objects.internal;

import java.util.Objects;

public class LaSportiva {
    private String brandName;
    private int foundYr;
    private String brandType;
    private String category;

    public LaSportiva(String brandName, int foundYr, String brandType, String category) {
        this.brandName = brandName;
        this.foundYr = foundYr;
        this.brandType = brandType;
        this.category = category;
    }

    @Override
    public String toString() {
        System.out.println("running toString in LaSportiva");
        return "brand name :" + this.brandName + ", founded year:" + this.foundYr +
                ", brand type is:" + this.brandType + ", category is :" + this.category;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof LaSportiva) {
            LaSportiva sportiva = (LaSportiva) obj;
            if (Objects.equals(sportiva.brandName, this.brandName)) {
                System.out.println("la sportiva shoes are matching");
                return true;
            }
        }
        return false;
    }
}
