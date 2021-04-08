package com.company;

public class Account {
    private String accountName;
    private double accountBalance;

    public Account(String accountName, double accountBalance)
    {
        if(accountBalance <0){
            System.out.println("Account balance can not be less then zero. \nBalance set to 0.0$");

        }
        else
        {
            this.accountName = accountName;
            this.accountBalance = accountBalance;
            System.out.println("Account initialized. \nBalance set to $" + this.accountBalance);
        }
    }

    public String getAccountName()
    {
        return accountName;
    }

    public double getAccountBalance()
    {
        return accountBalance;
    }

    public void transferFounds(double withdrawal)
    {
        if(withdrawal>this.accountBalance)
        {
            System.out.println("Unable to transfer $"+withdrawal+". Amount is insuficient");
        }
        else if(withdrawal<0)
        {
            System.out.println("Transfer amount must be greter then zero. Transfer failed.");
        }
        else
        {
            accountBalance -= withdrawal;
            System.out.println("Transfer is successful. \nCurrent balance is $" + accountBalance);
        }
    }

    public void depositFounds(double deposit)
    {
        if(deposit<0)
        {
            System.out.println("Amount deposited must be greater than zero.");
        }
        else
        {
            this.accountBalance += deposit;
            System.out.println("Deposit of $" + deposit + " is successfull. \nCurrent balance is $" + accountBalance);
        }
    }
}
