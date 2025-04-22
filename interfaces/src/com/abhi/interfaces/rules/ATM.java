package com.abhi.interfaces.rules;

public interface ATM {
    void insertCard();
    void enterPin();
    void checkBalance();
    void withdrawCash();
    void depositCash();
    void transferMoney();
    void printReceipt();
    void ejectCard();
    void cancelTransaction();
}
