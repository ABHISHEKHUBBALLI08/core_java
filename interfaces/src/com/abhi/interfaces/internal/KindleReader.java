package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.EbookReader;

public class KindleReader implements EbookReader {

    @Override
    public void openBook() {
        System.out.println("Opening ebook on Kindle.");
    }

    @Override
    public void closeBook() {
        System.out.println("Closing ebook on Kindle.");
    }

    @Override
    public void bookmarkPage() {
        System.out.println("Bookmarking page on Kindle.");
    }

    @Override
    public void increaseFontSize() {
        System.out.println("Increasing font size on Kindle.");
    }

    @Override
    public void decreaseFontSize() {
        System.out.println("Decreasing font size on Kindle.");
    }

    @Override
    public void highlightText() {
        System.out.println("Highlighting text on Kindle.");
    }

    @Override
    public void searchForText() {
        System.out.println("Searching for text on Kindle.");
    }
}
