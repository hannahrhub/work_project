package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Savings extends Account {


    public static void main(String[] args) {
        Savings sa1 = new Savings();
        sa1.deposit(100.00);
        sa1.withdraw(30.00);
        sa1.deposit(30.00);
        sa1.deposit(100.00);
        sa1.deposit(80.00);
        sa1.withdraw(50.00);
        sa1.withdraw(50.00);
        sa1.checkBalance();
        sa1.printTransaction();
    }


    @Override
    public boolean deposit(double amount) {
        if (amount >= 50.00) {
            super.balance += amount;
            super.transactions.add(amount);
            System.out.printf("+£%.2f\n", amount);
        } else if (amount < 50.00) {
            System.out.println("Need to deposit more than £50.00");
            return false;
    } return true; }}





