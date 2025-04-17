package com.abhi.objects.internal;

import java.util.Objects;

public class OnRunning {
    private String brandName;
    private int foundYr;
    private String brandType;
    private String category;

    public OnRunning(String brandName, int foundYr, String brandType, String category) {
        this.brandName = brandName;
        this.foundYr = foundYr;
        this.brandType = brandType;
        this.category = category;
    }

    @Override
    public String toString() {
        System.out.println("running toString in OnRunning");
        return "brand name :" + this.brandName + ", founded year:" + this.foundYr +
                ", brand type is:" + this.brandType + ", category is :" + this.category;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof OnRunning) {
            OnRunning on = (OnRunning) obj;
            if (Objects.equals(on.brandName, this.brandName)) {
                System.out.println("on running shoes are matching");
                return true;
            }
        }
        return false;
    }
}
