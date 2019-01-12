package com.problems.solutions.module3.oops.polymorphism.bankaccount;

import java.util.Scanner;

/**
 * Created by nandigama on 1/7/2019.
 */
public class BankAccountTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Type :");
        String accType = sc.next();
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter Account Number");
        String accNum = sc.next();

        if (AccountType.CURRENT.name().equals(accType)) {
            CurrentAccount currentAccount = new CurrentAccount(accNum, name, AccountType.CURRENT);
            System.out.println("Enter Amount to be deposited:");
            double amount = sc.nextDouble();
            currentAccount.deposit(amount);

            System.out.println("Enter Amount to withdraw:");
            amount = sc.nextDouble();
            if (currentAccount.withdraw(amount)) {
                System.out.println("Transaction successful. Remaining balance is: " + currentAccount.getAmount());
            } else {
                System.out.println("Sorry, transaction failed. Insufficient funds, balance is: "
                        + currentAccount.getAmount());
            }
        } else {
            SavingsAccount savingsAccount = new SavingsAccount(accNum, name, AccountType.SAVINGS);
            System.out.println("Enter Amount to be deposited:");
            double amount = sc.nextDouble();
            savingsAccount.deposit(amount);

            System.out.println("Enter Amount to withdraw:");
            amount = sc.nextDouble();
            if (savingsAccount.withdraw(amount)) {
                System.out.println("Transaction successful. Remaining balance is: " + savingsAccount.getAmount());
            } else {
                System.out.println("Sorry, transaction failed. Insufficient funds, balance is: "
                        + savingsAccount.getAmount());
            }

            System.out.println("What is my interest amount?");
            System.out.println(savingsAccount.calculateInterest());
        }
        sc.close();
    }
}
