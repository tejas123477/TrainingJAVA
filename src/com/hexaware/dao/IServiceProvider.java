package com.hexaware.dao;

import com.hexaware.dto.BankAccount;

public interface IServiceProvider {

    public BankAccount searchAccount(long accountNumber);

    public double checkBalance(long accountNumber);

    public boolean deposit(long accountNumber, double amount);

    public boolean withdraw(long accountNumber, double amount);

    public boolean createAccount(BankAccount newAcc);

    public boolean removeAccount(long accountNumber);

}
