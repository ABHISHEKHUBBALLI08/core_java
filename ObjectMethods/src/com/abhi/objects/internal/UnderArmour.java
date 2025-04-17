package com.abhi.objects.internal;

import java.util.Objects;

public class UnderArmour {
    private String brandName;
    private int foundYr;
    private String brandType;
    private String category;

    public UnderArmour(String brandName, int foundYr, String brandType, String category) {
        this.brandName = brandName;
        this.foundYr = foundYr;
        this.brandType = brandType;
        this.category = category;
    }

    @Override
    public String toString() {
        System.out.println("running toString in UnderArmour");
        return "brand name :" + this.brandName + ", founded year:" + this.foundYr +
                ", brand type is:" + this.brandType + ", category is :" + this.category;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof UnderArmour) {
            UnderArmour ua = (UnderArmour) obj;
            if (Objects.equals(ua.brandName, this.brandName)) {
                System.out.println("under armour shoes are matching");
                return true;
            }
        }
        return false;
    }
}
