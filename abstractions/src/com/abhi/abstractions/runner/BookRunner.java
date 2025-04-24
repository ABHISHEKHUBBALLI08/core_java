package com.abhi.abstractions.runner;

import com.abhi.abstractions.internal.Book;
import com.abhi.abstractions.internal.FictionBook;
import com.abhi.abstractions.internal.TextBook;

public class BookRunner {
    public static void main(String[] args) {
        Book fiction = new FictionBook();
        Book textbook = new TextBook();

        BookUpdate update1 = new BookUpdate(fiction);
        update1.bookInfo();

        BookUpdate update2 = new BookUpdate(textbook);
        update2.bookInfo();
    }
}
