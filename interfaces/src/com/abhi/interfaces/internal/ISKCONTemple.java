package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.Temple;

public class ISKCONTemple implements Temple {

    @Override
    public void ringBell() {
        System.out.println("Ringing the bell at ISKCON Temple");
    }

    @Override
    public void offerPrayers() {
        System.out.println("Offering prayers at ISKCON Temple");
    }

    @Override
    public void donate() {
        System.out.println("Donating to ISKCON Temple");
    }

    @Override
    public void attendAarti() {
        System.out.println("Attending aarti at ISKCON Temple");
    }

    @Override
    public void removeFootwear() {
        System.out.println("Removing footwear before entering ISKCON Temple");
    }
}
