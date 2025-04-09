package com.abhi.accuqization.internal;

public class Person extends Human {
    public void person() {
        System.out.println("running in Person");
        Person person = new Person();
        Human human = new Person();
    }
}
