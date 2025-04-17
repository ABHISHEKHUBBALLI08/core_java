package com.abhi.objects.external;

import java.util.Objects;

public class Forever21 {
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
        System.out.println("running toString in Forever21");
        return "brand name :" + this.brandName + ", founded year:" + this.foundYr +
                ", brand type is:" + this.brandType + ", category is :" + this.category;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Forever21) {
            Forever21 col = (Forever21) obj;
            if (Objects.equals(col.brandName, this.brandName)) {
                System.out.println("Forever 21 clothes are matching");
                return true;
            }
        }
        return false;
    }
}
