package com.practice;

public class Main {

    public static void main(String[] args) {

        Account ac1 = new Account();
        ac1.deposit(100.00);
        ac1.withdraw(50.00);
        ac1.deposit(100.00);
        ac1.deposit(100.00);
        ac1.withdraw(50.00);
        ac1.withdraw(50.00);
        ac1.withdraw(50.00);
        ac1.checkBalance();
        ac1.printTransaction();
    }
}
