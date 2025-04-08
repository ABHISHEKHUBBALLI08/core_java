package com.abhi.encapsulation.external;

import com.abhi.encapsulation.internal.KeyChain;

public class KeyChainHolder {
    public void holderDetails() {
        System.out.println(" keychain holder is made of leather");
        KeyChain keyChain = new KeyChain();
        keyChain.getKeyId();
        keyChain.getKeyName();
        keyChain.getMaterial();
        keyChain.getColor();
        keyChain.getUsage();
    }
}
