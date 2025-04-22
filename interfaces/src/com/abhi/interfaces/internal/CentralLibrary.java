package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.Library;

public class CentralLibrary implements Library {

    @Override
    public void issueBook() {
        System.out.println("Issuing book from Central Library");
    }

    @Override
    public void returnBook() {
        System.out.println("Returning book to Central Library");
    }
    @Override
    public void readBook() {
        System.out.println("Reading book in Central Library");
    }

    @Override
    public void payFine() {
        System.out.println("Paying fine at Central Library");
    }

    @Override
    public void getMembership() {
        System.out.println("Getting membership at Central Library");
    }
}
