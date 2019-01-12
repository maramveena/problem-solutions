package com.edureka.assignments.module4.packagedemo1;

import java.math.BigInteger;

/**
 * Created by nandigama on 1/9/2019.
 */
public class FactorialMethod {

    public BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String[] args) {
        FactorialMethod factorialMethod = new FactorialMethod();
        System.out.println(factorialMethod.factorial(0));
    }
}
