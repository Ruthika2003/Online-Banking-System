package com.company;

import java.util.ArrayList;

public class Account {
    private final String accountNumber;
    private final String accountHolderName;
    private double balance;
    private final ArrayList<Transaction> transactions;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction(amount, TransactionType.DEPOSIT));
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction(amount, TransactionType.WITHDRAWAL));
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void printBalance() {
        System.out.println("Account Balance: " + balance);
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
