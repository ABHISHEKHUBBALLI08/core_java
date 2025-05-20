package com.abhi.dto;

public class FurnitureDto {
    private String brand;
    private String material;
    private String size;
    private String model;
    private String benefits;

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBenefits() {
        return benefits;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "FurnitureDto{" +
                "brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", model='" + model + '\'' +
                ", benefits='" + benefits + '\'' +
                '}';
    }
}
