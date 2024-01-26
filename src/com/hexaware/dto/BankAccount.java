package com.hexaware.dto;

public class BankAccount {
    private double accountNumber;
    private String holderName;
    private String type;
    private double balance;

    public BankAccount(double accountNumber, String holderName, String type, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.type = type;
        this.balance = balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", holderName='" + holderName + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
}
