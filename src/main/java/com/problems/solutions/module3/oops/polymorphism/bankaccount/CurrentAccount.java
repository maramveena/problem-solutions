package com.edureka.assignments.module3.oops.polymorphism.bankaccount;

/**
 * Created by nandigama on 1/7/2019.
 */
public final class CurrentAccount extends Account {
    private final static double MINIMUM_BALANCE = 1000;

    /**
     * Constructor to setup member variables.
     *
     * @param number       Account Number.
     * @param customerName Customer Name.
     * @param type         Account Type.
     */
    public CurrentAccount(String number, String customerName, AccountType type) {
        super(number, customerName, type);
    }

    @Override
    public boolean withdraw(double amount) {
        if (MINIMUM_BALANCE < (getAmount() - amount)) {
            setAmount(amount);
            return true;
        }
        return false;
    }
}
