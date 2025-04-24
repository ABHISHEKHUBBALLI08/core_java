package com.abhi.abstractions.runner;

import com.abhi.abstractions.internal.Book;

public class BookUpdate {
    private Book book;

    public BookUpdate(Book book) {
        this.book = book;
        System.out.println("Book instance created...");
    }

    public void bookInfo() {
        if (this.book != null) {
            this.book.info();
        } else {
            System.out.println("Book is null");
        }
    }
}
