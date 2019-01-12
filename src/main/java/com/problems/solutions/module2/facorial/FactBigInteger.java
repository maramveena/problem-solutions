package com.problems.solutions.module2.facorial;

import java.math.BigInteger;

/**
 * Created by nandigama on 1/5/2019.
 */
public class FactBigInteger {
    public static BigInteger factorial(int n) {
        BigInteger fact = new BigInteger("1"); //  it is like int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));// it is like fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(50));
    }
}
