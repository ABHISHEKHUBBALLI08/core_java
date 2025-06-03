package com.abhi.toy.utils;

public class ToyDatabase {
    public ToyDatabase(){
        System.out.println("database constructor ");
    }
    public static final String url="jdbc:mysql://127.0.0.1:3306/?user=root";
    public static final String userName="root";
    public static final String password="abhi";
    public static final String driverName="com.mysql.cj.jdbc.Driver";
}
