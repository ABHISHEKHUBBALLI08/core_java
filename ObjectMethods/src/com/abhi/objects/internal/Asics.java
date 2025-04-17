package com.abhi.objects.internal;

import java.util.Objects;

public class Asics {
    private String brandName;
    private int foundYr;
    private String brandType;
    private String category;

    public Asics(String brandName, int foundYr, String brandType, String category) {
        this.brandName = brandName;
        this.foundYr = foundYr;
        this.brandType = brandType;
        this.category = category;
    }

    @Override
    public String toString() {
        System.out.println("running toString in Asics");
        return "brand name :" + this.brandName + ", founded year:" + this.foundYr +
                ", brand type is:" + this.brandType + ", category is :" + this.category;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Asics) {
            Asics asics = (Asics) obj;
            if (Objects.equals(asics.brandName, this.brandName)) {
                System.out.println("asics shoes are matching");
                return true;
            }
        }
        return false;
    }
}
