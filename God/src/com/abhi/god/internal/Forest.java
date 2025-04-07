package com.abhi.god.internal;

public class Forest {
    public  void noOfTrees(){
        System.out.println("noOfTrees running in forest");
    }
    private  void place(){
        System.out.println("place running in forest");
    }
    void totalArea(){
        place();
        System.out.println("TotalArea running in forest");
    }
}
