package com.hexaware.dto;
import java.util.List;
public class Bank {

    public String name;

    public List<BankAccount>accountlist;

    public Bank(String name, List<BankAccount> accountlist) {
        this.name = name;
        this.accountlist = accountlist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BankAccount> getAccountlist() {
        return accountlist;
    }

    public void setAccountlist(List<BankAccount> accountlist) {
        this.accountlist = accountlist;
    }
}
