package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.ATM;

public class HDFCATM implements ATM {

    @Override
    public void insertCard() {
        System.out.println("Card inserted in HDFC ATM.");
    }

    @Override
    public void enterPin() {
        System.out.println("Pin entered in HDFC ATM.");
    }

    @Override
    public void checkBalance() {
        System.out.println("Checking balance at HDFC ATM.");
    }

    @Override
    public void withdrawCash() {
        System.out.println("Withdrawing cash from HDFC ATM.");
    }

    @Override
    public void depositCash() {
        System.out.println("Depositing cash into HDFC ATM.");
    }

    @Override
    public void transferMoney() {
        System.out.println("Transferring money at HDFC ATM.");
    }

    @Override
    public void printReceipt() {
        System.out.println("Printing receipt at HDFC ATM.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Ejecting card from HDFC ATM.");
    }

    @Override
    public void cancelTransaction() {
        System.out.println("Transaction canceled at HDFC ATM.");
    }
}
