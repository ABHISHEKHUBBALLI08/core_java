package com.abhi.objects.internal;

import java.util.Objects;

public class DCShoes {
    private String brandName;
    private int foundYr;
    private String brandType;
    private String category;

    public DCShoes(String brandName, int foundYr, String brandType, String category) {
        this.brandName = brandName;
        this.foundYr = foundYr;
        this.brandType = brandType;
        this.category = category;
    }

    @Override
    public String toString() {
        System.out.println("running toString in DCShoes");
        return "brand name :" + this.brandName + ", founded year:" + this.foundYr +
                ", brand type is:" + this.brandType + ", category is :" + this.category;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof DCShoes) {
            DCShoes dc = (DCShoes) obj;
            if (Objects.equals(dc.brandName, this.brandName)) {
                System.out.println("dc shoes are matching");
                return true;
            }
        }
        return false;
    }
}
