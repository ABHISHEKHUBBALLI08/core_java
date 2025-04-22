package com.abhi.interfaces.rules;

public interface EbookReader {
    void openBook();
    void closeBook();
    void bookmarkPage();
    void increaseFontSize();
    void decreaseFontSize();
    void highlightText();
    void searchForText();
}
