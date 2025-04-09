package com.abhi.accuqization.external;

import com.abhi.accuqization.internal.Security;

public class Lock extends Security {
    public void lock() {
        System.out.println("running in Lock");
        Lock lock = new Lock();
        Security security = new Lock();
    }
}
