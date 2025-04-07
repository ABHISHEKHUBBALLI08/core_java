package com.abhi.god.internal;

public class Powder {
    public  void brand(){
        System.out.println("brand running in Powder");
    }
    private  void use(){
        System.out.println("use running in Powder");
    }
    void cost(){
        use();
        System.out.println("cost running in Powder");
    }
}
