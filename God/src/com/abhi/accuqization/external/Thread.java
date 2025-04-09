package com.abhi.accuqization.external;

import com.abhi.accuqization.internal.Cotton;
import com.abhi.accuqization.internal.Material;

public class Thread extends Cotton {
    public void thread() {
        System.out.println("running in Thread");
        Thread thread = new Thread();
        Cotton cotton = new Thread();
        Material material = new Thread();
    }
}
