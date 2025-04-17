package com.abhi.objects.internal;

import java.util.Objects;

public class HokaOneOne {
    private String brandName;
    private int foundYr;
    private String brandType;
    private String category;

    public HokaOneOne(String brandName, int foundYr, String brandType, String category) {
        this.brandName = brandName;
        this.foundYr = foundYr;
        this.brandType = brandType;
        this.category = category;
    }

    @Override
    public String toString() {
        System.out.println("running toString in HokaOneOne");
        return "brand name :" + this.brandName + ", founded year:" + this.foundYr +
                ", brand type is:" + this.brandType + ", category is :" + this.category;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof HokaOneOne) {
            HokaOneOne hoka = (HokaOneOne) obj;
            if (Objects.equals(hoka.brandName, this.brandName)) {
                System.out.println("hoka one one shoes are matching");
                return true;
            }
        }
        return false;
    }
}
