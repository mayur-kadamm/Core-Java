package com.mayur.codes;

// Encapsulation With Validation
class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        if (balance >= 0)
            this.balance = balance;
        else
            System.out.println("Invalid balance!");
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(5000);
        System.out.println("Balance: " + b.getBalance());

        b.setBalance(-100); // invalid
    }
}

