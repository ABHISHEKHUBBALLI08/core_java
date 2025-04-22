package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.Bank;

public class ICICIBank implements Bank {

    @Override
    public void openAccount() {
        System.out.println("Opening account in ICICI Bank.");
    }

    @Override
    public void closeAccount() {
        System.out.println("Closing account in ICICI Bank.");
    }

    @Override
    public void depositMoney() {
        System.out.println("Depositing money into ICICI Bank.");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Withdrawing money from ICICI Bank.");
    }

    @Override
    public void checkAccountBalance() {
        System.out.println("Checking account balance in ICICI Bank.");
    }

    @Override
    public void applyLoan() {
        System.out.println("Applying for loan at ICICI Bank.");
    }

    @Override
    public void approveLoan() {
        System.out.println("Loan approved by ICICI Bank.");
    }

    @Override
    public void transferFunds() {
        System.out.println("Transferring funds from ICICI Bank.");
    }

    @Override
    public void issueDebitCard() {
        System.out.println("Issuing debit card in ICICI Bank.");
    }
}
