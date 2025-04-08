package com.abhi.encapsulation.internal;

public class KeyChain {
    private int keyId = 101;
    private String keyName = "skeleton";
    private String material = "steel";
    private String color = "silver";
    private String usage = "door unlock";

    void setKeyId(int keyId) {
        this.keyId = keyId;
    }

    void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setUsage(String usage) {
        this.usage = usage;
    }

    public void getKeyId() {
        System.out.println(keyId);
    }

    public void getKeyName() {
        System.out.println(keyName);
    }

    public void getMaterial() {
        System.out.println(material);
    }

    public void getColor() {
        System.out.println(color);
    }

    public void getUsage() {
        System.out.println(usage);
    }
}
