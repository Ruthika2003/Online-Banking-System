package com.company;

public class Transaction {
    private final double amount;
    private final TransactionType type;

    public Transaction(double amount, TransactionType type) {
        this.amount = amount;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " - Amount: " + amount;
    }
}
