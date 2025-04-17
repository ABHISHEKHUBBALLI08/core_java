package com.abhi.objects.external;

import java.util.Objects;

public class Hollister {
    private String brandName;
    private int foundYr;
    private String brandType;
    private String category;

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setFoundYr(int foundYr) {
        this.foundYr = foundYr;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        System.out.println("running toString in Hollister");
        return "brand name :" + this.brandName + ", founded year:" + this.foundYr +
                ", brand type is:" + this.brandType + ", category is :" + this.category;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Hollister) {
            Hollister col = (Hollister) obj;
            if (Objects.equals(col.brandName, this.brandName)) {
                System.out.println("Hollister clothes are matching");
                return true;
            }
        }
        return false;
    }
}
