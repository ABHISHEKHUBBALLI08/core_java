package com.abhi.encapsulation.internal;

public class KeyDetails {
    public void keyInfo() {
        System.out.println(" keychain contains important keys");
        KeyChain keyChain = new KeyChain();
        keyChain.setKeyId(202);
        keyChain.setKeyName("garage");
        keyChain.setMaterial("aluminum");
        keyChain.setColor("black");
        keyChain.setUsage("garage open");
        keyChain.getKeyId();
        keyChain.getKeyName();
        keyChain.getMaterial();
        keyChain.getColor();
        keyChain.getUsage();
    }
}
