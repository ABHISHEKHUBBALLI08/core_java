package com.abhi.objects.internal;

import java.util.Objects;

public class Nike {
    private String brandName;
    private int foundYr;
    private String brandType;
    private String category;
    public Nike(String brandName,int foundYr, String brandType,String category){
        this.brandName=brandName;
        this.foundYr=foundYr;
        this.brandType=brandType;
        this.category=category;
    }

    @Override
    public String toString() {
        System.out.println("running toString in Nike");
        return "brand name :"+this.brandName+", founded year:"+this.foundYr+", brand type is:"+this.brandName+"category is :"+this.category;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj !=null && obj instanceof Nike){
            Nike nike=(Nike) obj;
            if(Objects.equals(nike.brandName,this.brandName)){
                System.out.println("nike shoe are matching ");
                return true;
            }
        }
        return false;
    }
}
