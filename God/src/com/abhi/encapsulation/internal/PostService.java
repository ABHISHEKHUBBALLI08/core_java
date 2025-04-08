package com.abhi.encapsulation.internal;

public class PostService {
    public void services() {
        System.out.println(" post office provides multiple services");
        PostOffice postOffice = new PostOffice();
        postOffice.setBranchCode(702);
        postOffice.setLocation("Mysore");
        postOffice.setPostMaster("Mrs. Nandini");
        postOffice.setServiceType("Registered Post");
        postOffice.setOpeningHours("10 AM - 4 PM");
        postOffice.getBranchCode();
        postOffice.getLocation();
        postOffice.getPostMaster();
        postOffice.getServiceType();
        postOffice.getOpeningHours();
    }
}
