package com.abhi.encapsulation.external;

import com.abhi.encapsulation.internal.PostOffice;

public class PostDelivery {
    public void deliveryStatus() {
        System.out.println(" post office manages deliveries across cities");
        PostOffice postOffice = new PostOffice();
        postOffice.getBranchCode();
        postOffice.getLocation();
        postOffice.getPostMaster();
        postOffice.getServiceType();
        postOffice.getOpeningHours();
    }
}
