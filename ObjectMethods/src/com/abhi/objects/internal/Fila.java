package com.abhi.objects.internal;

import java.util.Objects;

public class Fila {
    private String brandName;
    private int foundYr;
    private String brandType;
    private String category;

    public Fila(String brandName, int foundYr, String brandType, String category) {
        this.brandName = brandName;
        this.foundYr = foundYr;
        this.brandType = brandType;
        this.category = category;
    }

    @Override
    public String toString() {
        System.out.println("running toString in Fila");
        return "brand name :" + this.brandName + ", founded year:" + this.foundYr +
                ", brand type is:" + this.brandType + ", category is :" + this.category;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fila) {
            Fila fila = (Fila) obj;
            if (Objects.equals(fila.brandName, this.brandName)) {
                System.out.println("fila shoes are matching");
                return true;
            }
        }
        return false;
    }
}
