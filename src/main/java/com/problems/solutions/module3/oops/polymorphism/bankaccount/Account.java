package com.edureka.assignments.module3.oops.polymorphism.bankaccount;

/**
 * Created by nandigama on 1/7/2019.
 */
public abstract class Account {
    private String number;
    private double amount;
    private String customerName;
    private AccountType type;

    /**
     * Constructor to setup member variables.
     * @param number Account Number.
     * @param customerName Customer Name.
     * @param type Account Type.
     */
    public Account(String number, String customerName, AccountType type) {
        this.number = number;
        this.customerName = customerName;
        this.type = type;
    }

    /**
     * Add amount to account balance.
     * @param amount Amount.
     */
    public void deposit(double amount) {
        this.amount += amount;
    }

    /**
     * Returns TRUE if requested amount is larger than MINIMUM_BALANCE, otherwise returns FALSE.
     * @param amount Requested amount.
     * @return TRUE or FALSE.
     */
    public abstract boolean withdraw(double amount);

    /**
     * Subtracts amount from account balance. This method should be called only when withdraw money.
     * @param amount Amount.
     */
    public void setAmount(double amount) {
        if (this.amount > 0.0)
            this.amount -= amount;
    }

    public String getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public AccountType getType() {
        return type;
    }

}
