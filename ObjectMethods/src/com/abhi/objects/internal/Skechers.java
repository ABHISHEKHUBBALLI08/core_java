package com.abhi.objects.internal;

import java.util.Objects;

public class Skechers {
    private String brandName;
    private int foundYr;
    private String brandType;
    private String category;

    public Skechers(String brandName, int foundYr, String brandType, String category) {
        this.brandName = brandName;
        this.foundYr = foundYr;
        this.brandType = brandType;
        this.category = category;
    }

    @Override
    public String toString() {
        System.out.println("running toString in Skechers");
        return "brand name :" + this.brandName + ", founded year:" + this.foundYr +
                ", brand type is:" + this.brandType + ", category is :" + this.category;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Skechers) {
            Skechers skechers = (Skechers) obj;
            if (Objects.equals(skechers.brandName, this.brandName)) {
                System.out.println("skechers shoes are matching");
                return true;
            }
        }
        return false;
    }
}
