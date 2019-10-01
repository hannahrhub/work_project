package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Account {
    protected double balance;
    private double intialBalance;
    protected List<Double> transactions = new ArrayList<>();

    public Account() {
        intialBalance = 0.00;
        balance = 0.00;

    }


    public boolean deposit(double amount) {
        balance += amount;
        transactions.add(amount);
        System.out.printf("+£%.2f\n", amount);
        return true;


    }

    public boolean withdraw(double amount) {
        if (amount > 0.00) {
            balance -= amount;
            transactions.add(amount);
            System.out.printf("-£%.2f\n", amount);
            return true;
        } else {
            System.out.println("Insufficient funds");
            return true;
        }
    }

    public void checkBalance() {
        if (balance > 0) {
            System.out.printf("Your balance is: £%.2f\n", balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }


    public void printTransaction() {
        for (Double element : transactions) {
            System.out.printf("%.2f ", element);
        }
    }
}

