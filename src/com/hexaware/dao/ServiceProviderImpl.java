package com.hexaware.dao;

import com.hexaware.dto.Bank;
import com.hexaware.dto.BankAccount;

public class ServiceProviderImpl implements IServiceProvider{

    Bank myBank;
    public ServiceProviderImpl() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ServiceProviderImpl(Bank myBank) {
        super();
        this.myBank = myBank;
    }
    @Override
    public BankAccount searchAccount(long accountNumber) {
        BankAccount reqAccount=null;
        for(BankAccount account: myBank.getAccountlist())
        {
            if(account.getAccountNumber()==accountNumber)
            {
                reqAccount=account;
                break;
            }
        }
        return reqAccount;
    }

    @Override
    public double checkBalance(long accountNumber) {
        double balanceAmount=-1;
        BankAccount reqAccount=searchAccount(accountNumber);
        if(reqAccount!=null)
        {
            balanceAmount= reqAccount.getBalance();
        }
        return balanceAmount;
    }

    @Override
    public boolean deposit(long accountNumber, double amount) {
        boolean depositstatus=false;
        BankAccount reqAccount=searchAccount(accountNumber);
        if(amount>0)
        {
            if(reqAccount==null)
            {
                System.out.println("invalid account number|user does not exist");

            }else {
                reqAccount.setBalance(reqAccount.getBalance()+amount);
                depositstatus=true;
            }
        }

        return depositstatus;
    }

    @Override
    public boolean withdraw(long accountNumber, double amount) {
        BankAccount reqAccount=searchAccount(accountNumber);
        boolean withdrawStatus=false;
        if(reqAccount==null)
        {
            System.out.println("Account doesn't exist");
        }else {
            if (amount < 0) {
                System.out.println("Invalid amount.....");
            } else if (reqAccount.getBalance() < amount) {
                System.out.println("Insufficient funds...");
            } else {
                reqAccount.setBalance(reqAccount.getBalance() - amount);
                withdrawStatus = true;
            }
        }
        return withdrawStatus;
    }

    @Override
    public boolean createAccount(BankAccount newAcc) {
        BankAccount lastAccObj = myBank.getAccountlist().get(myBank.getAccountlist().size() - 1);
        boolean status = false;
        BankAccount newAccObj = new BankAccount(lastAccObj.getAccountNumber() + 1, newAcc.getHolderName(),
                newAcc.getType(), newAcc.getBalance());
        myBank.getAccountlist().add(newAccObj);
        status = true;
        return status;
    }

    @Override
    public boolean removeAccount(long accountNumber) {
        BankAccount reqAccount = searchAccount(accountNumber);
        boolean removeStatus = false;
        if (reqAccount != null) {
            myBank.getAccountlist().remove(reqAccount);
            removeStatus = true;
        }
        return false;
    }


}
