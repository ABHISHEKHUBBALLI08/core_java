package com.abhi.toy.dto;

public class ToyDto {

    private String name;
    private String type;
    private String price;
    private String selling;
    private String mrp;
    private String description;
    private String brand;
    private String quantity;
    private String color;
    private String weight;
    private String date;
    private String  warranty;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSelling(String selling) {
        this.selling = selling;
    }

    public void setMrp(String mrp) {
        this.mrp = mrp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public String getDate() {
        return date;
    }

    public String getMrp() {
        return mrp;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getSelling() {
        return selling;
    }

    public String getWarranty() {
        return warranty;
    }

    public String getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "ToyDto{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", selling='" + selling + '\'' +
                ", mrp='" + mrp + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", quantity='" + quantity + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", date='" + date + '\'' +
                ", warranty='" + warranty + '\'' +
                '}';
    }
}
