package com.abhi.objects.internal;

import java.util.Objects;

public class Reebok {
    private String brandName;
    private int foundYr;
    private String brandType;
    private String category;

    public Reebok(String brandName, int foundYr, String brandType, String category) {
        this.brandName = brandName;
        this.foundYr = foundYr;
        this.brandType = brandType;
        this.category = category;
    }

    @Override
    public String toString() {
        System.out.println("running toString in Reebok");
        return "brand name :" + this.brandName + ", founded year:" + this.foundYr +
                ", brand type is:" + this.brandType + ", category is :" + this.category;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Reebok) {
            Reebok reebok = (Reebok) obj;
            if (Objects.equals(reebok.brandName, this.brandName)) {
                System.out.println("reebok shoes are matching");
                return true;
            }
        }
        return false;
    }
}
