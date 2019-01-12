package com.problems.solutions.module2.facorial;

/**
 * Created by nandigama on 1/5/2019.
 */
public class FactInt {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
